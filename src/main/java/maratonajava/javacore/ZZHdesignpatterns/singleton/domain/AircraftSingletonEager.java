package maratonajava.javacore.ZZHdesignpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("Boeing 787");
    private final Set<String> availableSets = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSets.add("1A");
        availableSets.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSets.remove(seat);
    }

    public static AircraftSingletonEager getInstance() {
        return INSTANCE;
    }
}
