/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

/**
 *
 * @author Adeline
 */
public class Compra extends Transacao {

    private PessoaJuridico fornecedor = null;

    public void setFornecedor(PessoaJuridico fornecedor) {
        this.fornecedor = fornecedor;
    }

    public PessoaJuridico getFornecedor() {
        return fornecedor;
    }

}
