package Model;

import java.time.LocalDate;

public class ControleEmprestimo {
    
    public static RegistroEmprestimo(int idEmprestimo, Usuario user, Livro book, LocalDate dataEmprestimo, LocalDate  dataDevolucao);


    /**
     * @param user
     * @param book
     * @return
     */
    public static String registraemprestimo(Usuario user, Livro book){

    RegistroEmprestimo rg = new RegistroEmprestimo(book.getIdLivro();, , null, null, null);

        if(!book.getDisponivel()){
            return "\n Não disponivel para emprestimo";
        }

        
    
        return "\'-\'";
    }

    public static String registradevolucao(Usuario user, Livro book){

        return "\'-\'"; 
    }
}
