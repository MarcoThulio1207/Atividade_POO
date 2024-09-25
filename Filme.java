public class Filme extends Midia {
    int duracao;
    String diretor;



    public Filme(String titulo, int anoDeLancamento, boolean disponivel,int duracao, String diretor) {
        super(titulo, anoDeLancamento, disponivel);
    }

    public String reproduzir() {
        return "Reproduzindo o filme: Matrix , dirigido por: Irmãns Watchovisky ";
    }

    
}
