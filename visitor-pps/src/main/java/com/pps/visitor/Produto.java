
package com.pps.visitor;

/* Interface base dos elementos visitáveis do carrinho. */
public interface Produto {
    double getPreco();
    void aceitar(Visitor visitor);
}
