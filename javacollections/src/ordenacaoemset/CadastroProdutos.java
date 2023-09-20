package ordenacaoemset;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long codProduto, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(codProduto, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public void exibirProdutos() {
        for (Produto p : produtosSet) {
            System.out.println(p.getNome() + " - COD:" + p.getCodProduto() + " R$: " + p.getPreco() + " quantidade:"
                    + p.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.exibirProdutos();
        cadastroProdutos.adicionarProduto(1L, "Monitor gamer", 700, 10);
        cadastroProdutos.adicionarProduto(2L, "Teclado mecânico", 100, 3);
        cadastroProdutos.adicionarProduto(3L, "Mouse sem fio", 40, 5);
        cadastroProdutos.adicionarProduto(4L, "Fone de ouvido Bluetooth", 80, 2);
        cadastroProdutos.adicionarProduto(1L, "Impressora a laser", 250, 1);
        cadastroProdutos.adicionarProduto(6L, "Cadeira gamer", 200, 4);
        // cadastroProdutos.exibirProdutos();

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("----------------------");
System.out.println(cadastroProdutos.exibirProdutosPorPreco());

        // mostrar(cadastroProdutos);
    }

    public static void mostrar(CadastroProdutos c) {
        for (Produto p : c.produtosSet) {
            System.out.println(p);
        }
    }

}
