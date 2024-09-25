import java.util.List;

public class Usuario {
    String nome;
    int id;
    boolean assinaturaAtiva;
    List <Midia> midiasFavoritas; 

    public Usuario (String nome, int id, boolean assinaturaAtiva){

    }

    public void adicionarMidiaFavorita(Midia midia){
        midiasFavoritas.add(midia);

    }

    public void removerMidiaFavorita(Midia midia){
        midiasFavoritas.remove(midia);
    }

    public void  reproduzirMidia(Midia midia){
        if(assinaturaAtiva == true){
            midia.reproduzir();
        }
        else{
            System.out.println("Você precisa ter uma assinatura ativa!");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssinaturaAtiva() {
        return assinaturaAtiva;
    }

    public void setAssinaturaAtiva(boolean assinaturaAtiva) {
        this.assinaturaAtiva = assinaturaAtiva;
    }

    public List<Midia> getMidiasFavoritas() {
        return midiasFavoritas;
    }

    public void setMidiasFavoritas(List<Midia> midiasFavoritas) {
        this.midiasFavoritas = midiasFavoritas;
    }
}
