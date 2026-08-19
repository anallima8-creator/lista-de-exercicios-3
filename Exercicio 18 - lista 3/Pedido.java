public abstract class Pedido {
    private int numero;
    private String cliente;
    private double valorTotal;
    private String status;

    public Pedido(int numero, String cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.valorTotal = 0.0;
        this.status = "Pendente";
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getStatus() {
        return status;
    }

    public void adicionarValor(double valor) {
        if (valor > 0) {
            this.valorTotal += valor;
        }
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public abstract double calcularFrete();

    public double calcularValorFinal() {
        return valorTotal + calcularFrete();
    }
}