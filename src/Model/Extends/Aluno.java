package Model.Extends;

import Model.Usuario;

public class Aluno extends Usuario{

    private String matricula;
    private String curso;

    
    public Aluno(int IdUsuario, String nome, String email, String matricula, String curso) {
        super(IdUsuario, nome, email);
        //TODO Auto-generated constructor stub

        this.curso = curso;
        this.matricula = matricula;
    }
    

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


}
