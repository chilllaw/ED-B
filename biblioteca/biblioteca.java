package biblioteca;
import java.util.ArrayList;
import java.util.List;
public class biblioteca {
    
    private List<livro> livros;

    public biblioteca() {
        livros = new ArrayList<>();
    }


    public void adicionar_livro(livro livro) {
        livros.add(livro);
        System.out.println("O livro "+livro.getTitulo()+" foi adicionado.");
    }
    public void listar_livros_disponiveis() {
        boolean encontrouDisponivel = false;
        System.out.println("Livros disponíveis para empréstimo:");
        for (livro livro : livros) {
            if (livro.estaDisponivel()) {
                livro.exibir_detalhes();
                encontrouDisponivel = true;
            }
        }
        if (!encontrouDisponivel) {
            System.out.println("Não temos livros disponíveis.");
        }
    }
    
    public livro buscar_livro_por_titulo(String titulo) {
        for (livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
                }
            }
            System.out.println("Livro não encontrado.");
            return null;
        }
    }

