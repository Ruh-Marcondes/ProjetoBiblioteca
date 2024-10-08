package Model;

public class Livro {
    
    private int idLivro;
    private String titulo;
    private String autor;
    private boolean _isdisponivel;

    public int getIdLivro() {
        return this.idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean getDisponivel() {
        return this._isdisponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this._isdisponivel = disponivel;
    }

    public Livro(int idLivro, String titulo, String autor, boolean disponivel){

        this.idLivro = idLivro;
        this.titulo = titulo;
        this.autor = autor;
        this._isdisponivel = disponivel;
    }
    public Livro(){
        
    }

}
