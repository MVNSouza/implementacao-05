
package com.pps.visitor;

/* Produto concreto tributado em 15%. */
public class Eletronico implements Produto {
    private final double preco;

    public Eletronico(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
