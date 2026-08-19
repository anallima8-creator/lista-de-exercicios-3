public class Main {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Ricardo", "ADS", 8.5, 6.7);
        Professor professor = new Professor("Alice", "Sistemas Operacionais", 4900.0);

        
        System.out.println("--- DADOS DO ALUNO ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Curso: " + aluno.getCurso());
        System.out.println("Nota 1: " + aluno.getNota1());
        System.out.println("Nota 2: " + aluno.getNota2());
        System.out.println("Média do Aluno: " + aluno.getNotaFinal());
        System.out.println("-------------------------");

        
        System.out.println("--- DADOS DO PROFESSOR ---");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println("-------------------------");
    }
}