package com.grupo11.iptuvv.handler;

import com.grupo11.iptuvv.menu.Menu;

public class Handlers
{
    public static void escolha(int escolha)
    {
        switch (escolha)
        {
            case 1:
            {
                Menu.cadastrarImoveis();
                break;
            }
            case 2:
            {
                Menu.removerImoveis();
                break;
            }
            case 3:
            {
                Menu.simularImpostoDevido();
                break;
            }
            case 4:
            {
                Menu.processarImpostoDevido();
                break;
            }
            case 5:
            {
                Menu.processarImovelEspecifico();
                break;
            }
            default:
            {
                Menu.escolhaNaoExiste();
            }
        }
    }
}
