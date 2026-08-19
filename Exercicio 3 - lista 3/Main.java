public class Main
{
    public static void main(String[] args){
        Gerente gerente = new Gerente ("Carlos", 4500.0, "Vendas", 32, 16);
        
    
        System.out.println("=======Gerente=======");
        gerente.apresentarGerente();
        
        double valorTotal = 4500;
        double porcentagem = 16;
        double resultado = (valorTotal * porcentagem) / 100.0;
        
        System.out.println("O bônus é de: " + resultado);
        
        double novoSalario = valorTotal + resultado;
        
        System.out.println("Salário total: " + novoSalario);
        
        
        

        
    }
}
