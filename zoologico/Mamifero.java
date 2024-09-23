package zoologico;

public class Mamifero extends Animal {
    private String corPelo;
    @Override
    public void locomover(){
        System.out.println("Andando");
    }

    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}
