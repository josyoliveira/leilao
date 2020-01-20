package br.edu.ifal.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Leilao
 */
public class Leilao {

    private Produto produto;
    private double valorMin;
    private List<Cliente> clientes;
    private List<Lance> lances;

    public Leilao(Produto produto, double valorMin){
        this.produto = produto;
        this.valorMin = valorMin;
        this.clientes = new ArrayList<>();
        this.lances = new ArrayList<>();
    }

    public Produto getProduto() {
        return produto;
    }

    public double getValorMin() {
        return valorMin;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Lance> getLances() {
        return lances;
    }

    public void adicionarCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public void adicionarLance(Lance lance){
        this.lances.add(lance);
    }


    
}