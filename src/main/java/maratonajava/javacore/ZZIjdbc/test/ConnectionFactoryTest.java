package maratonajava.javacore.ZZIjdbc.test;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.domain.ProducerBuilder;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer mappa = ProducerBuilder.builder().name("Mappa").build();
        ProducerRepository.save(mappa);
    }
}
