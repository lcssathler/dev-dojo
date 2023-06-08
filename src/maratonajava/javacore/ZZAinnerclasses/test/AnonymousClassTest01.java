package maratonajava.javacore.ZZAinnerclasses.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking...");
    }
}

public class AnonymousClassTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Walking around the house...");
                jump();
            }

            public void jump() {
                System.out.println("Jumping...");
            }
        };

        animal.walk();
    }
}
