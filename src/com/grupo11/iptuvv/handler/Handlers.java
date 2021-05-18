package com.grupo11.iptuvv.handler;

import com.grupo11.iptuvv.entity.Imovel;
import com.grupo11.iptuvv.forms.FormsImovel;
import com.grupo11.iptuvv.forms.FormsMunicipio;

import static com.grupo11.iptuvv.Main.municipio;

public class Handlers
{
    public static void escolha(int escolha)
    {
        switch (escolha)
        {
            // Cuida do cadastro de imóveis
            case 1:
            {
                Imovel imovel = FormsImovel.cadastroImovel();
                municipio.addImovel(imovel);
                FormsImovel.sucessoCadastroImovel(imovel.getMatricula());
                break;
            }
            // Cuida da remoção de cadastro de imóveis
            case 2:
            {
                String matricula = FormsImovel.buscaImovel();
                Imovel imovelEscolha = municipio.getImovel(matricula);
                if (imovelEscolha == null)
                {
                    FormsImovel.imovelNaoEncontrado(matricula);
                    break;
                }

                boolean escolhaRemocao = FormsImovel.removerImovel(imovelEscolha);

                if (escolhaRemocao)
                    municipio.removeImovel(matricula);

                break;
            }
            case 3:
            {
                int quantidadeImoveis = municipio.getQuantidadeImoveis();
                if (quantidadeImoveis == 0)
                {
                    FormsMunicipio.semImoveisCadastradosSimulacao();
                    break;
                }
                float valorTotal = municipio.simularValorTotalDevido();
                FormsMunicipio.simulacaoImpostoTotal(valorTotal, quantidadeImoveis);
                break;
            }
            case 4:
            {
                int quantidadeImoveis = municipio.getQuantidadeImoveis();
                if (quantidadeImoveis == 0)
                {
                    FormsMunicipio.semImoveisCadastradosProcessamento();
                    break;
                }
                float valorTotal = municipio.processarTodosImoveis();
                FormsMunicipio.processarImpostoTotal(valorTotal, quantidadeImoveis);
                break;
            }
        }
    }
}
