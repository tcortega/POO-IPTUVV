package com.grupo11.iptuvv.forms;

import com.grupo11.iptuvv.util.InOut;

public class FormsMunicipio
{
    public static final String SIMULACAO_DE_IMPOSTO_DEVIDO = "SIMULAÇÃO DE IMPOSTO DEVIDO";

    public static void simulacaoImpostoTotal(float valorTotal, int quantidadeImoveis)
    {
        String frase = String.format("Quantidade de imóveis no município: %d", quantidadeImoveis) + System.lineSeparator()
                + String.format("Valor total a ser pago: %.2f", valorTotal);

        InOut.MsgDeInformacao(SIMULACAO_DE_IMPOSTO_DEVIDO, frase);
    }

    public static void semImoveisCadastrados()
    {
        InOut.MsgDeAviso(SIMULACAO_DE_IMPOSTO_DEVIDO, "Não há imóveis cadastrados no município.");
    }
}
