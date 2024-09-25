public class Musica extends Midia {
    String artista;
    int duracao;

    public Musica(String titulo, int anoDeLancamento, boolean disponivel, String artista, int duracao) {
        super(titulo, anoDeLancamento, disponivel);
    }

    public String reproduzir() {
        return "Tocando a múscia de " + artista + "com " + duracao + "segundos";
    }
    
}
