package Model.Extends;

import Model.Usuario;

public class Professor extends Usuario {


    private String departamento;
    private String titulacao;


    public Professor(int IdUsuario, String nome, String email,String departamento, String titulacao) {
        super(IdUsuario, nome, email);
        //TODO Auto-generated constructor stub
        this.departamento = departamento;
        this.titulacao = titulacao;
    }

    public void setDepartamento(String departamento){
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return this.departamento;
    }

    public void setTitulacao(String titulacao){
        this.titulacao = titulacao;
    }

    public String getTitulacao(){
        return this.titulacao;
    }
    
    
}
