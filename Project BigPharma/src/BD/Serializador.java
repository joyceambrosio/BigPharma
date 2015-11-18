/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import bigpharma.model.Compra;
import bigpharma.model.Pessoa;
import bigpharma.model.PessoaFisico;
import bigpharma.model.PessoaJuridico;
import bigpharma.model.Produto;
import bigpharma.model.Venda;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Adeline
 */
public class Serializador {

    public Serializador() {
    }

    public void serializar(File file, Object obj) throws Exception {
        FileOutputStream outFile = new FileOutputStream(file);
        ObjectOutputStream s = new ObjectOutputStream(outFile);
        s.writeObject(obj);
        s.close();
    }

    public Object deserializar(String path) throws Exception {
        FileInputStream inFile = new FileInputStream((new File (path)));
        ObjectInputStream d = new ObjectInputStream(inFile);
        Object o = d.readObject();
        d.close();
        return o;
    }

    public void serializaProdutos(ArrayList<Produto> lista) {
        try {
            File file = new File("produtos");
            this.serializar(file,lista);
        } catch (Exception ex) {
            System.err.println("Falha ao serializar! - " + ex.toString());
        }

    }

    public ArrayList<Produto> deserializaProdutos() {
        ArrayList<Produto> lista = new ArrayList();
        try {
            lista = (ArrayList<Produto>) this.deserializar("produtos");
        } catch (Exception ex) {
            System.err.println("Falha ao deserializar! "+ ex.toString());
        }
        return lista;
    }
    
    public void serializaClientes(ArrayList<Pessoa> lista) {
        try {
            File file = new File("clientes");
            this.serializar(file,lista);
        } catch (Exception ex) {
            System.err.println("Falha ao serializar! - " + ex.toString());
        }

    }

    public ArrayList<Pessoa> deserializaClientes() {
        ArrayList<Pessoa> lista = new ArrayList();
        try {
            lista = (ArrayList<Pessoa>) this.deserializar("clientes");
        } catch (Exception ex) {
            System.err.println("Falha ao deserializar! "+ ex.toString());
        }
        return lista;
    }
    
     public void serializaFornecedores(ArrayList<PessoaJuridico> lista) {
        try {
            File file = new File("fornecedores");
            this.serializar(file,lista);
        } catch (Exception ex) {
            System.err.println("Falha ao serializar! - " + ex.toString());
        }

    }

    public ArrayList<PessoaJuridico> deserializaFornecedores() {
        ArrayList<PessoaJuridico> lista = new ArrayList();
        try {
            lista = (ArrayList<PessoaJuridico>) this.deserializar("fornecedores");
        } catch (Exception ex) {
            System.err.println("Falha ao deserializar! "+ ex.toString());
        }
        return lista;
    }
    
    public void serializaFuncionarios(ArrayList<PessoaFisico> lista) {
        try {
            File file = new File("funcionarios");
            this.serializar(file,lista);
        } catch (Exception ex) {
            System.err.println("Falha ao serializar! - " + ex.toString());
        }

    }

    public ArrayList<PessoaFisico> deserializaFuncionarios() {
        ArrayList<PessoaFisico> lista = new ArrayList();
        try {
            lista = (ArrayList<PessoaFisico>) this.deserializar("funcionarios");
        } catch (Exception ex) {
            System.err.println("Falha ao deserializar! "+ ex.toString());
        }
        return lista;
    }
    
    public void serializaCompras(ArrayList<Compra> lista) {
        try {
            File file = new File("compras");
            this.serializar(file,lista);
        } catch (Exception ex) {
            System.err.println("Falha ao serializar! - " + ex.toString());
        }

    }

    public ArrayList<Compra> deserializaCompras() {
        ArrayList<Compra> lista = new ArrayList();
        try {
            lista = (ArrayList<Compra>) this.deserializar("compras");
        } catch (Exception ex) {
            System.err.println("Falha ao deserializar! "+ ex.toString());
        }
        return lista;
    }
    
    public void serializaVendas(ArrayList<Venda> lista) {
        try {
            File file = new File("vendas");
            this.serializar(file,lista);
        } catch (Exception ex) {
            System.err.println("Falha ao serializar! - " + ex.toString());
        }

    }

    public ArrayList<Venda> deserializaVendas() {
        ArrayList<Venda> lista = new ArrayList();
        try {
            lista = (ArrayList<Venda>) this.deserializar("vendas");
        } catch (Exception ex) {
            System.err.println("Falha ao deserializar! "+ ex.toString());
        }
        return lista;
    }
}
