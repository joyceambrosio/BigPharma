/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

import java.io.Serializable;

/**
 *
 * @author Joyce
 */
public class Produto implements Serializable{
 
    private int id;
    private String nome;
    private double preco;
    private double qtdeEstoque=0;

    public Produto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    

    public void setQtdeEstoque(double qtdeEstoque) {
        this.qtdeEstoque =+ qtdeEstoque;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
       return nome;
    }
    
    
    
    

}
