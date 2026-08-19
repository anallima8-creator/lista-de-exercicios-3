public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String data, String descricao, String chavePix) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento PIX de R$ " + getValor() + " em " + getData() + " (" + getDescricao() + ")");
        System.out.println("Chave PIX: " + chavePix + " - Processado instantaneamente.");
    }
}