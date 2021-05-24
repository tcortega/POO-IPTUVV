package com.grupo11.iptuvv.models;

public class Imovel
{
    private String nomeProprietario;
    private float imposto;
    private int mesesAtraso;
    private String matricula;
    private boolean processado;

    public Imovel(String nome, float imposto, int mesesAtraso)
    {
        this.setNome(nome);
        this.setImposto(imposto);
        this.setMesesAtraso(mesesAtraso);
    }

    public String getNome()
    {
        return this.nomeProprietario;
    }

    public void setNome(String nome)
    {
        this.nomeProprietario = nome.trim();
    }

    public float getImposto()
    {
        return this.imposto;
    }

    public void setImposto(float imposto)
    {
        if (imposto < 0) imposto = 0;
        this.imposto = imposto;
    }

    public int getMesesAtraso()
    {
        return this.mesesAtraso;
    }

    public void setMesesAtraso(int mesesAtraso)
    {
        if (mesesAtraso < 0) mesesAtraso = 0;
        this.mesesAtraso = mesesAtraso;
    }

    public String getMatricula()
    {
        return this.matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

    public boolean getStatusProcessado()
    {
        return this.processado;
    }

    public void setStatusProcessado(boolean statusProcessado)
    {
        this.processado = statusProcessado;
    }

    public String getPrimeiroNome()
    {
        return this.nomeProprietario.split("\\s+")[0];
    }

    @Override
    public String toString()
    {
        return "Proprietário: " + this.getNome() + System.lineSeparator() +
                "Imposto devido: " + this.getImposto() + System.lineSeparator() +
                "Meses em atraso: " + this.getMesesAtraso() + System.lineSeparator() +
                "Matrícula: " + this.getMatricula();
    }
}
