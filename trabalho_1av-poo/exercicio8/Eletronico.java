package exercicio8;

public class Eletronico extends Produto{
    private int garantia;
    public int getGarantia() {
        return garantia;
    }
    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }
    @Override
    public void calcularPrecoComDesconto(){
        
        System.out.println(this.getPreco()-this.getPreco()*0.1);
    }
}
