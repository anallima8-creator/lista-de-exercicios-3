public class Vendedor extends Funcionario {
    private double totalVendas;

    public Vendedor(String nome, double salarioBase, double totalVendas) {
        super(nome, salarioBase);
        this.totalVendas = totalVendas;
    }

    @Override
    public double calcularBonus() {
        return totalVendas * 0.10;
    }
}