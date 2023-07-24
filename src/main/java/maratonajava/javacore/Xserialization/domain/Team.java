package maratonajava.javacore.Xserialization.domain;

import java.io.Serializable;

public class Team implements Serializable {
    String name;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

