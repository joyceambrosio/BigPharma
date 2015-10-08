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
public class ClienteFisico extends Cliente{

    public ClienteFisico(int id, String nome, String documento, String telefone, String rua, String bairro, String numero, String cep) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.telefone = telefone;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.cep = cep;
        this.limiteVenda = 1000.0;
    }
    
    public double getLimiteVenda(){
        return this.limiteVenda;
    }
    
}
