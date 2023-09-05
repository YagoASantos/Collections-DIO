package com.set.produtos;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();
        produtos.adicionarProduto(123123L, "teste1", 12, 12);
        produtos.adicionarProduto(123123L, "teste1", 12, 12);
        produtos.adicionarProduto(123124L, "teste5", 50, 12);
        produtos.adicionarProduto(123125L, "teste3", 123, 12);
        produtos.adicionarProduto(123126L, "teste9", 30, 12);
        produtos.adicionarProduto(123127L, "teste6", 2, 12);
        System.out.println(produtos.exibirProdutosPorPreco());
        System.out.println(produtos.exibirProdutosPorNome());

    }
}
