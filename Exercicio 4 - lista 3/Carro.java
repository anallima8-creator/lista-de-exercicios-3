public class Carro extends Veiculo{
    private int quantidadePortas;
    
    public Carro(String marca,String modelo, int anoFabricacao, int quantidadePortas){
        super(marca, modelo, anoFabricacao);
        this.quantidadePortas = quantidadePortas;
    }
    
    public int quantidadePortas(){
        return quantidadePortas;
    }
    
    public void apresentarCarro(){
        apresentar();
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}