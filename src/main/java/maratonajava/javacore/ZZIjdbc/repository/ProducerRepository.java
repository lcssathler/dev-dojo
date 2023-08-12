package maratonajava.javacore.ZZIjdbc.repository;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.connection.ConnectionFactory;
import maratonajava.javacore.ZZIjdbc.domain.Producer;

import java.sql.*;
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
        log.info("Finding all entities from database...");
        return findByName("");
    }

    public static List<Producer> findByName(String name) {
        log.info("Finding entity by name from database...");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';"
                .formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {
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

    public static void showProducerMetaData() {
        log.info("Showing Producer metadatas...");
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
            resultSet.next();
            int columnCount = rsMetaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                log.info("Table name: '{}'", rsMetaData.getTableName(i));
                log.info("Column name: '{}'", rsMetaData.getColumnName(i));
                log.info("Column size: '{}'", rsMetaData.getColumnDisplaySize(i));
                log.info("Column size: '{}'", rsMetaData.getColumnTypeName(i));
                System.out.println("-=".repeat(20));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showDriverMetaData() {
        log.info("Showing Driver metadatas...");
        try (Connection connection = ConnectionFactory.getConnection()) {
            DatabaseMetaData dbMetaData = connection.getMetaData();

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)) {
                log.info("Supports TYPE_FORWARD_ONLY");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)) {
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }

            if (dbMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)) {
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (dbMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    log.info("And supports CONCUR_UPDATABLE");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void showTypeScrollWorking() {
        String sql = "SELECT * FROM anime_store.producer;";
        try (Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            log.info("First row? '{}'", rs.first());
            log.info("Row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            System.out.println("=-".repeat(35));

            log.info("Last row? '{}'", rs.last());
            log.info("Row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            System.out.println("=-".repeat(35));

            log.info("Absolute row? '{}'", rs.absolute(2));
            log.info("Row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            System.out.println("=-".repeat(35));

            log.info("Relative row? '{}'", rs.relative(-1));
            log.info("Row number: '{}'", rs.getRow());
            log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            System.out.println("=-".repeat(35));

            log.info("Is first row? '{}'", rs.isFirst());
            log.info("Row number: '{}'", rs.getRow());
            System.out.println("=-".repeat(35));

            log.info("Is last row? '{}'", rs.isLast());
            log.info("Row number: '{}'", rs.getRow());
            System.out.println("=-".repeat(35));

            log.info("Last row? '{}'", rs.first());
            rs.previous();
            while (rs.next()) {
                log.info(Producer.builder().id(rs.getInt("id")).name(rs.getString("name")).build());
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNameAndUpdateToUpperCase(String name) {
        log.info("Finding entity by name and updating name to upper case");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (final Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                rs.updateString("name", rs.getString("name").toLowerCase());
                rs.cancelRowUpdates();
                rs.updateRow();
                Producer producerDB = Producer.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .build();
                producerList.add(producerDB);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producerList;
    }

    public static List<Producer> insertNameIfNotFound(String name) {
        log.info("Inserting new name if not found in database");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        List<Producer> producerList = new ArrayList<>();
        try (final Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {

            if (rs.next()) {
                log.info("Value already exists!");
                return producerList;
            }

            rs.moveToInsertRow();
            rs.updateString("name", name);
            rs.insertRow();
            log.info("Producer '{}'added", rs.getString("name"));

            rs.first();
            Producer producerDB = Producer.builder()
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .build();
            producerList.add(producerDB);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producerList;
    }

    public static void findByNameAndDelete(String name) {
        log.info("Deleting name if it exists");
        String sql = "SELECT * FROM anime_store.producer where name like '%%%s%%';".formatted(name);
        try (final Connection connection = ConnectionFactory.getConnection();
             Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                log.info("Deleting Producer '{}'", rs.getString("name"));
                rs.deleteRow();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<Producer> findByNamePreparedStatement(String name) {
        log.info("Finding entity by name using PreparedStatement from database...");
        List<Producer> producerList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = preparedStatementFindByName(connection, name);
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

    private static PreparedStatement preparedStatementFindByName(Connection conn, String name) throws SQLException {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, String.format("%%%s%%", name));
        return preparedStatement;
    }

    public static void updatePreparedStatement(Producer producer) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = preparedStatementUpdate(connection, producer)) {

            int affectedRows = ps.executeUpdate();
            log.info("Updated ID: '{}' producer from database using PreparedStatement. Rows affected: '{}' "
                    , producer.getId(), affectedRows);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement preparedStatementUpdate(Connection conn, Producer producer) throws SQLException {
        String sql = "UPDATE `anime_store`.`producer` SET `name` = ? WHERE (`id` = ?);";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, producer.getName());
        preparedStatement.setInt(2, producer.getId());
        return preparedStatement;
    }

    public static void saveTransactionPreparedStatement(List<Producer> producers) {
        try (Connection connection = ConnectionFactory.getConnection()) {
            connection.setAutoCommit(false);
            preparedStatementSaveTransaction(connection, producers);
            connection.commit();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void preparedStatementSaveTransaction(Connection conn, List<Producer> producers) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`producer` (`name`) VALUES ( ? );";
        boolean isRollback = false;
        for (Producer producer : producers) {
            try(PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, producer.getName());
                if (producer.getName().equals("Telecine")) {
                    throw new SQLException("Can't save producer 'Telecine'!");
                }
                log.info("Saving Producer '{}'", producer.getName());
                ps.execute();
            } catch (SQLException e) {
                e.printStackTrace();
                isRollback = true;
            }
            if (isRollback){
                log.warn("Transaction is going to rollback");
                conn.rollback();
            }
        }
    }
}