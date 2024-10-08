package Model;

/**
 * Usuario
 */
public abstract class Usuario {

    private int IdUsuario;
    private String nome;
    private String email;


    public Usuario(int IdUsuario, String nome, String email){
        this.IdUsuario = IdUsuario;
        this.nome = nome;
        this.email = email;
    }

    public Usuario(){
        
    }

    //Getters and Setters
    public int getIdUsuario() {
        return this.IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}