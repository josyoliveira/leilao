package br.edu.ifal.controle;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.edu.ifal.modelo.Cliente;
import br.edu.ifal.modelo.Lance;
import br.edu.ifal.modelo.Leilao;
import br.edu.ifal.modelo.Produto;

public class ControleLeilaoTest {

    @Test
    public void deveRetornaVerdadeiroParaUmLanceMaiorQueOValorMinimoDoProduto(){
        Produto produto = new Produto("PS4");
        double valorMin = 2500;
        Leilao leilao = new Leilao(produto, valorMin);
        Cliente cliente = new Cliente(1, "Ana");
        Lance novoLance = new Lance(cliente, 2501);
        ControlerLeilao controle = new ControlerLeilao();
        boolean validadeRetornada = controle.validarLance(novoLance, leilao);
        boolean validadeEsperada = true;
        assertEquals(validadeEsperada, validadeRetornada); 
    }
}