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
public class Venda extends Transacao {

    private PessoaFisico funcionario = null;
    private Pessoa cliente = null;

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

}
