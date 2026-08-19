public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas", 20);
        Professor professor = new Professor("Carlos", 45);

        Livro livro1 = new Livro("Java para Iniciantes", "Herbert Schildt", 2019);

        livro1.emprestar(aluno);
        livro1.emprestar(professor);
        livro1.devolver();
        livro1.emprestar(professor);
    }
}
