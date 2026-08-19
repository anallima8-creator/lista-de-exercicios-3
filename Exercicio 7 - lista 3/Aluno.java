public class Aluno extends Pessoa {
    private String curso;
    private double nota1;
    private double nota2;

    // Construtor
    public Aluno(String nome, String curso, double nota1, double nota2) {
        super(nome); // Chama o construtor da classe Pessoa
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // Getters e Setters
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    // Método para calcular a nota final (média)
    public double getNotaFinal() {
        return (nota1 + nota2) / 2;
    }

}