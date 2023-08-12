package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerServiceRowSet;

@Log4j2
public class ConnectionFactoryTest02 {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().id(1).name("NICK").build();

        ProducerServiceRowSet.updateRowSet(producer1);

//        log.info(ProduceRepositoryRowSet.findByNameRowSet(""));
    }
}
