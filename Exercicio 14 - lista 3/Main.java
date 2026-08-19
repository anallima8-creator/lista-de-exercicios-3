public class Main {
    public static void main(String[] args) {
        Usuario aluno = new Aluno("Lucas");
        Usuario professor = new Professor("Carlos");
        Usuario funcionario = new FuncionarioBiblioteca("Mariana");

        System.out.println("====== TESTE ALUNO (Limite: 3) ======");
        aluno.realizarEmprestimo();
        aluno.realizarEmprestimo();
        aluno.realizarEmprestimo();
        aluno.realizarEmprestimo();
        aluno.devolverLivro();

        System.out.println("\n====== TESTE PROFESSOR (Limite: 5) ======");
        professor.realizarEmprestimo();
        professor.realizarEmprestimo();

        System.out.println("\n====== TESTE FUNCIONÁRIO (Limite: 10) ======");
        funcionario.realizarEmprestimo();
    }
}