package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.repository.ProduceRepositoryRowSet;
import maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        log.info(ProduceRepositoryRowSet.findByNameRowSet("hbo"));
    }
}
