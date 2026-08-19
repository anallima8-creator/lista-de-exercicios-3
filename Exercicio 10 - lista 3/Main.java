public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Maria", 28, 3000.0);
        Funcionario funcionario = new Funcionario("Roberto", 35, "Gerente", 6500.0);

        System.out.println("====== Dados do Cliente ======");
        cliente.apresentarCliente();

        System.out.println("\n====== Dados do Funcionário ======");
        funcionario.apresentarFuncionario();
    }
}