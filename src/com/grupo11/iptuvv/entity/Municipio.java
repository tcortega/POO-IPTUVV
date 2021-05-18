package com.grupo11.iptuvv.entity;

import java.util.HashMap;
import java.util.Map;

public class Municipio
{
    private final HashMap<String, Imovel> imoveis;
    private float valorRecebido;

    public Municipio()
    {
        this.imoveis = new HashMap<>();
    }

    public void addImovel(Imovel imovel)
    {
        String matricula = this.gerarMatricula(imovel);
        imovel.setMatricula(matricula);
        this.imoveis.put(matricula, imovel);
    }

    public Imovel getImovel(String matricula)
    {
        return imoveis.get(matricula);
    }

    public void removeImovel(String matricula)
    {
        imoveis.remove(matricula);
    }

    public int getQuantidadeImoveis() {
        return this.imoveis.size();
    }

    private String gerarMatricula(Imovel imovel)
    {
        String primeiroNome = imovel.getPrimeiroNome().toLowerCase();
        return primeiroNome + "vv" + this.imoveis.size();
    }

    public float processarTodosImoveis()
    {
        float valorTotal = 0.0f;
        for (Map.Entry<String, Imovel> entry : imoveis.entrySet())
        {
            Imovel imovel = entry.getValue();

            float valorProcessado = calcularMulta(imovel);

            valorTotal += valorProcessado;

            imovel.setImposto(valorProcessado);
            imovel.setStatusProcessado(true);
        }

        return valorTotal;
    }

    public float simularValorTotalDevido() {
        float valorTotal = 0.0f;
        for (Map.Entry<String, Imovel> entry : imoveis.entrySet())
        {
            Imovel imovel = entry.getValue();

            float valorProcessado = calcularMulta(imovel);

            valorTotal += valorProcessado;
        }

        return valorTotal;
    }

    private static float calcularMulta(Imovel imovel)
    {
        int mesesAtraso = imovel.getMesesAtraso();
        float valorImposto = imovel.getImposto();

        if (mesesAtraso <= 0)
            return valorImposto;

        if (mesesAtraso <= 5)
            return valorImposto * 1.01f;

        if (mesesAtraso <= 8)
            return valorImposto * 1.023f;

        if (mesesAtraso <= 10)
            return valorImposto * 1.03f;

        if (mesesAtraso <= 12)
            return valorImposto * 1.054f;

        return valorImposto * 1.1f;
    }
}
