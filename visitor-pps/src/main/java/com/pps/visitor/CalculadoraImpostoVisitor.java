
package com.pps.visitor;

/* Visitor concreto responsável apenas pela lógica fiscal. */
public class CalculadoraImpostoVisitor implements Visitor {
    private double totalImposto = 0;

    public void visitar(Alimento alimento) {
        totalImposto += 0;
    }

    public void visitar(Eletronico eletronico) {
        totalImposto += eletronico.getPreco() * 0.15;
    }

    public void visitar(BebidaAlcoolica bebida) {
        totalImposto += bebida.getPreco() * 0.40;
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
