public class PagamentoBoleto extends Pagamento {
    private String codigoBarras;

    public PagamentoBoleto(double valor, String data, String descricao, String codigoBarras) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Pagamento via Boleto de R$ " + getValor() + " em " + getData() + " (" + getDescricao() + ")");
        System.out.println("Código de Barras: " + codigoBarras + " - Vencimento em 3 dias úteis.");
    }
}