package maratonajava.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.connection.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class ProducerRepository {
    public static void save(Producer producer) {
        String entity = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('%s');"
                .formatted(producer.getName());

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int affectedRows = stmt.executeUpdate(entity);
            log.info("Introduced new entity in the database. Row affected: '{}'"
                    , affectedRows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void delete(int id) {
        String entity = "DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');"
                .formatted(id);

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int affectedRows = stmt.executeUpdate(entity);
            log.info("Deleted ID: '{}' producer from database. Row affected: '{}'"
                    , id, affectedRows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void update(Producer producer) {
        String entity = "UPDATE `anime_store`.`producer` SET `name` = '%s' WHERE (`id` = '%d');"
                .formatted(producer.getName(), producer.getId());
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int affectedRows = stmt.executeUpdate(entity);
            log.info("Updated ID: '{}' producer from database. Rows affected: '{}' "
                    , producer.getId(), affectedRows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findAll() {
        String sql = "SELECT id, name from anime_store.producer;";
        List<Producer> allProducersFromRepository = new ArrayList<>();
        try(Connection connection = ConnectionFactory.getConnection();
            Statement stmt = connection.createStatement();
            ResultSet resultSet = stmt.executeQuery(sql)) {

            while (resultSet.next()) {
                int idDB = resultSet.getInt("id");
                String nameDB = resultSet.getString("name");
                Producer producerFromDB = Producer.builder().id(idDB).name(nameDB).build();
                allProducersFromRepository.add(producerFromDB);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return allProducersFromRepository;
    }
}
