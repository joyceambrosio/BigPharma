/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.negocio;

import bigpharma.model.Produto;

/**
 *
 * @author Joyce
 */
public class VendaItem {
    private final Produto produto;
    private double quantidade;

    public VendaItem(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }
    
    public double getTotal(){
       return produto.getPreco()*this.quantidade;

    }
    
}
