public class Tecnico extends Funcionario {

    public Tecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularBonus() {
        return getSalarioBase() * 0.10;
    }
}