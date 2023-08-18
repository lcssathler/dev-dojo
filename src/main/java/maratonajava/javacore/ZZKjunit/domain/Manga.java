package maratonajava.javacore.ZZKjunit.domain;

import java.util.List;
import java.util.Objects;

public record Manga(String name, int episodes) {

    public Manga {
        Objects.requireNonNull(name);
    }
}
