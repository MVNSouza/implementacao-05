
package com.pps.templatemethod;

/* Implementação concreta que personaliza a formatação e exportação em PDF. */
public class GeradorRelatorioPDF extends RelatorioFinanceiroTemplate {
    @Override
    protected String processarDados(String dados) {
        return "[PDF] " + dados.replace("|", "\n");
    }

    @Override
    protected void exportarArquivo(String conteudo) {
        System.out.println("Exportando PDF:");
        System.out.println(conteudo);
    }
}
