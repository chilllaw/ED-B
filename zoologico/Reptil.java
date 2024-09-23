package zoologico;

public class Reptil extends Animal {
    private String CorEscama;


    public void locomover(){
        System.out.println("Rastejando");
    }

    public String getCorEscama() {
        return CorEscama;
    }
    public void setCorEscama(String corEscama) {
        CorEscama = corEscama;
    }

}
