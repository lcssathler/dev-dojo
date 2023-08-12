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
}
