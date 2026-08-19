public class Main
{
	public static void main(String[] args) {
	 
	  
	 Funcionario funcionario1 = new Funcionario("Helena",24, "Vendedora", 3100.0);
	 
	 Funcionario funcionario2 = new Funcionario("Luiz", 34, "Atendente", 2900.0);
	 
	 Funcionario funcionario3 = new Funcionario("Márcia",29, "Gerente",5000.0);
	 
        System.out.println("Nome: " + funcionario1.getNomeFuncionario());
        System.out.println("Idade: " + funcionario1.getIdade());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: R$ " + funcionario1.getSalario());
        System.out.println("-------------------------");

        System.out.println("Nome: " + funcionario2.getNomeFuncionario());
        System.out.println("Idade: " + funcionario2.getIdade());
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Salário: R$ " + funcionario2.getSalario());
        System.out.println("-------------------------");

        System.out.println("Nome: " + funcionario3.getNomeFuncionario());
        System.out.println("Idade: " + funcionario3.getIdade());
        System.out.println("Cargo: " + funcionario3.getCargo());
        System.out.println("Salário: R$ " + funcionario3.getSalario());
    }
}