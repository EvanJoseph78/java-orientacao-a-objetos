package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessooasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessooasPorIdade);
        return pessooasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>();
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoaList;

    }
    
    public void mostrarLista(){
        for(Pessoa pessoa : pessoaList){
            System.out.println(pessoa);
        }
    }

    @Override
    public String toString() {
        return "OrdenacaoPessoa [pessoaList=" + pessoaList + "]\n";
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Ednaldo", 42, 1.75);
        ordenacaoPessoa.adicionarPessoa("Maria", 30, 1.68);
        ordenacaoPessoa.adicionarPessoa("João", 28, 1.80);
        ordenacaoPessoa.adicionarPessoa("Ana", 35, 1.65);
        ordenacaoPessoa.adicionarPessoa("Carlos", 45, 1.70);
        ordenacaoPessoa.adicionarPessoa("Luísa", 22, 1.72);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}
