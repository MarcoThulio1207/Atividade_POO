public class Serie extends Midia {
    int numeroDeTemporadas;
    int numeroDeEpisodios;

    public Serie(String titulo, int anoDeLancamento, boolean disponivel,int numeroDeTemporadas, int numeroDeEpisodios ) {
        super(titulo, anoDeLancamento, disponivel);
    }

    public String reproduzir() {
        return "Reproduzindo a série: Suits, com " + numeroDeTemporadas + "temporadas e " + numeroDeEpisodios + "episodeos" ;
    }

    
}
