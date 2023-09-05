package com.list.list.carrinhodecompras;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private final List<Item> carrinho = new ArrayList<>();

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        carrinho.removeIf(item -> item.getNome().equalsIgnoreCase(nome));
    }

    public BigDecimal calcularValorTotal() {
        BigDecimal total = new BigDecimal("0");
        for (Item item : carrinho) {
            total = total.add(item.getPreco());
        }
        return total;
    }

    public void exibirItens() {
        System.out.println(this.carrinho);
    }
}
