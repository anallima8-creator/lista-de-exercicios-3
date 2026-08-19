public class Van extends Veiculo {

    public Van(String placa, String modelo, double capacidadeCarga) {
        super(placa, modelo, capacidadeCarga);
    }

    @Override
    public double calcularFrete(double distancia) {
        return distancia * 3.0 + 30.0;
    }
}