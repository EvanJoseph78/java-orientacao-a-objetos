package carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    List<Produto> carrinhoCompras;
    float valorTotal;

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
        this.valorTotal = 0;
    }

    public void adicionarProduto(String nome, float preco) {
        this.carrinhoCompras.add(new Produto(nome, preco));
        this.valorTotal += preco;
    }

    public void removerProduto(String nome) {
        List removerProdutos = new ArrayList<>();
        for (Produto p : this.carrinhoCompras) {
            if (p.getProdutoNome().equalsIgnoreCase(nome)) {
                removerProdutos.add(p);
                this.valorTotal -= p.getProdutoPreco();
            }

        }
        this.carrinhoCompras.removeAll(removerProdutos);
    }

    public void exibirItens() {
        for (Produto p : this.carrinhoCompras) {
            System.out.printf("Produto: %s - Preço: R$ %.2f%n", p.getProdutoNome(), p.getProdutoPreco());
        }
    }

    public void exibirValorTotal() {
        System.out.println(this.valorTotal);
    }

    @Override
    public String toString() {
        return "CarrinhoCompras [carrinhoCompras=" + carrinhoCompras + "]";
    }

    public static void main(String[] args) {
        CarrinhoCompras c = new CarrinhoCompras();
        c.adicionarProduto("Tela-samsung", 700);
        c.adicionarProduto("Teclado", 100);
        c.adicionarProduto("Teclado", 100);
        c.adicionarProduto("Teclado", 100);
        c.removerProduto("teclado");
        c.exibirItens();
        c.exibirValorTotal();

    }
}
