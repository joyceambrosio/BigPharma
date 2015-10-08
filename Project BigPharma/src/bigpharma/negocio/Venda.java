/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.negocio;

import bigpharma.model.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Joyce
 */
public class Venda {
    private int idVenda;
    private Cliente cliente;
    private Date data;
    private double desconto;
    private Funcionario vendedor;
    private ArrayList<VendaItem> produtos;

    public Venda(Cliente cliente, double desconto, Funcionario vendedor) {
        this.cliente = cliente;
        this.data = Date.from(Instant.EPOCH);
        this.desconto = desconto;
        this.vendedor = vendedor;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getData() {
        return data;
    }

    public double getDesconto() {
        return desconto;
    }

    public Funcionario getVendedor() {
        return vendedor;
    }
    
}
