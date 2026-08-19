public class Main 
{
    public static void main(String[] args){
        Aluno aluno = new Aluno ("Elisa", 18, "Mecatrônica");
        Professor professor = new Professor ("Mariana", 35, "Linguagem de Marcação");
       
        
        System.out.println("========Aluno========");
        aluno.apresentarAluno();
        System.out.println();
        System.out.println("=======Professor=======");
        professor.apresentarProfessor();
        System.out.println();
       
       
    }
}