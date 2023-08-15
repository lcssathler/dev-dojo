package maratonajava.javacore.ZZJcrud.repository;



import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import maratonajava.javacore.ZZJcrud.domain.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static List<Producer> findByName(String name) {
        System.out.println("-".repeat(44));
        log.info("Find Producer by name '{}'", name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = createPreparedStatementByName(connection, name);
             ResultSet resultSet = stmt.executeQuery()) {

            while (resultSet.next()) {
                int idDB = resultSet.getInt("id");
                String nameDB = resultSet.getString("name");
                Producer producerDB = Producer.builder().id(idDB).name(nameDB).build();
                producerList.add(producerDB);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producerList;
    }

    private static PreparedStatement createPreparedStatementByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, String.format("%%%s%%", name));
        return preparedStatement;
    }

    public static void deleteById(Integer id) {
        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement ps = deleteByIdPreparedStatement(connection, id)) {
            ps.execute();
            log.info("Deleted Producer '{}' form database", id);
        } catch (SQLException e) {
            log.info("Error while trying to delete Producer '{}'", id, e);
        }

    }

    private static PreparedStatement deleteByIdPreparedStatement(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`producer` WHERE (`id` = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Producer producer) {
        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement ps = savePreparedStatement(connection, producer)) {
            ps.execute();
            log.info("Saved Producer '{}'", producer.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement savePreparedStatement(Connection connection, Producer producer) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES (?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, producer.getName());
        return ps;
    }
}
