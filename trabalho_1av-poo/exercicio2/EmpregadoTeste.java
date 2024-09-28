package exercicio2;

public class EmpregadoTeste {
    public static void main(String[] args) {

        String nome1 = "Pedro";
        String sobrenome1 = "Raffaine";
        double salarioMensal1 = 3000;

        Empregado empregado1 = new Empregado(nome1, sobrenome1, salarioMensal1);

        String nome2 = "Igor";
        String sobrenome2 = "Guerreiro";
        double salarioMensal2 = 4000;

        Empregado empregado2 = new Empregado(nome2, sobrenome2, salarioMensal2);

        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + " - Salário Anual: R$ "
                + empregado1.calcularSalarioAnual());
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + " - Salário Anual: R$ "
                + empregado2.calcularSalarioAnual());

        empregado1.setSalarioMensal(empregado1.getSalarioMensal() * 1.10);
        empregado2.setSalarioMensal(empregado2.getSalarioMensal() * 1.10);

        System.out.println("Após aumento:");
        System.out.println(empregado1.getNome() + " " + empregado1.getSobrenome() + " - Novo Salário Anual: R$ "
                + empregado1.calcularSalarioAnual());
        System.out.println(empregado2.getNome() + " " + empregado2.getSobrenome() + " - Novo Salário Anual: R$ "
                + empregado2.calcularSalarioAnual());
    }
}