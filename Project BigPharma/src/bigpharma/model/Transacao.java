/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.model;

import bigpharma.composite.ITransacao;
import java.util.ArrayList;

/**
 *
 * @author Adeline
 */
public abstract class Transacao extends AbsModel implements ITransacao {

    ArrayList<Produto> transacaoItems;

    public void add(Produto produto) {
        this.transacaoItems.add(produto);
    }

    public void remove(Produto produto) {
        this.transacaoItems.remove(produto);
    }

    public void setItems(ArrayList<Produto> transacaoItems) {
        this.transacaoItems = transacaoItems;
    }

    public ArrayList<Produto> getItems() {
        return transacaoItems;
    }
}
