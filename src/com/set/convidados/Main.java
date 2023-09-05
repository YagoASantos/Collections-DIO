package com.set.convidados;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.adicionarConvidado("convidado1", 1234);
        convidados.adicionarConvidado("convidado2", 1234);
        convidados.adicionarConvidado("convidado3", 1235);
        convidados.adicionarConvidado("convidado4", 1236);
        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();
        convidados.removerConvidadoPorCodigo(1235);
        convidados.exibirConvidados();
    }
}
