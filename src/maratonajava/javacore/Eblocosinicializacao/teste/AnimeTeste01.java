package maratonajava.javacore.Eblocosinicializacao.teste;

import maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getName());
        System.out.println(anime.getEps());

        System.out.print("Dentro do AnimeTeste01: ");
        for (int ep : anime.getEps()) {
            System.out.print(ep + " ");
        }

    }
}
