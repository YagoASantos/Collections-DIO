package com.set.tarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private final Set<Tarefa> tarefaSet = new HashSet<>();

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        for (Tarefa tarefa : this.tarefaSet) {
            if (tarefa.getDescricao().equals(descricao)) {
               this.tarefaSet.remove(tarefa);
               break;
            }
        }
    }
    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }
    public Integer contarTarefas() {
        return this.tarefaSet.size();
    }
    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa tarefa : this.tarefaSet) {
            if(tarefa.getStatus()) {
                tarefasConcluidas.add(tarefa);
            }
        }
        return tarefasConcluidas;
    }
    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa tarefa : this.tarefaSet) {
            if(!tarefa.getStatus()) {
                tarefasPendentes.add(tarefa);
            }
        }
        return tarefasPendentes;
    }
    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa tarefa : this.tarefaSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatus(true);
                break;
            }
        }
    }
    public void marcarTarefaPendente(String descricao) {
        for (Tarefa tarefa : this.tarefaSet) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefa.setStatus(false);
                break;
            }
        }
    }
    public void limparListaTarefas() {
        this.tarefaSet.clear();
    }
}
