import java.util.List;
public class PlataformaStreaming {
    List<Midia> catalogo;
    List<Usuario> usuarios;

    public void adicionarMidia(Midia midia){
        catalogo.add(midia);
    }

    public void  registrarUsuario(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public void ativarAssinatura(Usuario usuario){
        this.usuarios.add(usuario);
    }

    public List<Midia> listarCatalogoDisponivel(){
        return catalogo;
    }

    public void reproduzirMidiaParaUsuario(Usuario usuario, Midia midia){
        usuario.reproduzirMidia(midia);
    }

    public List<Midia> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(List<Midia> catalogo) {
        this.catalogo = catalogo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
    
}
