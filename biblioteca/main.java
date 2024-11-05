package biblioteca;


public class main {
    public static void main(String[] args) {
        livro l1 = new livro();
        l1.setAnoPubli(1967);
        l1.setAutor("Gabriel García Márquez");
        l1.setISBN("5432167890");
        l1.setTitulo("Cem Anos de Solidão");

        livro l2 = new livro();
        l2.setAnoPubli(1844);
        l2.setAutor("Joaquim Manuel de Macedo");
        l2.setISBN("6789012345");
        l2.setTitulo("A Moreninha");

        livro l3 = new livro();
        l3.setAnoPubli(1949);
        l3.setAutor("George Orwell");
        l3.setISBN("9876543210");
        l3.setTitulo("1984");

        biblioteca biblioteca = new biblioteca();
        biblioteca.adicionar_livro(l1);
        biblioteca.adicionar_livro(l2);
        biblioteca.adicionar_livro(l3);

        usuario u1 = new usuario();
        u1.setIdUser("ID123");
        u1.setNome("Carlinhos Games");
        

        biblioteca.listar_livros_disponiveis();

        System.out.println("Usuário empresta o livro 'Cem Anos de Solidão':");
        u1.emprestar_livro(l1);

        biblioteca.listar_livros_disponiveis();

        System.out.println("Usuário devolve o livro 'Cem Anos de Solidão':");
        u1.devolver_livro(l1);

        System.out.println("Buscando livro por título '1984':");
        livro livroEncontrado = biblioteca.buscar_livro_por_titulo("1984");
        if (livroEncontrado != null) {
            livroEncontrado.exibir_detalhes();
        }
    }
}

