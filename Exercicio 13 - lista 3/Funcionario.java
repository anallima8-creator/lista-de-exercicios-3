public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularBonus();

    public double calcularSalarioFinal() {
        return salarioBase + calcularBonus();
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$ " + salarioBase);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("Salário Final: R$ " + calcularSalarioFinal());
    }
}