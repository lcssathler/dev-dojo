package maratonajava.javacore.ZZIjdbc.test;

import lombok.extern.log4j.Log4j2;
import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.service.ProducerService;

import java.sql.PreparedStatement;
import java.util.List;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer producer1 = Producer.builder().name("Mappa").build();
        Producer producer2 = Producer.builder().id(13).name("hbo").build();

//        ProducerService.save(producer1);
//        ProducerService.delete(6);
//        ProducerService.update(producer2);
//        log.info(ProducerService.findAll());
//        log.info(ProducerService.findByName("shinra"));
//        ProducerService.showMetaData();
//        ProducerService.showDriverMetaData();
//        ProducerService.showTypeScrollWorking();
//        log.info(ProducerService.findByNameAndUpdateToUpperCase("Mappa"));
//        log.info(ProducerService.insertNameIfNotFound("Disney"));
//        ProducerService.findByNameAndDelete("jojo");
//        List<Producer> byNamePreparedStatement = ProducerService.findByNamePreparedStatement("");
//        log.info(byNamePreparedStatement);
        ProducerService.updatePreparedStatement(producer2);
    }
}