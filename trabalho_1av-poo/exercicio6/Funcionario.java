package exercicio6;

public class Funcionario {
    private String nome;
    private double salarioBase;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getsalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void calcularSalario(){
        System.out.println(salarioBase);
    }
}
