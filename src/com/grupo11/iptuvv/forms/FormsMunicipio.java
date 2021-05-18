package com.grupo11.iptuvv.forms;

import com.grupo11.iptuvv.util.InOut;

public class FormsMunicipio
{
    public static final String SIMULACAO_DE_IMPOSTO_DEVIDO = "SIMULAÇÃO DE IMPOSTO DEVIDO";
    public static final String PROCESSAR_IMPOSTO_DEVIDO = "PROCESSAMENTO DE IMPOSTO DEVIDO";
    public static final String MSG_SEM_CADASTRO_DE_IMOVEIS = "Não há imóveis cadastrados no município.";

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
}
