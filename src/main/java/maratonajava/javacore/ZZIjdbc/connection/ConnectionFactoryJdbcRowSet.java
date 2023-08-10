package maratonajava.javacore.ZZIjdbc.connection;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class ConnectionFactoryJdbcRowSet {
    public static JdbcRowSet getJdbcRowSet() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/anime_store";
        String username = "root";
        String password = "root";

        JdbcRowSet jdbcRowSet = RowSetProvider.newFactory().createJdbcRowSet();
        jdbcRowSet.setUrl(url);
        jdbcRowSet.setUsername(username);
        jdbcRowSet.setPassword(password);
        return jdbcRowSet;
    }
}
