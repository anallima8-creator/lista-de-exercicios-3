public class Designer extends Funcionario {
    private String ferramentaPref;

    public Designer(String nome, int idade, double salario, String ferramentaPref) {
        super(nome, idade, salario);
        this.ferramentaPref = ferramentaPref;
    }

    public String getFerramentaPref() {
        return ferramentaPref;
    }

    public void criarLayout() {
        System.out.println(getNome() + " está criando telas no " + ferramentaPref + ".");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Cargo: Designer");
        System.out.println("Ferramenta Principal: " + ferramentaPref);
    }
}