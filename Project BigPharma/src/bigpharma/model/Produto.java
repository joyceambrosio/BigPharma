/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class Produto {
 
    // tem que mexer nessa classe
    
    private int id;
    private String nome;
    private double preco;
    private double qtdeEstoque;
    private ArrayList<Produto> componentes;

    public Produto(int id, String nome, double preco, double qtdeEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.qtdeEstoque = qtdeEstoque;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getQtdeEstoque() {
        return qtdeEstoque;
    }
    
    // por exemplo, fica estranho vc voltar o preco sem a quantidade de
    // componentes qeu foi utilizadapra fazer esse produto
    
    public double getPreco(){
        double preco = 0;
        for(Produto p: componentes){
            preco = p.preco;
        }
        return this.preco+preco;
    }    
    

    public void addComponente(Produto produto){
        componentes.add(produto);
    }
    
    public void removeComponente(Produto produto){
        componentes.remove(produto);
    }
    
    public void decrementaEstoque(double qtdEstoque){
        //Decrementa estoque
    }
    
    public void incrementaEstoque(double qtdEstoque){
        //Incrementa estoque
    }
    
    
    

}
