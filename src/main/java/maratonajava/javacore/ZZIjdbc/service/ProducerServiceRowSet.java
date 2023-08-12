package maratonajava.javacore.ZZIjdbc.service;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProduceRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameRowSet(String name) {
        return ProduceRepositoryRowSet.findByNameRowSet(name);
    }

    public static void updateRowSet(Producer producer) {
        ProduceRepositoryRowSet.updateRowSet(producer);
    }
    public static void updateCachedRowSet(Producer producer) {
        ProduceRepositoryRowSet.updateCachedRowSet(producer);
    }
}
