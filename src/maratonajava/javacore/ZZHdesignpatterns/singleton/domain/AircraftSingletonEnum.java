package maratonajava.javacore.ZZHdesignpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnum {
    INSTANCE;
    private final Set<String> availableSets;

     AircraftSingletonEnum() {
        this.availableSets = new HashSet<>();
        this.availableSets.add("1A");
        this.availableSets.add("1A");
        this.availableSets.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSets.remove(seat);
    }
}
