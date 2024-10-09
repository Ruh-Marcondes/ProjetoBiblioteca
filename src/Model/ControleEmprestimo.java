package Model;

import java.time.LocalDate;

public class ControleEmprestimo {

    
    public ControleEmprestimo(){

    }
    
    public String registraEmprestimo(Usuario usuario, Livro livro) {
       
    
        if(!livro.getDisponivel()) return "!-!";
        LocalDate dataEmprestimo = LocalDate.now();
        RegistroEmprestimo registro = new RegistroEmprestimo(0, usuario, livro, dataEmprestimo, null);
        livro.setDisponivel(false);
        
        return "Emprestimo registrado para: "+ usuario.getNome()+"\n"+
"Livro: "+ livro.getTitulo()+"\n"+
"Data emprestimo: " + dataEmprestimo.toString() +"\n\n";
    }

    public String registraDevolucao(Usuario usuario, Livro livro) {
       
    
        if(livro.getDisponivel()) return "!-!";
        LocalDate dataDevolucao = LocalDate.now();
        RegistroEmprestimo registro = new RegistroEmprestimo(0, usuario, livro, null, dataDevolucao);
        livro.setDisponivel(true);
        
        return "Devoluçao registrado para: "+ usuario.getNome()+"\n"+
        "Livro: "+ livro.getTitulo()+"\n"+
        "Data emprestimo: " + dataDevolucao.toString() +"\n\n";
    }
}
