public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas", 27, 3500.0, "Java");
        Analista analista = new Analista("Juliana", 30, 5500.0, "Requisitos");
        Estagiario estagiario = new Estagiario("Carlos", 22, 1000.0, "Análise de Sistemas");

        System.out.println("====== Desenvolvedor ======");
        desenvolvedor.apresentarDesenvolvedor();
        System.out.println("Salário Final com Bônus: R$ " + desenvolvedor.calcularSalario());

        System.out.println("\n====== Analista ======");
        analista.apresentarAnalista();
        System.out.println("Salário Final com Bônus: R$ " + analista.calcularSalario());

        System.out.println("\n====== Estagiário ======");
        estagiario.apresentarEstagiario();
        System.out.println("Salário Final: R$ " + estagiario.calcularSalario());
        
        
        
    }
}