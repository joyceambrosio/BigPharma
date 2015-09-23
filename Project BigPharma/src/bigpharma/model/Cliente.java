/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

/**
 *
 * @author Joyce
 */
abstract class Cliente {
    protected int documento;
    protected int id;
    protected String nome;
    protected String endereco;
    protected int telefone;
    protected double limiteVenda;
    
    abstract double getLimiteVenda();

    public Cliente(int documento, int id, String nome, String endereco, int telefone) {
        this.documento = documento;
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.limiteVenda = limiteVenda;
    }

    @Override
    abstract public String toString();
    
        
       
}
