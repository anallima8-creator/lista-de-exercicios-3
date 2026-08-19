public abstract class Usuario {
    private String nome;
    private int livrosEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public abstract int getLimiteEmprestimos();

    public boolean verificarLimiteEmprestimos() {
        return livrosEmprestados < getLimiteEmprestimos();
    }

    public void realizarEmprestimo() {
        if (verificarLimiteEmprestimos()) {
            livrosEmprestados++;
            System.out.println(nome + " realizou empréstimo. Total emprestado: " + livrosEmprestados + "/" + getLimiteEmprestimos());
        } else {
            System.out.println(nome + " atingiu o limite máximo de " + getLimiteEmprestimos() + " empréstimos.");
        }
    }

    public void devolverLivro() {
        if (livrosEmprestados > 0) {
            livrosEmprestados--;
            System.out.println(nome + " devolveu um livro. Total emprestado: " + livrosEmprestados + "/" + getLimiteEmprestimos());
        } else {
            System.out.println(nome + " não possui livros para devolver.");
        }
    }
}