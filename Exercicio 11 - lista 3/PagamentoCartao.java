public class PagamentoCartao extends Pagamento {
    private String numeroCartao;
    private int parcelas;

    public PagamentoCartao(double valor, String data, String descricao, String numeroCartao, int parcelas) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
        this.parcelas = parcelas;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento com Cartão de R$ " + getValor() + " em " + getData() + " (" + getDescricao() + ")");
        System.out.println("Cartão final " + numeroCartao.substring(numeroCartao.length() - 4) + " parcelado em " + parcelas + "x.");
    }
}