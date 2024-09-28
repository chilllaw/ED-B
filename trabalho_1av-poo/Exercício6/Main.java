package exercício6;
public class Main {
    public static void main(String[] args) {
    Gerente g1 = new Gerente();
    g1.setNome("Carlos José");
    g1.setSalarioBase(6150.50);
    g1.setBonus(700);
    g1.calcularSalario();

    Assistente a1 = new Assistente();
    a1.setNome("Matheus Maria");
    a1.setSalarioBase(3000);
    a1.calcularSalario();
    }
}
