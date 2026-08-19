public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(int numero, String titular, double saldo, double taxaRendimento) {
        super(numero, titular, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

   
    @Override
  public void depositar(double valor) {
    if (valor > 0) {
        double bono = valor * (taxaRendimento / 100);
        super.depositar(valor + bono); // Deposita o valor com o bônus
    }
}

    public void apresentarContaPoupanca() {
        apresentar();
        System.out.println("Taxa de Rendimento: " + taxaRendimento + "%");
    }
}