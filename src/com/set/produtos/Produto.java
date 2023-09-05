package com.set.produtos;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private Long codigo;
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

    public Produto(Long codigo, String nome, double preco, Integer quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = BigDecimal.valueOf(preco).setScale(2, RoundingMode.HALF_EVEN);
        this.quantidade = quantidade;
    }

    public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public int compareTo(Produto produto) {
        return this.nome.compareToIgnoreCase(produto.nome);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return Objects.equals(getCodigo(), produto.getCodigo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }
}
