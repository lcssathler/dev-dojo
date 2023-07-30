package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Shinra").build();
        Producer producer2 = Producer.builder().id(1).name("Nickelodeon").build();

//        ProducerService.save(producer1);
//        ProducerService.delete(2);
        ProducerService.update(producer2);
    }
}