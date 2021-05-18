package com.grupo11.iptuvv.forms;

import com.grupo11.iptuvv.util.InOut;

public class FormsMenu
{

    public static final String TITULO_MENU = "MENU DE OPÇÕES";

    public static int menuPrincipal()
    {
        return InOut.leInt(MENU, TITULO_MENU);
    }

    public static void escolhaNaoExiste()
    {
        InOut.MsgDeErro(TITULO_MENU, "A opção escolhida não existe");
    }

    private static final String MENU = "1 - Cadastrar imóvel" + System.lineSeparator() +
            "2 - Remover imóvel" + System.lineSeparator() +
            "3 - Simular imposto total devido" + System.lineSeparator() +
            "4 - Processar multa sob todos imóveis" + System.lineSeparator() +
            "5 - Processar imóvel específico" + System.lineSeparator() +
            System.lineSeparator() +
            "0 - Sair do programa";
}
