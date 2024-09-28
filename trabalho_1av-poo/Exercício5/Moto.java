package exercício5;
public class Moto extends Veiculo {
    private String tipoDeGuidon;

    public String getTipoDeGuidon() {
        return tipoDeGuidon;
    }

    public void setTipoDeGuidon(String tipoDeGuidon) {
        this.tipoDeGuidon = tipoDeGuidon;
    }
    

    @Override

    public void e(){
        System.out.println("Marca: "+this.getAno());
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Marca: "+this.getModelo());
        System.out.println("Tipo de Guidon: "+this.tipoDeGuidon);
    }

}
