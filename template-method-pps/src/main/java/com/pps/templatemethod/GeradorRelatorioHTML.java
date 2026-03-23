
package com.pps.templatemethod;

/* Implementação concreta que personaliza a formatação e exportação em HTML. */
public class GeradorRelatorioHTML extends RelatorioFinanceiroTemplate {
    @Override
    protected String processarDados(String dados) {
        return "<html><body><p>" + dados.replace("|", "<br>") + "</p></body></html>";
    }

    @Override
    protected void exportarArquivo(String conteudo) {
        System.out.println("Exportando HTML:");
        System.out.println(conteudo);
    }
}
