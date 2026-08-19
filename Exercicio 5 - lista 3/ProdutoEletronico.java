public class ProdutoEletronico extends Produto {
    private String marca;
    private int garantiaMeses;

    public ProdutoEletronico(String nome, int codigo, double preco, String marca, int garantiaMeses) {
        super(nome, codigo, preco);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void apresentarEletronico() {
        apresentar();
        System.out.println("Marca: " + marca);
        System.out.println("Garantia: " + garantiaMeses + " meses");
    }
}