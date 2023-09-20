package pesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutoMap;

    public EstoqueProdutos() {
        this.estoqueProdutoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        estoqueProdutoMap.put(cod, new Produto(cod, nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;

    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutoMap.isEmpty()) {
            for (Produto p : estoqueProdutoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }

            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        
        estoqueProdutos.adicionarProduto(1L, "Monitor gamer", 700, 10);
        estoqueProdutos.adicionarProduto(2L, "Teclado mecânico", 100, 3);
        estoqueProdutos.adicionarProduto(3L, "Mouse sem fio", 40, 5);
        estoqueProdutos.adicionarProduto(4L, "Fone de ouvido Bluetooth", 80, 2);
        estoqueProdutos.adicionarProduto(1L, "Impressora a laser", 250, 1);
        estoqueProdutos.adicionarProduto(6L, "Cadeira gamer", 200, 4);

        
        estoqueProdutos.exibirProdutos();
        System.out.println("Valor total do estoque: R$ " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Valor total do produto mais caro: R$ " + estoqueProdutos.obterProdutoMaisCaro());
    }

}
