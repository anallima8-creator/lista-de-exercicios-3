public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, int idade, double salario, String linguagemPrincipal) {
        super(nome, idade, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }
    
    @Override
    public double calcularSalario() {
       return getSalario() * 1.20; 
}

    public void apresentarDesenvolvedor() {
        apresentar(); 
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
    }
}