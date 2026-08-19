public class Moto extends Veiculo{
    private String tipoPartida;
    
    public Moto(String marca,String modelo, int anoFabricacao,String tipoPartida){
        super(marca, modelo, anoFabricacao);
        this.tipoPartida = tipoPartida;
    }
    
    public String getTipoPartida(){
        return tipoPartida;
    }
    
    public void apresentarMoto(){
        apresentar();
        System.out.println("Tipo de Partida: " + tipoPartida);
    }
}