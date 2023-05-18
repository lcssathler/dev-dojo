package maratonajava.javacore.Fmodificadoresestatico.domain;

public class Anime {
    private String name;
    private static int [] eps;
    static {
        System.out.print("Dentro do bloco de inicialização estático: ");
        eps = new int[12];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
        for (int ep : Anime.eps) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }
     static {
         System.out.println("Dentro do bloco de inicialização estático 2");
     }
     static {
         System.out.println("Dentro do bloco de inicialização estático 3");
     }
    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime(String name) {
        this.name = name;
    }
    public Anime() {

    }

    public int[] getEps() {
        return eps;
    }

    public String getName() {
        return name;
    }
}

