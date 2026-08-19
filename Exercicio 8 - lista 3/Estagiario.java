public class Estagiario extends Funcionario {
    private String faculdade;

    public Estagiario(String nome, int idade, double salario, String faculdade) {
        super(nome, idade, salario);
        this.faculdade = faculdade;
    }

    public String getFaculdade() {
        return faculdade;
    }
    
    @Override
    public double calcularSalario() {
       return getSalario(); 
}

    public void apresentarEstagiario() {
        apresentar();
        System.out.println("Faculdade: " + faculdade);
    }
}