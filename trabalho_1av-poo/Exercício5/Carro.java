package exercício5;
public class Carro extends Veiculo {
    private int numeroDePortas;

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    @Override
    public void e(){
        System.out.println("Marca: "+this.getAno());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Marca: "+this.getModelo());
        System.out.println("Número de portas: "+this.numeroDePortas);
    }

}
