package exercicio6;

public class Gerente extends Funcionario{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    @Override
    public void calcularSalario(){
        System.out.println(+this.getsalarioBase()+bonus);
    }
}
