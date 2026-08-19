public class PedidoExpress extends Pedido {

    public PedidoExpress(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public double calcularFrete() {
        return 35.0;
    }
}