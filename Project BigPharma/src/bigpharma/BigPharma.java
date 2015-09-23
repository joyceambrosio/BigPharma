/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bigpharma;

import bigpharma.model.ClienteFisico;
import bigpharma.model.ClienteJuridico;

/**
 *
 * @author Joyce
 */
public class BigPharma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int documento, int id, String nome, String endereco, String telefone

        ClienteFisico novoCliente1 = new ClienteFisico(123456, 1, "Joyce Ambrosio", "Rua Lol", 552123489);
        ClienteFisico novoCliente2 = new ClienteFisico(123456, 2, "Adeline Sharla", "Rua Lol", 552123489);
        ClienteJuridico novoCliente3 = new ClienteJuridico(123456, 1, "TiMart Falida", "Rua Lol", 552123489);
        ClienteJuridico novoCliente4 = new ClienteJuridico(123456, 2, "Empresa das putas", "Rua Lol", 552123489);
        
        
        System.out.println(novoCliente1);
        System.out.println(novoCliente2);
        System.out.println(novoCliente3);
        System.out.println(novoCliente4);
        
    }
    
}
