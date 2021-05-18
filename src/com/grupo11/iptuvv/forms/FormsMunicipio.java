package com.grupo11.iptuvv.forms;

import com.grupo11.iptuvv.util.InOut;

public class FormsMunicipio
{
    public static void simulacaoImpostoTotal(float valorTotal, int quantidadeImoveis)
    {
        String frase = String.format("Quantidade de imóveis no município: %d", quantidadeImoveis) + System.lineSeparator()
                + String.format("Valor total a ser pago: %.2f", valorTotal);

        InOut.MsgDeInformacao("SIMULAÇÃO DE IMPOSTO DEVIDO", frase);
    }
}
