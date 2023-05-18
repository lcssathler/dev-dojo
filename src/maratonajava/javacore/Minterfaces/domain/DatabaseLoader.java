package maratonajava.javacore.Minterfaces.domain;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("Loading data from Data Base.");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from Data base.");
    }

    @Override
    public void checkPermission() {
        System.out.println("Checking permissions from Data Base");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro do retrieveMaxDataSize da DatabaseLoader");
    }
}
