package maratonajava.javacore.ZZIjdbc.service;

import maratonajava.javacore.ZZIjdbc.domain.Producer;
import maratonajava.javacore.ZZIjdbc.repository.ProducerRepository;

import java.util.List;

public class ProducerService {
    public static void save(Producer producer) {
        ProducerRepository.save(producer);
    }

    public static void delete(int id) {
        requireValidId(id);
        ProducerRepository.delete(id);
    }

    public static void update(Producer producer) {
        requireValidId(producer.getId());
        ProducerRepository.update(producer);
    }

    public static List<Producer> findAll() {
        return ProducerRepository.findAll();
    }

    public static List<Producer> findByName(String name) {
        return ProducerRepository.findByName(name);
    }

    public static void showMetaData() {
        ProducerRepository.showProducerMetaData();
    }
    public static void showDriverMetaData() {
        ProducerRepository.showDriverMetaData();
    }
    public static void showTypeScrollWorking() {
        ProducerRepository.showTypeScrollWorking();
    }

    public static void requireValidId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("ERROR! Invalid id producer.");
        }
    }
}
