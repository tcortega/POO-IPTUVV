package com.grupo11.iptuvv.forms;

import com.grupo11.iptuvv.entity.Imovel;
import com.grupo11.iptuvv.util.InOut;

public class FormsImovel
{
    public static final String CADASTRO_DE_IMOVEIS = "CADASTRO DE IMÓVEIS";
    public static final String BUSCA_DE_IMOVEIS = "BUSCA DE IMÓVEIS";
    public static final String REMOVER_IMOVEL = "REMOVER IMÓVEL";

    public static Imovel cadastroImovel()
    {
        String nomeProprietario = InOut.leString("Insira o nome do proprietário", CADASTRO_DE_IMOVEIS);
        float impostoImovel = InOut.leInt("Insira o valor do imposto a ser pago", CADASTRO_DE_IMOVEIS);
        int mesesAtraso = InOut.leInt("Insira os meses em atraso para o pagamento", CADASTRO_DE_IMOVEIS);

        Imovel imovel = new Imovel(nomeProprietario, impostoImovel, mesesAtraso);
        return imovel;
    }

    public static void sucessoCadastroImovel(String matricula)
    {
        InOut.MsgDeInformacao(CADASTRO_DE_IMOVEIS, "Cadastro de imóvel realizado com sucesso! Matrícula: " + matricula);
    }

    public static String buscaImovel()
    {
        String matricula = InOut.leString("Insira a matrícula do imóvel que deseja buscar", BUSCA_DE_IMOVEIS);
        return matricula;
    }

    public static void imovelNaoEncontrado(String matricula)
    {
        InOut.MsgDeErro(BUSCA_DE_IMOVEIS, "Não existe nenhum imóvel com a matrícula " + matricula + System.lineSeparator() + "Você digitou errado?");
    }

    public static boolean removerImovel(Imovel imovel)
    {
        String frase = "Deseja realmente remover o imóvel do município?" + System.lineSeparator() + System.lineSeparator() + imovel.toString();
        boolean escolha = InOut.leBoolean(frase, REMOVER_IMOVEL);
        return escolha;
    }
}
