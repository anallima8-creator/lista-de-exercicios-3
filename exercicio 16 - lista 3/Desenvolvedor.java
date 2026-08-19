public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, int idade, double salario, String linguagemPrincipal) {
        super(nome, idade, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void codar() {
        System.out.println(getNome() + " está programando em " + linguagemPrincipal + ".");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Cargo: Desenvolvedor");
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
    }
}