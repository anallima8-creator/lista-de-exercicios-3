public class Main 
{
    public static void main(String[] args){
        Carro carro = new Carro ("Toyota", "Corolla", 2022, 4);
        Moto moto = new Moto ("Honda", "CB 500F", 2023,"Partida Elétrica");
        
        
        System.out.println("========Carro========");
        carro.apresentarCarro();
        System.out.println();
        System.out.println("=======Moto=======");
        moto.apresentarMoto();
        
        
    }
    
}