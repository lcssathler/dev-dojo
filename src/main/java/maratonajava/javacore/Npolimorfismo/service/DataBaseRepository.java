package maratonajava.javacore.Npolimorfismo.service;

import maratonajava.javacore.Npolimorfismo.repository.Repository;

public class DataBaseRepository implements Repository {
    @Override
    public void save() {
        System.out.println("Saving in data base.");
    }
}
