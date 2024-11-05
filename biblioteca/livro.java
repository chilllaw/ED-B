package biblioteca;

public class livro {
    private String titulo;
    private String autor;
    private int anoPubli;
    private String ISBN;
    private boolean disponivel;

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = true;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnoPubli() {
        return anoPubli;
    }
    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void exibir_detalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Ano de Publicação: " + anoPubli);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
    }
    public boolean estaDisponivel() {
        return true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro " + titulo + " foi emprestado.");
        } else {
            System.out.println("O livro " + titulo + " não está disponível para empréstimo.");
        }
    }
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("O livro " + titulo + " foi devolvido.");
        } else {
            System.out.println("O livro " + titulo + " não foi emprestado.");
        }
    }
}

