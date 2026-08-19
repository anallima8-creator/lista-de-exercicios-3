public class PedidoNormal extends Pedido {

    public PedidoNormal(int numero, String cliente) {
        super(numero, cliente);
    }

    @Override
    public double calcularFrete() {
        return 15.0;
    }
}