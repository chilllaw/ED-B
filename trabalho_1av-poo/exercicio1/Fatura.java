package exercicio1;

public class Fatura {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItens;

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoPorItens() {
        return precoPorItens;
    }

    public void setPrecoPorItens(double precoPorItens) {
        this.precoPorItens = precoPorItens;
    }

    public void getTotalFatura() {
        double faturaTotal;
        faturaTotal = precoPorItens * quantidadeComprada;
        System.out.println("O preço total é: " + faturaTotal);
    }

}