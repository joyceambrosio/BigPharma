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

    public ClienteFisico(int documento, int id, String nome, String endereco, int telefone) {
        super(documento, id, nome, endereco, telefone);
    }

    @Override
    double getLimiteVenda() {
        return 1000.0;
    }
    
    @Override
    public String toString() {
       return "Cliente: \n" +
               " Nome: " + nome +
               "\n Id:" + id +
               "\n CPF:" + documento +
               "\n Endereco:" + endereco +
               "\n Telefone:" + telefone +
               "\n Limte Venda" + getLimiteVenda()+
               "\n________________________________"
               ;
    }

}
