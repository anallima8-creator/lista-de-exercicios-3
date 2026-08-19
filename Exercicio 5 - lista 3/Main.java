public class Main {
    public static void main(String[] args) {
        ProdutoEletronico eletronico = new ProdutoEletronico("Smartphone", 101, 2500.00, "Samsung", 12);
        ProdutoAlimenticio alimenticio = new ProdutoAlimenticio("Leite Integral", 303, 4.50, "20/12/2026");

        System.out.println("====== Produto Eletrônico ======");
        eletronico.apresentarEletronico();

        System.out.println("====== Alimento ======");
        alimenticio.apresentarProdutoAlimenticio();

        
    }
}