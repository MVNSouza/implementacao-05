
package com.pps.visitor;

/* Produto concreto tributado em 40%. */
public class BebidaAlcoolica implements Produto {
    private final double preco;

    public BebidaAlcoolica(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
