package maratonajava.javacore.ZZHdesignpatterns.builder.domain;

public class Person {
    private String name;
    private String middleName;
    private String lastName;

    private Person(String name, String middleName, String lastName) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public static class PersonBuilder {
        private String name;
        private String middleName;
        private String lastName;

        public PersonBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PersonBuilder middleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person build() {
            return new Person(this.name, this.middleName, this.lastName);
        }

        @Override
        public String toString() {
            return "PersonBuilder{" +
                    "name='" + name + '\'' +
                    ", middleName='" + middleName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }
}
