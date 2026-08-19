public class Main {
    public static void main(String[] args) {
        Veiculo caminhao = new Caminhao("ABC-1234", "Volvo FH", 15000.0);
        Veiculo van = new Van("DEF-5678", "Mercedes Sprinter", 1500.0);
        Veiculo moto = new Motocicleta("GHI-9012", "Honda CG 160", 30.0);

        double distancia = 100.0;

        System.out.println("====== CÁLCULO DE FRETE (Distância: " + distancia + " km) ======\n");

        System.out.println("Caminhão (" + caminhao.getModelo() + " - " + caminhao.getPlaca() + "):");
        System.out.println("Valor do Frete: R$ " + caminhao.calcularFrete(distancia));

        System.out.println("\nVan (" + van.getModelo() + " - " + van.getPlaca() + "):");
        System.out.println("Valor do Frete: R$ " + van.calcularFrete(distancia));

        System.out.println("\nMotocicleta (" + moto.getModelo() + " - " + moto.getPlaca() + "):");
        System.out.println("Valor do Frete: R$ " + moto.calcularFrete(distancia));
    }
}