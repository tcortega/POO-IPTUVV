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
            int escolha = InOut.leInt(textoMenu(), "MENU DE OPÇÕES");
            if (escolha == 0)
                break;

            Handlers.escolha(escolha);
        }
    }

    private static String textoMenu()
    {
        StringBuilder textoMenu = new StringBuilder();
        textoMenu.append("1 - Cadastrar imóvel" + System.lineSeparator());
        textoMenu.append("2 - Remover imóvel" + System.lineSeparator());
        textoMenu.append("3 - Simular imposto total devido" + System.lineSeparator());
        textoMenu.append("4 - Processar multa sob todos imóveis" + System.lineSeparator());
        textoMenu.append("5 - Processar imóvel específico" + System.lineSeparator());
        textoMenu.append(System.lineSeparator());
        textoMenu.append("0 - Sair do programa");

        return textoMenu.toString();
    }
}
