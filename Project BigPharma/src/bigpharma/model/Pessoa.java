/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

import bigpharma.composite.IPessoa;
import java.io.Serializable;

/**
 *
 * @author Joyce
 */
public abstract class Pessoa extends AbsModel implements Serializable, IPessoa{

    protected int documento;
    protected int id;
    protected String nome;
    protected Endereco endereco;
    protected int telefone;
    protected double limiteVenda;

    abstract double getLimiteVenda();

    public Pessoa(int documento, String nome, Endereco endereco, int telefone) {
        this.documento = documento;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getDocumento() {
        return documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setLimiteVenda(double limiteVenda) {
        this.limiteVenda = limiteVenda;
    }

    @Override
    abstract public String toString();

}
