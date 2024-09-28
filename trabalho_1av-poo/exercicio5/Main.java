package exercicio5;
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setAno(2005);
        c1.setModelo("Fiat Uno");
        c1.setMarca("Fiat");
        c1.setNumeroDePortas(4);

        Moto m1 = new Moto();
        m1.setAno(2005);
        m1.setModelo("Fazer FZ25");
        m1.setMarca("Yamaha");
        m1.setTipoDeGuidon("4");

        m1.e();

        c1.e();
    }
}
