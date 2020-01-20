package br.edu.ifal.controle;

import br.edu.ifal.modelo.Lance;
import br.edu.ifal.modelo.Leilao;

/**
 * ControlerLeilao
 */
public class ControlerLeilao {

    public boolean validarLance(Lance novoLance, Leilao leilao){
        boolean validade = false;
        if (novoLance.getValor() >= leilao.getValorMin()) 
            validade = true;
        
        return validade;
    }
}