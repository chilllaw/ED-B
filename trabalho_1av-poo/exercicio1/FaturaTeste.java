package exercicio1;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura f1 = new Fatura();
        f1.setQuantidadeComprada(8);
        f1.setPrecoPorItens(34.5);
        f1.getTotalFatura();
    }
}
