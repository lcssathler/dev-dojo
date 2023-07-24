package maratonajava.javacore.ZZHdesignpatterns.singleton.test;

import maratonajava.javacore.ZZHdesignpatterns.singleton.domain.AircraftSingletonEager;
import maratonajava.javacore.ZZHdesignpatterns.singleton.domain.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        checkAvailableSeats("1A");
        checkAvailableSeats("1A");
        checkAvailableSeats("1B");

        Constructor<AircraftSingletonLazy> constructor = AircraftSingletonLazy.class
                                                        .getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        AircraftSingletonLazy lazy = constructor.newInstance("Boeing 907");
        System.out.println(lazy);

    }

    private static void checkAvailableSeats(String seat) {
        AircraftSingletonEager eager = AircraftSingletonEager.getInstance();
        System.out.println(eager);
        System.out.println(eager.bookSeat(seat));
    }
}
