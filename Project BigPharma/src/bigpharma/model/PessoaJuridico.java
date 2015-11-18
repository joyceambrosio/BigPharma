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
public class PessoaJuridico extends Pessoa {

    private String razaoSocial;

    public PessoaJuridico(int documento, int id, String nome, Endereco endereco, int telefone, String razaoSocial) {
        super(documento, id, nome, endereco, telefone);
        this.razaoSocial = razaoSocial;
    }

    @Override
    double getLimiteVenda() {
        return 5000.0;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return nome;
    }
}
