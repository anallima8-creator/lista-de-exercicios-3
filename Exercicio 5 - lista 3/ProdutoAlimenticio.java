public class ProdutoAlimenticio extends Produto {
    private String dataValidade;

    public ProdutoAlimenticio(String nome, int codigo, double preco, String dataValidade) {
        super(nome, codigo, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void apresentarProdutoAlimenticio() {
        apresentar();
        System.out.println("Data de Validade: " + dataValidade);
    }
}