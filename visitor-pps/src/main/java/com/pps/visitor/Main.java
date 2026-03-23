
package com.pps.visitor;

/* Classe principal para demonstrar cálculo de imposto com Visitor. */
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarProduto(new Alimento(20));
        carrinho.adicionarProduto(new Eletronico(1000));
        carrinho.adicionarProduto(new BebidaAlcoolica(50));

        CalculadoraImpostoVisitor visitor = new CalculadoraImpostoVisitor();
        carrinho.aplicarVisitor(visitor);

        System.out.println("Total de imposto: " + visitor.getTotalImposto());
    }
}
