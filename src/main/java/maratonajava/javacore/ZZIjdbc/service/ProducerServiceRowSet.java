package maratonajava.javacore.ZZIjdbc.service;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProduceRepositoryRowSet;

import java.util.List;

public class ProducerServiceRowSet {
    public static List<Producer> findByNameRowSet(String name) {
        return ProduceRepositoryRowSet.findByNameRowSet(name);
    }
}
