package com.list.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaDeTarefas {
    private List<Tarefa> listTarefa;

    public ListaDeTarefas() {
        this.listTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        listTarefa.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        listTarefa.removeIf(tarefa -> tarefa.getDescricao().equalsIgnoreCase(descricao));

    }
    public int obterNumeroTotalDeTarefas() {
        return this.listTarefa.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(listTarefa);
    }
}
