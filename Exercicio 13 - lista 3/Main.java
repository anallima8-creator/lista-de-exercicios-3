public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 8000.0);
        Funcionario vendedor = new Vendedor("Ana", 2500.0, 15000.0);
        Funcionario tecnico = new Tecnico("Bruno", 3500.0);

        System.out.println("====== GERENTE ======");
        gerente.apresentarDados();

        System.out.println("\n====== VENDEDOR ======");
        vendedor.apresentarDados();

        System.out.println("\n====== TÉCNICO ======");
        tecnico.apresentarDados();
    }
}
