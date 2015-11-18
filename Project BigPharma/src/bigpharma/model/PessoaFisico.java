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
public class PessoaFisico extends Pessoa{
    
    public PessoaFisico(int documento, int id, String nome, Endereco endereco, int telefone) {
        super(documento, id, nome, endereco, telefone);
    }

    @Override
    double getLimiteVenda() {
        return 1000.0;
    }
    
    @Override
    public String toString() {
       return nome;
    }

}
