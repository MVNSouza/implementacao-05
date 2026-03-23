
package com.pps.visitor;

import java.util.ArrayList;
import java.util.List;

/* Agrega produtos e aplica visitors sobre todos os itens. */
public class CarrinhoDeCompras {
    private final List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void aplicarVisitor(Visitor visitor) {
        for (Produto produto : produtos) {
            produto.aceitar(visitor);
        }
    }
}
