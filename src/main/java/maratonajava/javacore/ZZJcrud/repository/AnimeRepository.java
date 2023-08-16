package maratonajava.javacore.ZZJcrud.repository;


import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZJcrud.conn.ConnectionFactory;
import maratonajava.javacore.ZZJcrud.domain.Anime;
import maratonajava.javacore.ZZJcrud.domain.Producer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Log4j2
public class AnimeRepository {
    public static List<Anime> findByName(String name) {
        System.out.println("-".repeat(44));
        log.info("Find Anime by name '{}'", name);
        List<Anime> animeList = new ArrayList<>();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement stmt = createPreparedStatementByName(connection, name);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Producer producerDB = Producer.builder()
                        .id(rs.getInt("producer_id"))
                        .name(rs.getString("producer_name"))
                        .build();

                Anime animeDB = Anime.builder()
                        .id(rs.getInt("id"))
                        .name(rs.getString("name"))
                        .producer(producerDB)
                        .build();
                animeList.add(animeDB);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return animeList;
    }

    private static PreparedStatement createPreparedStatementByName(Connection conn, String name) throws SQLException {
        String sql = """
                     SELECT a.id, a.name, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                     anime_store.producer p on a.producer_id = p.id
                     where a.name like ?;
                     """;
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setString(1, String.format("%%%s%%", name));
        return preparedStatement;
    }

    public static Anime findById(Integer id) {
        Anime.AnimeBuilder foundAnime = Anime.builder();
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = findByIdPreparedStatement(connection, id)) {

            ResultSet rs = ps.executeQuery();
            if (!rs.next()) throw new IllegalArgumentException("Anime not found by id!");
            Producer producerDB = Producer.builder()
                    .id(rs.getInt("producer_id"))
                    .name(rs.getString("producer_name"))
                    .build();

            foundAnime
                    .id(rs.getInt("id"))
                    .name(rs.getString("name"))
                    .producer(producerDB);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return foundAnime.build();
    }

    private static PreparedStatement findByIdPreparedStatement(Connection connection, Integer id) throws SQLException {
        String sql = """
                     SELECT a.id, a.name, a.producer_id, p.name as 'producer_name' FROM anime_store.anime a inner join
                     anime_store.producer p on a.producer_id = p.id
                     where a.id = ?;
                     """;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void deleteById(Integer id) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = deleteByIdPreparedStatement(connection, id)) {
            ps.execute();
            log.info("Deleted Anime '{}' form database", id);
        } catch (SQLException e) {
            log.info("Error while trying to delete Anime '{}'", id, e);
        }

    }

    private static PreparedStatement deleteByIdPreparedStatement(Connection connection, Integer id) throws SQLException {
        String sql = "DELETE FROM `anime_store`.`anime` WHERE (`id` = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);
        return ps;
    }

    public static void save(Anime anime) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = savePreparedStatement(connection, anime)) {
            ps.execute();
            log.info("Saved Anime '{}'", anime.getName());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement savePreparedStatement(Connection connection, Anime anime) throws SQLException {
        String sql = "INSERT INTO `anime_store`.`anime` (`name`, `episodes`, `producer_id`) VALUES (?, ?, ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getProducer().getId());
        return ps;
    }

    public static void update(Anime anime) {
        try (Connection connection = ConnectionFactory.getConnection();
             PreparedStatement ps = updatePreparedStatement(connection, anime)) {

            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static PreparedStatement updatePreparedStatement(Connection connection, Anime anime) throws SQLException {
        String sql = "UPDATE `anime_store`.`anime` SET `name` = ?, `episodes` = ? WHERE (`id` = ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, anime.getName());
        ps.setInt(2, anime.getEpisodes());
        ps.setInt(3, anime.getId());
        return ps;
    }
}
