package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer mappa = Producer.builder().name("Shinra").build();
        ProducerRepository.save(mappa);
    }
}