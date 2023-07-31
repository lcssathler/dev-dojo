package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.util.List;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Shinra").build();
        Producer producer2 = Producer.builder().id(1).name("Nickelodeon").build();

//        ProducerService.save(producer1);
//        ProducerService.delete(2);
//        ProducerService.update(producer2);
        log.info(ProducerService.findAll());
    }
}