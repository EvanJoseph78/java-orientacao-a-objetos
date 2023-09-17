package pesquisaemset;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        for (Contato c : contatosSet) {
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisaPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Ednaldo Pereira", 40028922);
        agendaContatos.adicionarContato("Ednaldo Caneta azul", 77777777);
        agendaContatos.adicionarContato("Maria da Silva", 12345678);
        agendaContatos.adicionarContato("João Souza", 98765432);
        agendaContatos.adicionarContato("Ana Santos", 55555555);
        agendaContatos.adicionarContato("Carlos Oliveira", 11112222);
        agendaContatos.adicionarContato("Luísa Fernandes", 99998888);

        // agendaContatos.exibirContatos();
        agendaContatos.atualizarNumeroContato("Ednaldo Pereira", 77778888);
        // agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisaPorNome("Ednaldo"));

    }
}
