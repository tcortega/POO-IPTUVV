package com.grupo11.iptuvv.util;

import javax.swing.*;

/**
 * A classe <tt>leDadosWin</tt> permite a leitura de dados de tipos nativos e de
 * instancias da classe <tt>String</tt> a partir do teclado, atraves de uma
 * janela. Basicamente esta classe encapsula o funcionamento dos metodos da clase
 * <tt>JOptionPane</tt>, que pode ser usado como entrada padrao de dados.
 * <ul>
 * <li>Os metodos sao estaticos para facilitar o uso da classe
 * <li>Criacao de metodos sobrecarregados para que valores <i>default</i> possam ser
 *     usados
 * <li>Tratamento das excecoes
 */
public class InOut
{
    /**
     * Este metodo eh para entrada de uma String. Tem como parametro de entrada
     * uma String que indicara para o usuario qual o dado que sera lido naquele
     * momento por aquela caixa de texto e retorna a String lida
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return String que foi lida
     */
    public static String leString(String frase, String nomeJanela)
    {
        String Entrada;

        Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                JOptionPane.QUESTION_MESSAGE);

		if (Entrada == null)
			System.exit(0);

        return Entrada;
    }

    /**
     * Este metodo eh para entrada de um objeto do tipo byte. Tem como parametro
     * de entrada uma String que indicara para o usuario qual o dado que sera
     * lido naquele momento por aquela caixa de texto.
     * Le entao uma String e a converte para um objeto do tipo byte.
     * Se na conversao ocorrer algum erro, o processo sera feito novamente,
     * ou seja, sera lida outra String e convertida para byte. O processo soh
     * para quando a conversao for bem sucedida.
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return um objeto do tipo byte
     */
    public static byte leByte(String frase, String nomeJanela)
    {
        byte num = 0;
        String Entrada;
        boolean ERRO;

        do
        {
            try
            {
                Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                        JOptionPane.QUESTION_MESSAGE);

				if (Entrada == null)
					System.exit(0);

                num = Byte.parseByte(Entrada);
                ERRO = false;
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
                                "BYTE", "   >>>      ERRO     <<<",
                        JOptionPane.ERROR_MESSAGE);
                ERRO = true;
            }
        } while (ERRO);
        return num;
    }

    /**
     * Este metodo eh para entrada de um objeto do tipo short. Tem como parametro
     * de entrada uma String que indicara para o usuario qual o dado que sera
     * lido naquele momento por aquela caixa de texto.
     * Le entao uma String e a converte para um objeto do tipo short.
     * O processo so para quando a conversao for bem sucedida.
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return um objeto do tipo short
     */
    public static short leShort(String frase, String nomeJanela)
    {
        short num = 0;
        String Entrada;
        boolean ERRO;

        do
        {
            try
            {
                Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                        JOptionPane.QUESTION_MESSAGE);

				if (Entrada == null)
					System.exit(0);

                num = Short.parseShort(Entrada);
                ERRO = false;
            } catch (NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
                                "SHORT", "   >>>      ERRO     <<<",
                        JOptionPane.ERROR_MESSAGE);
                ERRO = true;
            }
        } while (ERRO);
        return num;
    }

    /**
     * Este metodo eh para entrada de um objeto do tipo int. Tem como parametro
     * de entrada uma String que indicara para o usuario qual o dado que sera
     * lido naquele momento por aquela caixa de texto.
     * Le entao uma String e a converte para um objeto do tipo int.
     * O processo so para quando a conversao for bem sucedida.
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return um objeto do tipo int
     */
    public static int leInt(String frase, String nomeJanela)
    {
        int num = 0;
        String Entrada;
        boolean ERRO;

        do
        {
            try
            {
                Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                        JOptionPane.QUESTION_MESSAGE);

				if (Entrada == null)
					System.exit(0);

                num = Integer.parseInt(Entrada);
                ERRO = false;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
                                "INTEIRO ", "   >>>      ERRO     <<<",
                        JOptionPane.ERROR_MESSAGE);
                ERRO = true;
            }
        } while (ERRO);
        return num;
    }

    /**
     * Este metodo eh para entrada de um objeto do tipo long. Tem como parametro
     * de entrada uma String que indicara para o usuario qual o dado que sera
     * lido naquele momento por aquela caixa de texto.
     * Le entao uma String e a converte para um objeto do tipo long.
     * O processo so para quando a conversao for bem sucedida.
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return um objeto do tipo long
     */
    public static long leLong(String frase, String nomeJanela)
    {
        long num = 0;
        String Entrada;
        boolean ERRO;

        do
        {
            try
            {
                Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                        JOptionPane.QUESTION_MESSAGE);

				if (Entrada == null)
					System.exit(0);

                num = Long.parseLong(Entrada);
                ERRO = false;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
                                "LONG ", "   >>>      ERRO     <<<",
                        JOptionPane.ERROR_MESSAGE);
                ERRO = true;
            }
        } while (ERRO);
        return num;
    }

    /**
     * Este metodo eh para entrada de um objeto do tipo float. Tem como parametro
     * de entrada uma String que indicara para o usuario qual o dado que sera
     * lido naquele momento por aquela caixa de texto.
     * Le entao uma String e a converte para um objeto do tipo float.
     * O processo so para quando a conversao for bem sucedida.
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return um objeto do tipo float
     */
    public static float leFloat(String frase, String nomeJanela)
    {
        float num = 0;
        String Entrada;
        boolean ERRO;

        do
        {
            try
            {
                Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                        JOptionPane.QUESTION_MESSAGE);

				if (Entrada == null)
					System.exit(0);

                num = Float.parseFloat(Entrada);
                ERRO = false;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
                                "FLOAT", "   >>>      ERRO     <<<",
                        JOptionPane.ERROR_MESSAGE);
                ERRO = true;
            }
        } while (ERRO);
        return num;
    }

    /**
     * Este metodo eh para entrada de um objeto do tipo double. Tem como paraametro
     * de entrada uma String que indicara para o usuario qual o dado que sera
     * lido naquele momento por aquela caixa de texto.
     * Le entao uma String e a converte para um objeto do tipo double.
     * O processo so para quando a conversao for bem sucedida.
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return um objeto do tipo double
     */
    public static double leDouble(String frase, String nomeJanela)
    {
        double num = 0;
        String Entrada;
        boolean ERRO;

        do
        {
            try
            {
                Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                        JOptionPane.QUESTION_MESSAGE);

				if (Entrada == null)
					System.exit(0);

                num = Double.parseDouble(Entrada);
                ERRO = false;
            } catch (Exception e)
            {
                JOptionPane.showMessageDialog(null, "VALOR DEVE SER UM N�MERO DO TIPO " +
                                "DOUBLE", "   >>>      ERRO     <<<",
                        JOptionPane.ERROR_MESSAGE);
                ERRO = true;
            }
        } while (ERRO);
        return num;
    }

    /**
     * Este metodo eh para entrada de um objeto do tipo char. Tem como parametro
     * de entrada uma String que indicara para o usuario qual o dado que sera
     * lido naquele momento por aquela caixa de texto.
     * Le entao uma String e retorna apenas o primeiro caracter da String.
     *
     * @param frase que sera usada para o usuario saber qual dado sera lido
     * @return um objeto do tipo char
     */
    public static char leChar(String frase, String nomeJanela)
    {
        String Entrada;
        boolean ERRO;

        do
        {
            Entrada = JOptionPane.showInputDialog(null, frase, nomeJanela,
                    JOptionPane.QUESTION_MESSAGE);

			if (Entrada == null)
				System.exit(0);

            ERRO = Entrada.length() == 0;
        } while (ERRO);
        return Entrada.charAt(0);
    }

    public static boolean leBoolean(String frase, String nomeJanela) {
        int escolha = JOptionPane.showConfirmDialog(null, frase, nomeJanela, JOptionPane.YES_NO_OPTION);

        if (escolha == -1)
            System.exit(0);

        return escolha != 1;
    }

    /**
     * Este metodo foi criado para mandar uma mensagem com o icone de
     * ERRO
     *
     * @param cabecalho que aparecera no topo da mensagem
     * @param frase     que aparecera dentro da caixa de mensagem
     */
    public static void MsgDeErro(String cabecalho, String frase)
    {
        JOptionPane.showMessageDialog(null, frase, cabecalho, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Este metodo foi criado para mandar uma mensagem com o icone de
     * INFORMACAO
     *
     * @param cabecalho que aparecer no topo da mensagem
     * @param frase     que aparecera dentro da caixa de mensagem
     */
    public static void MsgDeInformacao(String cabecalho, String frase)
    {
        JOptionPane.showMessageDialog(null, frase, cabecalho,
                JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * Este metodo foi criado para mandar uma mensagem sem icone
     *
     * @param cabecalho que aparecera no topo da mensagem
     * @param frase     que aparecera dentro da caixa de mensagem
     */
    public static void MsgSemIcone(String cabecalho, String frase)
    {
        JOptionPane.showMessageDialog(null, frase, cabecalho,
                JOptionPane.PLAIN_MESSAGE);
    }

    /**
     * Este metodo foi criado para mandar uma mensagem com o icone de
     * AVISO
     *
     * @param cabecalho que aparecera no topo da mensagem
     * @param frase     que aparecera dentro da caixa de mensagem
     */
    public static void MsgDeAviso(String cabecalho, String frase)
    {
        JOptionPane.showMessageDialog(null, frase, cabecalho,
                JOptionPane.WARNING_MESSAGE);
    }
}