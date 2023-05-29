package maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga>{
    private Long id;
    private String name;
    private double price;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "ID can not be null!");
        Objects.requireNonNull(name, "Name field can not be null!");
        Objects.requireNonNull(price, "Price field can not be null!");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return Double.compare(manga.price, price) == 0 && id.equals(manga.id) && name.equals(manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Manga otherManga) {
//        if (this.id < otherManga.getId()){
//            return -1;
//        } else if (this.id.equals(otherManga.getId())) {
//            return 0;
//        } else {
//            return 1;
//        }
        return this.name.compareTo(otherManga.getName());
    }
}
