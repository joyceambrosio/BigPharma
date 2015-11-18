/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Adeline
 */
public class Compra implements Serializable{
    private PessoaJuridico fornecedor = null;
    ArrayList<Produto> compraItems;
    private static final Date date = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/M/yyyy");
    
    public Compra(){
        compraItems = new ArrayList();
    }
        
    public void add(Produto produto){
        this.compraItems.add(produto); 
    }
    
    public void remove(Produto produto){
        this.compraItems.remove(produto); 
    }
    
    public void setCompraItems(ArrayList<Produto> compraItems) {
        this.compraItems = compraItems;
    }
    
    public void setFornecedor(PessoaJuridico fornecedor){
        this.fornecedor = fornecedor;
    }
    
    
    
//    public Date getCurDate() {
//        return curDate;
//    }

    public PessoaJuridico getFornecedor() {
        return fornecedor;
    }

    public ArrayList<Produto> getCompraItems() {
        return compraItems;
    }


    
    
}
