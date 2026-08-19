public class Funcionario{
    
    String nomeFuncionario;
    int idade;
    String cargo;
    double salario;
   
    
   
    public Funcionario(String nomeFuncionario,int idade, String cargo, double salario){
        this.nomeFuncionario = nomeFuncionario;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
    }
    
  
    public String getNomeFuncionario(){
        return nomeFuncionario;
    }
    public int getIdade(){
        return idade;
    }
    public String getCargo(){
        return cargo;
    }
    public double getSalario(){
        return salario;
    }
    
  
    public void setNomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
    }
    public void setIdade(int Idade){
        this.idade = idade;
    }
    public void setCargo(String cargo){
        this.cargo = cargo; 
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    
     
    
    public void apresentar(){
        System.out.println("Nome do Funcionário: " + nomeFuncionario);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    
  
    }
    
}