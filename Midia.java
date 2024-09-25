public abstract  class  Midia{
    String titulo;
    int anoDeLancamento;
    boolean disponivel;

    public Midia (String titulo, int anoDeLancamento, boolean disponivel){  
        disponivel = true;
    }

    public abstract String reproduzir();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    

}