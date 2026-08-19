public class SUV extends Veiculo {

    public SUV(String placa, String modelo, double valorDiaria) {
        super(placa, modelo, valorDiaria);
    }

    @Override
    public double calcularLocacao(int dias) {
        return (getValorDiaria() * dias) + 100.0;
    }
}