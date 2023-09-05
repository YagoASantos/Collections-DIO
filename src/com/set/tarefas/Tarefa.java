package com.set.tarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private Boolean status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public Boolean getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    @Override
    public String toString() {
        return "{Descrição: " + this.descricao + "; concluído: " + this.status + "}";
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
