public class Main {
    public static void main(String[] args) {
        Pagamento pix = new PagamentoPix(150.0, "19/08/2026", "Compra Online", "pix@email.com");
        Pagamento cartao = new PagamentoCartao(1200.0, "19/08/2026", "Notebook", "1234567890123456", 3);
        Pagamento boleto = new PagamentoBoleto(350.0, "19/08/2026", "Conta de Luz", "34191.79001 01043.510047 91020.150008 5 89010000035000");

        System.out.println("====== PROCESSANDO PAGAMENTOS ======\n");
        pix.realizarPagamento();
        System.out.println();
        cartao.realizarPagamento();
        System.out.println();
        boleto.realizarPagamento();
    }
}