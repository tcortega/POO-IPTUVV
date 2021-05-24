package com.grupo11.iptuvv.forms;

import com.grupo11.iptuvv.models.Imovel;
import com.grupo11.iptuvv.util.InOut;

public class FormsMunicipio
{
    private static final String SIMULACAO_DE_IMPOSTO_DEVIDO = "SIMULAÇÃO DE IMPOSTO DEVIDO";
    private static final String PROCESSAR_IMPOSTO_DEVIDO = "PROCESSAMENTO DE IMPOSTO DEVIDO";
    private static final String MSG_SEM_CADASTRO_DE_IMOVEIS = "Não há imóveis cadastrados no município.";
    private static final String BUSCA_DE_IMOVEIS = "BUSCA DE IMÓVEIS";
    private static final String REMOVER_IMOVEL = "REMOVER IMÓVEL";
    private static final String PROCESSAMENTO_IMOVEL = "PROCESSAMENTO DE IMÓVEL ESPECÍFICO";

    public static void simulacaoImpostoTotal(float valorTotal, int quantidadeImoveis)
    {
        String frase = String.format("Quantidade de imóveis no município: %d", quantidadeImoveis) + System.lineSeparator()
                + String.format("Valor total a ser pago: %.2f", valorTotal);

        InOut.MsgDeInformacao(SIMULACAO_DE_IMPOSTO_DEVIDO, frase);
    }

    public static void processarImpostoTotal(float valorTotal, int quantidadeImoveis)
    {
        String frase = String.format("Quantidade de imóveis processados: %d", quantidadeImoveis) + System.lineSeparator()
                + String.format("Valor total a ser pago: %.2f", valorTotal);

        InOut.MsgDeInformacao(PROCESSAR_IMPOSTO_DEVIDO, frase);
    }

    public static void semImoveisCadastradosSimulacao()
    {
        InOut.MsgDeAviso(SIMULACAO_DE_IMPOSTO_DEVIDO, MSG_SEM_CADASTRO_DE_IMOVEIS);
    }

    public static void semImoveisCadastradosProcessamento()
    {
        InOut.MsgDeAviso(PROCESSAR_IMPOSTO_DEVIDO, MSG_SEM_CADASTRO_DE_IMOVEIS);
    }

    public static String buscaImovel()
    {
        return InOut.leString("Insira a matrícula do imóvel que deseja buscar", BUSCA_DE_IMOVEIS);
    }

    public static void imovelNaoEncontrado(String matricula)
    {
        InOut.MsgDeErro(BUSCA_DE_IMOVEIS, "Não existe nenhum imóvel com a matrícula " + matricula + System.lineSeparator() + "Você digitou errado?");
    }

    public static boolean confirmacaoRemoverImovel(Imovel imovel)
    {
        String frase = "Deseja realmente remover o imóvel do município?" + System.lineSeparator() + System.lineSeparator() + imovel.toString();
        return InOut.leBoolean(frase, REMOVER_IMOVEL);
    }

    public static boolean confirmacaoReprocessarImovel(Imovel imovel)
    {
        String frase = "Deseja realmente reprocessar o imóvel?" + System.lineSeparator() + System.lineSeparator() + imovel.toString();
        return InOut.leBoolean(frase, PROCESSAMENTO_IMOVEL);
    }

    public static void sucessoRemocaoImovel()
    {
        InOut.MsgDeInformacao(REMOVER_IMOVEL, "Imóvel removido com sucesso!");
    }

    public static void sucessoProcessamentoImovel(Imovel imovel)
    {
        InOut.MsgDeInformacao(PROCESSAMENTO_IMOVEL, "Imóvel reprocessado com sucesso!" + System.lineSeparator() + System.lineSeparator() + imovel.toString());
    }
}
