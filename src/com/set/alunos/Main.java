package com.set.alunos;

public class Main {
    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("teste1", 1L, 10.0);
        gerenciadorAlunos.adicionarAluno("teste1", 1L, 5.0);
        gerenciadorAlunos.adicionarAluno("teste2", 2L, 9.0);
        gerenciadorAlunos.adicionarAluno("teste5", 3L, 7.0);
        gerenciadorAlunos.adicionarAluno("teste7", 4L, 8.0);
        gerenciadorAlunos.exibirAlunos();
        gerenciadorAlunos.removerAluno(1L);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
