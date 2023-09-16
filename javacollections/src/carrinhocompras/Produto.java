package carrinhocompras;

public class Produto {
    private String produtoNome;
    private float produtoPreco;

    public Produto() {
    }

    public Produto(String produtoNome, float produtoPreco) {
        this.produtoNome = produtoNome;
        this.produtoPreco = produtoPreco;
    }

    public String getProdutoNome() {
        return produtoNome;
    }

    public void setProdutoNome(String produtoNome) {
        this.produtoNome = produtoNome;
    }

    public float getProdutoPreco() {
        return produtoPreco;
    }

    public void setProdutoPreco(float produtoPreco) {
        this.produtoPreco = produtoPreco;
    }

    @Override
    public String toString() {
        return "Produto [produtoNome=" + produtoNome + ", produtoPreco=" + produtoPreco + "]";
    }

}
