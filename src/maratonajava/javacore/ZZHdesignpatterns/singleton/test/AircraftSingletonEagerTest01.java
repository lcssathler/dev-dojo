package maratonajava.javacore.ZZHdesignpatterns.singleton.test;

import maratonajava.javacore.ZZHdesignpatterns.singleton.domain.AircraftSingletonEager;

public class AircraftSingletonEagerTest01 {
    public static void main(String[] args) {
        checkAvailableSeats("1A");
        checkAvailableSeats("1A");
        checkAvailableSeats("1B");
    }

    private static void checkAvailableSeats(String seat) {
        AircraftSingletonEager eager = AircraftSingletonEager.getInstance();
        System.out.println(eager.bookSeat(seat));
    }
}
