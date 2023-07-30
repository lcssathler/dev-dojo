package maratonajava.javacore.ZZIjdbc.domain;

public final class ProducerBuilder {
    private String name;

    private ProducerBuilder() {
    }

    public static ProducerBuilder builder() {
        return new ProducerBuilder();
    }

    public ProducerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public Producer build() {
        return new Producer(name);
    }
}
