package maratonajava.javacore.Csobrecargametodos.teste;

import maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        //anime.setTipo("TV");
        //anime.setEpisodios(240);
        anime.init("TV", 240);
        anime.init("TV", 240, "Ação");
        anime.imprime();
    }
}
