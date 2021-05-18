package com.grupo11.iptuvv;

import com.grupo11.iptuvv.entity.Municipio;
import com.grupo11.iptuvv.handler.Handlers;
import com.grupo11.iptuvv.util.InOut;

public class Main
{
    public final static Municipio municipio = new Municipio();

    public static void main(String[] args)
    {
        while (true)
        {
            int escolha = InOut.leInt(MENU, "MENU DE OPÇÕES");
            if (escolha == 0)
                break;

            Handlers.escolha(escolha);
        }
    }

    private static final String MENU = "1 - Cadastrar imóvel" + System.lineSeparator() +
            "2 - Remover imóvel" + System.lineSeparator() +
            "3 - Simular imposto total devido" + System.lineSeparator() +
            "4 - Processar multa sob todos imóveis" + System.lineSeparator() +
            "5 - Processar imóvel específico" + System.lineSeparator() +
            System.lineSeparator() +
            "0 - Sair do programa";
}
