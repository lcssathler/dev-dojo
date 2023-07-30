package maratonajava.javacore.ZZIjdbc.repository;

import maratonajava.javacore.ZZIjdbc.connection.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.domain.Producer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ProducerRepository {
    public static void save(Producer producer) {
        String entity = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ('Mappa');"
                .formatted(producer.getName());

        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement()) {
            int affectedRows = stmt.executeUpdate(entity);
            System.out.println(affectedRows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
