package maratonajava.javacore.Ycolecoes.domain;

public class Smartphone {
    private String serial;
    private String manufacturer;

    public Smartphone(String serial, String manufacturer) {
        this.serial = serial;
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return (serial != null) && (this.serial.equals(smartphone.serial));

    }
}
