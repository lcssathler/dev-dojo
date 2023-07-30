package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer mappa = Producer.builder().name("Shinra").build();
//        ProducerService.save(mappa);
        ProducerService.delete(2);
    }
}