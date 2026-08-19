public class Motocicleta extends Veiculo {

    public Motocicleta(String placa, String modelo, double capacidadeCarga) {
        super(placa, modelo, capacidadeCarga);
    }

    @Override
    public double calcularFrete(double distancia) {
        return distancia * 1.5;
    }
}