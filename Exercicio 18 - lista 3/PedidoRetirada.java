public class PedidoRetirada extends Pedido {

    public PedidoRetirada(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public double calcularFrete() {
        return 0.0;
    }
}