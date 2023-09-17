import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codConvite) {
        convidadosSet.add(new Convidado(nome, codConvite));
    }

    public void removerConvidado(int codConvite) {
        Convidado convidadosParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodConvite() == codConvite) {
                convidadosParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadosParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

        conjuntoConvidados.adicionarConvidado("Ednaldo Pereira", 14567);
        conjuntoConvidados.adicionarConvidado("Maria da Silva", 14568);
        conjuntoConvidados.adicionarConvidado("João Souza", 14569);
        conjuntoConvidados.adicionarConvidado("Ana Santos", 14570);
        conjuntoConvidados.adicionarConvidado("Carlos Oliveira", 14571);
        conjuntoConvidados.adicionarConvidado("Luísa Fernandes", 14567);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");
        // conjuntoConvidados.removerConvidado(14567); Que absurdo remover ednaldo pereira
        conjuntoConvidados.exibirConvidados();
    }
}
