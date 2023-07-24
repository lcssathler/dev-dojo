package maratonajava.javacore.ZZHdesignpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {
    private static AircraftSingletonLazy INSTANCE;
    private final Set<String> availableSets = new HashSet<>();
    private final String name;

    private AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSets.add("1A");
        availableSets.add("1B");
    }

    public boolean bookSeat(String seat) {
        return availableSets.remove(seat);
    }

    public static AircraftSingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if ( INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("Boeing 767-00");
                }
            }
        }
        return INSTANCE;
    }
}
