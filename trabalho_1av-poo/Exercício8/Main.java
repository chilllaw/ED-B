package exercício8;

public class Main {
    public static void main(String[] args) {
        Eletronico e1 = new Eletronico();
        e1.setNome("Mouse C3Tech");
        e1.setPreco(87.20);
        e1.setGarantia(1);

        Alimento a1 = new Alimento();
        a1.setNome("Pizza");
        a1.setPreco(37.50);
        a1.setDataDeValidade("4 de Outubro");

        e1.calcularPrecoComDesconto();
        a1.calcularPrecoComDesconto();
        
    }
}
