public class ContaCorrente extends ContaBancaria {
    private double limiteDisponivel;

    public ContaCorrente(int numero, String titular, double saldo, double limiteDisponivel) {
        super(numero, titular, saldo);
        this.limiteDisponivel = limiteDisponivel;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

   @Override
 public void sacar(double valor) {
    if (valor > 0 && valor <= (getSaldo() + limiteDisponivel)) {
        super.sacar(valor); 
    } else {
        System.out.println("Saldo e limite insuficientes para realizar o saque.");
    }
}

    public void apresentarContaCorrente() {
        apresentar();
        System.out.println("Limite Disponível: R$ " + limiteDisponivel);
    }
}