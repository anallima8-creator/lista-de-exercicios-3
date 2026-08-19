public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro("ABC-1234", "Onix", 120.0);
        Veiculo moto = new Moto("DEF-5678", "CB 500", 80.0);
        Veiculo suv = new SUV("GHI-9012", "Jeep Compass", 250.0);

        int dias = 5;

        System.out.println("====== CÁLCULO DE LOCAÇÃO (" + dias + " dias) ======\n");

        System.out.println("Carro (" + carro.getModelo() + "):");
        System.out.println("Valor total: R$ " + carro.calcularLocacao(dias));

        System.out.println("\nMoto (" + moto.getModelo() + "):");
        System.out.println("Valor total: R$ " + moto.calcularLocacao(dias));

        System.out.println("\nSUV (" + suv.getModelo() + "):");
        System.out.println("Valor total: R$ " + suv.calcularLocacao(dias));
    }
}