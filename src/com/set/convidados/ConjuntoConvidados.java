package com.set.convidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private final Set<Convidado> convidadosSet = new HashSet<>();
    public void adicionarConvidado(String nome, Integer codigoConvite) {
        this.convidadosSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigo(Integer codigoConvite) {
        for (Convidado convidado : this.convidadosSet) {
            if(convidado.getCodigoConvite().equals(codigoConvite)) {
                this.convidadosSet.remove(convidado);
                break;
            }
        }
    }
    public Integer contarConvidados() {
        return this.convidadosSet.size();
    }
    public void exibirConvidados() {
        System.out.println(this.convidadosSet);
    }
}
