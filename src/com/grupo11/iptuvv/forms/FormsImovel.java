package com.grupo11.iptuvv.forms;

import com.grupo11.iptuvv.models.Imovel;
import com.grupo11.iptuvv.util.InOut;

public class FormsImovel
{
    private static final String CADASTRO_DE_IMOVEIS = "CADASTRO DE IMÓVEIS";

    public static Imovel cadastroImovel()
    {
        String nomeProprietario = InOut.leString("Insira o nome do proprietário", CADASTRO_DE_IMOVEIS);
        float impostoImovel = InOut.leInt("Insira o valor do imposto a ser pago", CADASTRO_DE_IMOVEIS);
        int mesesAtraso = InOut.leInt("Insira os meses em atraso para o pagamento", CADASTRO_DE_IMOVEIS);

        return new Imovel(nomeProprietario, impostoImovel, mesesAtraso);
    }

    public static void sucessoCadastroImovel(String matricula)
    {
        InOut.MsgDeInformacao(CADASTRO_DE_IMOVEIS, "Cadastro de imóvel realizado com sucesso! Matrícula: " + matricula);
    }
}
