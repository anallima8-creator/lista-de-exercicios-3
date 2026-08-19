public class FuncionarioBiblioteca extends Usuario {

    public FuncionarioBiblioteca(String nome) {
        super(nome);
    }

    @Override
    public int getLimiteEmprestimos() {
        return 10;
    }
}