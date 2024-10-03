package Model.Extends;

import Model.Usuario;

public class Funcionario extends Usuario {


    private String cargo;
    private String setor;

    public Funcionario(int IdUsuario, String nome, String email,String cargo, String setor) {
        super(IdUsuario, nome, email);
        //TODO Auto-generated constructor stub

        this.cargo = cargo;
        this.setor = setor;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
}
