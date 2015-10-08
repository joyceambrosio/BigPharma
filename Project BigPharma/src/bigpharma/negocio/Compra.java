package bigpharma.negocio;


import bigpharma.model.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.IdentityHashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joyce
 */
public class Compra {
    private Date data;
    private IdentityHashMap id;
    private ArrayList<CompraItem> produtos;
    CompraItem compraItem;
    
    public void addProduto(Produto produto, double quantidade){
        compraItem = new CompraItem(produto, quantidade);
        produtos.add(compraItem);
        
    }
    
    public void removeProduto(Produto produto, double quantidade){
        produtos.remove(new CompraItem(produto, quantidade));
    }
    
    public void getTotal (){
        double preco = 0;
        for (CompraItem p: produtos){
            preco += p.getTotal();
        }
    
    }
}
