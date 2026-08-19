public class Gerente extends Funcionario{
    private int quantidadeSupervisao;
    private double bonus;
    
    public Gerente(String nome, double salario, String setor, int quantidadeSupervisao, double bonus){
        super(nome, salario, setor);
        this.quantidadeSupervisao = quantidadeSupervisao;
        this.bonus = bonus; 
    }
    
    public int getQuantidadeSupervisao(){
        return quantidadeSupervisao;
    }
    public void setQuantidadeSupervisao(int quantidadeSupervisao) {
        this.quantidadeSupervisao = quantidadeSupervisao;
    }
    public double bonus(){
        return bonus; 
    }
    
    public void apresentarGerente(){
        apresentar();
        System.out.println("Quantidade de Funcionários Supervisionados: " + quantidadeSupervisao);
        System.out.println("Bônus em porcentagem: " + bonus);
    }
}