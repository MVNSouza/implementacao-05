
package com.pps.templatemethod;

/* Classe abstrata que define o algoritmo fixo do Template Method para geração de relatórios. */
public abstract class RelatorioFinanceiroTemplate {
    public final void gerarRelatorio() {
        String dados = lerDadosBanco();
        String dadosFormatados = processarDados(dados);
        String conteudoFinal = adicionarCabecalhoERodape(dadosFormatados);
        exportarArquivo(conteudoFinal);
    }

    protected String lerDadosBanco() {
        return "Receita: 10000 | Despesa: 7000 | Lucro: 3000";
    }

    protected abstract String processarDados(String dados);

    protected String adicionarCabecalhoERodape(String conteudo) {
        return "=== EMPRESA PPS ===\n" + conteudo + "\n=== FIM DO RELATÓRIO ===";
    }

    protected abstract void exportarArquivo(String conteudo);
}
