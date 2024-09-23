package zoologico;

public class Animal {
    private double peso;
    private int idade;
    private int membros;
    public void locomover(){
        System.out.println("locomovendo");
    }
    public void alimentar(){
        //System.out.println("alimentando");
    }
    public int getIdade() {
        return idade;
    }
    public int getMembros() {
        return membros;
    }
    public double getPeso() {
        return peso;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
