
package com.pps.visitor;

/* Produto concreto isento de imposto. */
public class Alimento implements Produto {
    private final double preco;

    public Alimento(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
