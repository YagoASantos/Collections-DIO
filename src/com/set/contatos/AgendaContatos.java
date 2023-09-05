package com.set.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private final Set<Contato> contatoSet = new HashSet<>();

    public void adicionarContato(String nome, Integer numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(this.contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato contato : contatosPorNome) {
            if (contato.getNome().startsWith(nome)) {
                contatosPorNome.add(contato);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizaNumeroContato(String nome, Integer numero) {
        for (Contato contato : this.contatoSet) {
            if (contato.getNome().equals(nome)) {
                contato.setNumero(numero);
                return contato;
            }
        }
        return null;
    }
}
