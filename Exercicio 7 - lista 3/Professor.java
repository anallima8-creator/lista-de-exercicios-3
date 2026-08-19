public class Professor extends Pessoa {
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        super(nome);
        this.disciplina = disciplina;
        this.salario = salario; 
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double Salario) {
        this.salario = salario;
    }
}