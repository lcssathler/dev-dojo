package maratonajava.javacore.Npolimorfismo.test;

import maratonajava.javacore.Npolimorfismo.repository.Repository;
import maratonajava.javacore.Npolimorfismo.service.DataBaseRepository;
import maratonajava.javacore.Npolimorfismo.service.FileRepository;
import maratonajava.javacore.Npolimorfismo.service.MemoryRepository;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new MemoryRepository();
        repository.save();
    }
}
