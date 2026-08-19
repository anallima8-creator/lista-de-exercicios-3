public class Main {
    public static void main(String[] args) {
        Pedido p1 = new PedidoNormal(101, "Lucas");
        p1.adicionarValor(100.0);
        p1.atualizarStatus("Em Processamento");

        Pedido p2 = new PedidoExpress(102, "Mariana");
        p2.adicionarValor(200.0);
        p2.atualizarStatus("Enviado");

        Pedido p3 = new PedidoRetirada(103, "Carlos");
        p3.adicionarValor(150.0);

        System.out.println("====== PEDIDO NORMAL ======");
        System.out.println("Cliente: " + p1.getCliente() + " | Status: " + p1.getStatus());
        System.out.println("Subtotal: R$ " + p1.getValorTotal() + " | Frete: R$ " + p1.calcularFrete());
        System.out.println("Valor Final: R$ " + p1.calcularValorFinal());

        System.out.println("\n====== PEDIDO EXPRESS ======");
        System.out.println("Cliente: " + p2.getCliente() + " | Status: " + p2.getStatus());
        System.out.println("Subtotal: R$ " + p2.getValorTotal() + " | Frete: R$ " + p2.calcularFrete());
        System.out.println("Valor Final: R$ " + p2.calcularValorFinal());

        System.out.println("\n====== PEDIDO RETIRADA ======");
        System.out.println("Cliente: " + p3.getCliente() + " | Status: " + p3.getStatus());
        System.out.println("Subtotal: R$ " + p3.getValorTotal() + " | Frete: R$ " + p3.calcularFrete());
        System.out.println("Valor Final: R$ " + p3.calcularValorFinal());
    }
}