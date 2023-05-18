package maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private int episodios;
    private String genero;
    private String tipo;

    public Anime(String nome, int episodios, String genero) {
        this();
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }
    public Anime(String nome, int episodios, String genero, String tipo) {
        this(nome, episodios, genero);
        this.tipo = tipo;
    }
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Tipo: " + this.tipo);
    }
}