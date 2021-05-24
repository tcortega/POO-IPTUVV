package com.grupo11.iptuvv.menu;

import com.grupo11.iptuvv.models.Imovel;
import com.grupo11.iptuvv.models.Municipio;
import com.grupo11.iptuvv.forms.FormsImovel;
import com.grupo11.iptuvv.forms.FormsMenu;
import com.grupo11.iptuvv.forms.FormsMunicipio;
import com.grupo11.iptuvv.helpers.Handlers;

public class Menu
{
    public static final Municipio municipio = new Municipio();

    /**
     * Método usado para chamada do menu principal
     */
    public static void exibir()
    {
        while (true)
        {
            int escolha = FormsMenu.menuPrincipal();
            if (escolha == 0)
                break;

            Handlers.escolha(escolha);
        }
    }

    public static void cadastrarImoveis()
    {
        Imovel imovel = FormsImovel.cadastroImovel();
        municipio.addImovel(imovel);
        FormsImovel.sucessoCadastroImovel(imovel.getMatricula());
    }

    public static void removerImoveis()
    {
        String matricula = FormsMunicipio.buscaImovel();
        Imovel imovelEscolha = municipio.getImovel(matricula);
        if (imovelEscolha == null)
        {
            FormsMunicipio.imovelNaoEncontrado(matricula);
        } else
        {
            boolean escolhaRemocao = FormsMunicipio.confirmacaoRemoverImovel(imovelEscolha);

            if (escolhaRemocao)
            {
                municipio.removeImovel(matricula);
                FormsMunicipio.sucessoRemocaoImovel();
            }
        }
    }

    public static void simularImpostoDevido()
    {
        int quantidadeImoveis = municipio.getQuantidadeImoveis();
        if (quantidadeImoveis == 0)
        {
            FormsMunicipio.semImoveisCadastradosSimulacao();
        } else
        {
            float valorTotal = municipio.simularValorTotalDevido();
            FormsMunicipio.simulacaoImpostoTotal(valorTotal, quantidadeImoveis);
        }
    }

    public static void processarImpostoDevido()
    {
        int quantidadeImoveis = municipio.getQuantidadeImoveis();
        if (quantidadeImoveis == 0)
        {
            FormsMunicipio.semImoveisCadastradosProcessamento();
        } else
        {
            float valorTotal = municipio.processarTodosImoveis();
            FormsMunicipio.processarImpostoTotal(valorTotal, quantidadeImoveis);
        }
    }

    public static void processarImovelEspecifico()
    {
        String matricula = FormsMunicipio.buscaImovel();
        Imovel imovelEscolha = municipio.getImovel(matricula);

        if (imovelEscolha == null)
        {
            FormsMunicipio.imovelNaoEncontrado(matricula);
        } else if (!imovelEscolha.getStatusProcessado() || FormsMunicipio.confirmacaoReprocessarImovel(imovelEscolha))
        {
            imovelEscolha = municipio.processarImovel(imovelEscolha);
            FormsMunicipio.sucessoProcessamentoImovel(imovelEscolha);
        }
    }

    public static void escolhaNaoExiste()
    {
        FormsMenu.escolhaNaoExiste();
    }
}
