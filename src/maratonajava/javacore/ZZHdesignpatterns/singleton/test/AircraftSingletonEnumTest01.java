package maratonajava.javacore.ZZHdesignpatterns.singleton.test;

import maratonajava.javacore.ZZHdesignpatterns.singleton.domain.AircraftSingletonEnum;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) {
        checkAvailableSeats("1A");
        checkAvailableSeats("1B");
        checkAvailableSeats("1C");
    }

    private static void checkAvailableSeats(String seat) {
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        AircraftSingletonEnum instance = AircraftSingletonEnum.INSTANCE;
        System.out.println(instance.bookSeat(seat));
    }
}
