public class GerenteProjeto extends Funcionario {
    private String metodologia;

    public GerenteProjeto(String nome, int idade, double salario, String metodologia) {
        super(nome, idade, salario);
        this.metodologia = metodologia;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void organizarSprint() {
        System.out.println(getNome() + " está gerenciando a sprint utilizando " + metodologia + ".");
    }

    @Override
    public void apresentarDados() {
        super.apresentarDados();
        System.out.println("Cargo: Gerente de Projeto");
        System.out.println("Metodologia: " + metodologia);
    }
}