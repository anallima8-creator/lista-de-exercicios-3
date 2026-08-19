public class Analista extends Funcionario {
    private String area;

    public Analista(String nome, int idade, double salario, String area) {
        super(nome, idade, salario);
        this.area = area;
    }

    public String getArea() {
        return area;
    }
    
    @Override
    public double calcularSalario() {
       return getSalario() * 1.05; 
}

    public void apresentarAnalista() {
        apresentar();
        System.out.println("Área de Atuação: " + area);
    }
}