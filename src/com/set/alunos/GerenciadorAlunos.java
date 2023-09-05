package com.set.alunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private final Set<Aluno> listaAlunos = new HashSet<>();
    public void adicionarAluno(String nome, Long matricula, Double media) {
        this.listaAlunos.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(Long matricula) {
        this.listaAlunos.removeIf(aluno -> aluno.getMatricula().equals(matricula));
    }
    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<Aluno>(this.listaAlunos);
    }
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> listaAlunosPorNota = new TreeSet<>(new ComparatorPorNota());
        listaAlunosPorNota.addAll(this.listaAlunos);
        return listaAlunosPorNota;
    }
    public void exibirAlunos() {
        System.out.println(this.listaAlunos);
    }
}
