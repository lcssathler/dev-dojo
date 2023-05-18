package maratonajava.javacore.Jmodificadorfinal.domain;

public class Purchaser {
    private String name;

    @Override
    public String toString() {
        return this.name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
