public class Caminhao extends Veiculo {

    public Caminhao(String placa, String modelo, double capacidadeCarga) {
        super(placa, modelo, capacidadeCarga);
    }

    @Override
    public double calcularFrete(double distancia) {
        return distancia * 5.0 + 100.0;
    }
}