/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.composite;

import bigpharma.model.AbsModel;
import bigpharma.model.Produto;
import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class ListaItem implements IItem {
    
    public ArrayList<Produto> lista = null;
    
    public ListaItem() {
        if (this.lista == null) {
            lista = new ArrayList();
        }
    }
    
    public void add(Produto obl) throws Exception {
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }
        if (obl.getId() == 0) {
            obl.setId(nextId());
            this.lista.add(obl);
        }
    }
    
    private int nextId() {
        int ultId = 0;
        if (lista != null) {
            for (AbsModel item : lista) {
                if (item.getId() > ultId) {
                    ultId = item.getId();
                }
            }
        }
        
        return ++ultId;
    }
    
    public void remove(Produto obl) throws Exception {
        
        this.lista.remove(obl);
        
    }
    
    public Produto get(int index) {
        
        return lista.get(index);
        
    }
    
    public int size (){
    
        return lista.size();
        
    }
    
    public ArrayList<Produto> getAll(){
        return this.lista;
    }
}
