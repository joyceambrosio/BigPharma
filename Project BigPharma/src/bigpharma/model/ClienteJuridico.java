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
public class ClienteJuridico extends Cliente {
   
    public ClienteJuridico(int id, String nome, String documento, String telefone, String rua, String bairro, String numero, String cep) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.limiteVenda = 5000.0;
    }
   
    public double getLimiteVenda(){
        return this.limiteVenda;
    }
    
}