import Model.ControleEmprestimo;
import Model.Livro;
import Model.RegistroEmprestimo;
import Model.Usuario;
import Model.Extends.Aluno;
import Model.Extends.Funcionario;
import Model.Extends.Professor;

public class GerenciarBiblioteca {
    public static void main(String[] args) throws Exception {
     
          Aluno aluno = new Aluno();
        aluno.setIdUsuario(1);
        aluno.setNome("João Silva");
        aluno.setEmail("joao.silva@email.com");
        aluno.setMatricula("20240001");
        aluno.setCurso("Ciência da Computação");

        Professor professor = new Professor();
        professor.setIdUsuario(2);
        professor.setNome("Maria Oliveira");
        professor.setEmail("maria.oliveira@email.com");
        professor.setDepartamento("Matemática");
        professor.setTitulacao("Doutora");

        Funcionario funcionario = new Funcionario();
        funcionario.setIdUsuario(3);
        funcionario.setNome("Carlos Souza");
        funcionario.setEmail("carlos.souza@email.com");
        funcionario.setCargo("Bibliotecário");
        funcionario.setSetor("Empréstimos");

        // Instanciando livros
        Livro livro1 = new Livro();
        livro1.setIdLivro(1);
        livro1.setTitulo("Java: Como Programar");
        livro1.setAutor("Deitel");
        livro1.setDisponivel(true);

        Livro livro2 = new Livro();
        livro2.setIdLivro(2);
        livro2.setTitulo("Introdução ao Algoritmo");
        livro2.setAutor("Cormen");
        livro2.setDisponivel(true);

        Livro livro3 = new Livro();
        livro3.setIdLivro(3);
        livro3.setTitulo("Padrões de Projetos");
        livro3.setAutor("Gamma");
        livro3.setDisponivel(true);

        // Controlador de empréstimos
        ControleEmprestimo controleEmprestimo = new ControleEmprestimo();

        // Registrando empréstimos
        RegistroEmprestimo emprestimo1 = controleEmprestimo.registraEmprestimo(aluno, livro1);
        RegistroEmprestimo emprestimo2 = controleEmprestimo.registraEmprestimo(professor, livro2);
        RegistroEmprestimo emprestimo3 = controleEmprestimo.registraEmprestimo(funcionario, livro3);

        // Exibindo detalhes dos empréstimos
        System.out.println("Empréstimos Registrados:");
        exibirDetalhesEmprestimo(emprestimo1,aluno,livro1);
        exibirDetalhesEmprestimo(emprestimo2,professor,livro2);
        exibirDetalhesEmprestimo(emprestimo3,funcionario,livro3);

        // Registrando devoluções
        controleEmprestimo.registraDevolucao(aluno, livro1);
        controleEmprestimo.registraDevolucao(professor, livro2);
        controleEmprestimo.registraDevolucao(funcionario, livro3);

        // Exibindo detalhes das devoluções
        System.out.println("\nDevoluções Registradas:");
        exibirDetalhesDevolucao(emprestimo1,aluno,livro1);
        exibirDetalhesDevolucao(emprestimo2,professor,livro2);
        exibirDetalhesDevolucao(emprestimo3,funcionario,livro3);
        
    }
    private static void exibirDetalhesEmprestimo(RegistroEmprestimo emprestimo, Usuario user, Livro book) {
       
        System.out.println("Empréstimo:");
        System.out.println("Usuário: " + user.getNome());
        System.out.println("Livro: " + book.getTitulo());
        // Adicione mais detalhes conforme necessário
    }
    
    private static void exibirDetalhesDevolucao(RegistroEmprestimo emprestimo, Usuario user, Livro book) {
        System.out.println("Devolução:");
        System.out.println("Usuário: " + user.getNome());
        System.out.println("Livro: " + book.getTitulo());
        // Adicione mais detalhes conforme necessário
    }
    
}
