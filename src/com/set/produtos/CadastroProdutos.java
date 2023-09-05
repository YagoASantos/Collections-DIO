package com.set.produtos;

import java.math.BigDecimal;
import java.util.*;

public class CadastroProdutos {
    private final Set<Produto> produtos = new HashSet<>();
    public void adicionarProduto(Long codigo, String nome, double preco, Integer quantidade) {
        this.produtos.add(new Produto(codigo, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(this.produtos);
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> listaProdutos = new TreeSet<>(new ComparatorPorPreco());
        listaProdutos.addAll(this.produtos);
        return listaProdutos;
    }
}
class ComparatorPorPreco implements Comparator<Produto> {
    @Override
    public int compare(Produto produto1, Produto produto2) {
        return produto1.getPreco().compareTo(produto2.getPreco());
    }
}
