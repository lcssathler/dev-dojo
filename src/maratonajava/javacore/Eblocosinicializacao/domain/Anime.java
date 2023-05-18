package maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String name;
    private int [] eps;

    {
        eps = new int[12];
        for (int i = 0; i < eps.length; i++) {
            eps[i] = i + 1;
        }
    }
    public Anime(String name) {
        this.name = name;
    }
    public Anime () {
        System.out.print("Dentro do construtor sem parâmetro: ");
        for (int ep : this.eps) {
            System.out.print(ep + " ");
        }
        System.out.println();
    }

    public int[] getEps() {
        return eps;
    }

    public String getName() {
        return name;
    }
}

