package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            return agendaContatoMap.get(nome);
        }
        return null;

    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ednaldo Pereira", 40028922);
        agendaContatos.adicionarContato("Ednaldo Pereira", 45654442);
        agendaContatos.adicionarContato("Caneta azul", 77777777);
        agendaContatos.adicionarContato("Maria da Silva", 12345678);
        agendaContatos.adicionarContato("João Souza", 98765432);
        agendaContatos.adicionarContato("Ana Santos", 55555555);
        agendaContatos.adicionarContato("Carlos Oliveira", 11112222);
        agendaContatos.adicionarContato("Luísa Fernandes", 99998888);

        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Maria da Silva");
        agendaContatos.exibirContatos();
    }
}
