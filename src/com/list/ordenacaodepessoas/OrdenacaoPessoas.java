package com.list.ordenacaodepessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private final List<Pessoa> pessoaList = new ArrayList<>();
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> listaPorIdade = new ArrayList<>(this.pessoaList);
        Collections.sort(listaPorIdade);
        return listaPorIdade;
    }
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaPorAltura = new ArrayList<>(this.pessoaList);
        listaPorAltura.sort(new ComparatorPorAltura());
        return listaPorAltura;
    }
}
