import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    // atributos

    private List<livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new livro(titulo, autor, anoPublicacao));
    }

    public List<livro> pesquiarPorAutor(String autor) {
        List<livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public livro pesquisarPorTitulo(String titulo) {
        livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {

        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("titulo 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("titulo 1", "Autor 1", 2021);
        catalogoLivros.adicionarLivro("titulo 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("titulo 3", "Autor 3", 2023);


        System.out.println(".........................................");
        System.out.println(catalogoLivros.pesquiarPorAutor("Autor 3"));
        System.out.println(".........................................");
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
        System.out.println(".........................................");
        System.out.println(catalogoLivros.pesquisarPorTitulo("titulo 2"));
        System.out.println(".........................................");

    }

}
 