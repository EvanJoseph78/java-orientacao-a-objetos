package list;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  // atributo
  private List<Tarefa> tarefaList;

  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  public ListaTarefa(List<Tarefa> tarefaList) {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa t : tarefaList) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(tarefaList);
  }

  @Override
  public String toString() {
    return "ListaTarefa [tarefaList=" + tarefaList + "]";
  }

  public static void main(String[] args) {
    ListaTarefa listaTarefa = new ListaTarefa();
    System.out.println("O número total de tarfas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    listaTarefa.adicionarTarefa("Arrumar um emprego");
    listaTarefa.adicionarTarefa("Comprar uma tela");
    listaTarefa.adicionarTarefa("Estudar inglês");
    System.out.println("O número total de tarfas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    listaTarefa.removerTarefa("Estudar inglês");
    System.out.println("O número total de tarfas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    listaTarefa.obterDescricoesTarefas();

  }

}

