package biblioteca;

public class usuario {
    private String nome;
    private String idUser;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getIdUser() {
        return idUser;
    }
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public void emprestar_livro(livro livro) {
        if (livro.estaDisponivel()) {
            livro.emprestar();
        } else {
            System.out.println("O livro "+ livro.getTitulo() +"não está disponível.");
        }
    }
    public void devolver_livro(livro livro) {
        livro.devolver();
    }
}
