package maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String tipo;
    private int episodios;
    private String genero;

    public void init(String tipo, int episodios) {
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String tipo, int episodios, String genero) {
        this.init(tipo, episodios);
        this.genero = genero;
    }
    public void imprime() {
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);

    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }
}
