package pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {
    private List<Livro> livroList;

    public CatalagoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {

        List<Livro> livrosPorIntervalAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervalAnos.add(l);
                }
            }
        }
        return livrosPorIntervalAnos;
    }

    public Livro pesquisaPorTitul(String titulo) {
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    return l;
                }
            }
        }
        return null;

    }

    public static void main(String[] args) {
        CatalagoLivro catalagoLivro = new CatalagoLivro();
        catalagoLivro.adicionarLivro("1984", "George Orwell", 1868);
        catalagoLivro.adicionarLivro("1984", "George Orwell", 1660);
        catalagoLivro.adicionarLivro("Animal Farm", "George Orwell", 1868);
        catalagoLivro.adicionarLivro("Dom Quixote", "Miguel de Cervantes", 1605);
        catalagoLivro.adicionarLivro("A Máquina do Tempo", "H.G. Wells", 1895);
        catalagoLivro.adicionarLivro("O Grande Gatsby", "F. Scott Fitzgerald", 1925);
        catalagoLivro.adicionarLivro("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        catalagoLivro.adicionarLivro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);

        System.out.println(catalagoLivro.pesquisarPorAutor("George Orwell"));
        System.out.println(catalagoLivro.pesquisaPorIntervaloAnos(1800, 2000));
        System.out.println(catalagoLivro.pesquisaPorTitul("1984"));
    }
}
