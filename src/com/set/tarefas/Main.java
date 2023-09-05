package com.set.tarefas;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Teste1");
        listaTarefas.adicionarTarefa("Teste2");
        listaTarefas.adicionarTarefa("Teste3");
        listaTarefas.adicionarTarefa("Teste4");
        listaTarefas.adicionarTarefa("Teste5");
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaConcluida("Teste1");
        listaTarefas.marcarTarefaConcluida("Teste2");
        listaTarefas.exibirTarefas();
        listaTarefas.marcarTarefaPendente("Teste1");
        listaTarefas.exibirTarefas();
    }
}
