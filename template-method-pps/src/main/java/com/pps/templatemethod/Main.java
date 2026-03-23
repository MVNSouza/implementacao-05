
package com.pps.templatemethod;

/* Classe principal para demonstrar o uso do Template Method. */
public class Main {
    public static void main(String[] args) {
        RelatorioFinanceiroTemplate pdf = new GeradorRelatorioPDF();
        RelatorioFinanceiroTemplate html = new GeradorRelatorioHTML();

        pdf.gerarRelatorio();
        System.out.println("--------------------");
        html.gerarRelatorio();
    }
}
