public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double capacidadeCarga;

    public Veiculo(String placa, String modelo, double capacidadeCarga) {
        this.placa = placa;
        this.modelo = modelo;
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public abstract double calcularFrete(double distancia);
}