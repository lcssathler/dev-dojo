package maratonajava.javacore.ZZHdesignpatterns.builder.test;

import maratonajava.javacore.ZZHdesignpatterns.builder.domain.Person;

public class BuilderTest01 {
    public static void main(String[] args) {
        System.out.println(new Person.PersonBuilder()
                                   .name("Lucas")
                                   .middleName("Sathler")
                                   .lastName("Aguiar")
                                   .build());
    }
}
