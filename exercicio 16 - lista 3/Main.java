import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        listaFuncionarios.add(new Desenvolvedor("Lucas", 25, 6000.0, "Java"));
        listaFuncionarios.add(new Designer("Mariana", 28, 5500.0, "Figma"));
        listaFuncionarios.add(new GerenteProjeto("Carlos", 40, 9000.0, "Scrum"));

        System.out.println("====== CADASTRO DE FUNCIONÁRIOS ======\n");

        for (Funcionario f : listaFuncionarios) {
            f.apresentarDados();
            System.out.println("------------------------------------");
        }
    }
}