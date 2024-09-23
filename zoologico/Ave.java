package zoologico;

public class Ave extends Animal {
    private String corPena;

    @Override
    public void locomover(){
        System.out.println("Voando");
    }

    public void fazNinho(){
        System.out.println("Fazendo ninho");
    }
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
