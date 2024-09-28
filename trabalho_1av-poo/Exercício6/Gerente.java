package exercício6;

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
        //double sf = this.getsalarioBase()+bonus;
        System.out.println(+this.getsalarioBase()+bonus);
        //System.out.println(sf);
    }
}
