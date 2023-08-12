package maratonajava.javacore.ZZIjdbc.repository;

import maratonajava.javacore.ZZIjdbc.connection.ConnectionFactoryCachedRowSet;
import maratonajava.javacore.ZZIjdbc.connection.ConnectionFactoryJdbcRowSet;
import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.listener.CustomRowSetListener;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProduceRepositoryRowSet {
    public static List<Producer> findByNameRowSet(String name) {
        String sql = "SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producerList = new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactoryJdbcRowSet.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setString(1, String.format("%%%s%%", name));
            jrs.execute();

            while (jrs.next()) {
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producerList.add(producer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producerList;
    }

    public static void updateRowSet(Producer producer) {
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";
        try (JdbcRowSet jrs = ConnectionFactoryJdbcRowSet.getJdbcRowSet()) {
            jrs.addRowSetListener(new CustomRowSetListener());
            jrs.setCommand(sql);
            jrs.setInt(1, producer.getId());
            jrs.execute();

            while (!jrs.next()) return;

            jrs.updateString("name", producer.getName());
            jrs.updateRow();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void updateCachedRowSet(Producer producer) {
        String sql = "SELECT * FROM anime_store.producer WHERE (`id` = ?);";
        try (CachedRowSet crs = ConnectionFactoryCachedRowSet.getCachedRowSet()) {
            crs.addRowSetListener(new CustomRowSetListener());
            crs.setCommand(sql);
            crs.setInt(1, producer.getId());
            crs.execute();

            while (!crs.next()) return;

            crs.updateString("name", producer.getName());
            crs.updateRow();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
