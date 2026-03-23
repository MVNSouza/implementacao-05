
package com.pps.visitor;

/* Interface Visitor que separa regras externas das classes de produto. */
public interface Visitor {
    void visitar(Alimento alimento);
    void visitar(Eletronico eletronico);
    void visitar(BebidaAlcoolica bebida);
}
