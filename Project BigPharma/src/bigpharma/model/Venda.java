/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Adeline
 */
public class Venda implements Serializable{
    private PessoaFisico funcionario = null;
    private Pessoa cliente = null;
    ArrayList<Produto> vendaItems;

   
    public Venda() {
         vendaItems = new ArrayList();
    }
    
    public void add(Produto produto){
        this.vendaItems.add(produto); 
    }
    
    public void remove(Produto produto){
        this.vendaItems.remove(produto); 
    }

    public void setFuncionario(PessoaFisico funcionario) {
        this.funcionario = funcionario;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public PessoaFisico getFuncionario() {
        return funcionario;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public ArrayList<Produto> getVendaItems() {
        return vendaItems;
    }

    public void setVendaItems(ArrayList<Produto> vendaItems) {
        this.vendaItems = vendaItems;
    }

    
    
}
