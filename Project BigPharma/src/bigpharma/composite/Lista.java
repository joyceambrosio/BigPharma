/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.composite;

import bigpharma.model.AbsModel;
import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class Lista extends AbsModel {

    public ArrayList<AbsModel> lista = null;

    public Lista() {
        if (this.lista == null) {
            lista = new ArrayList();
        }
    }

    public void add(AbsModel obl) throws Exception {
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }

        obl.setId(nextId());
        this.lista.add(obl);
    }

    private int nextId() {
        int ID = 0;
//        if (lista != null) {
//            AbsModel item = lista.get((lista.size()+1));
//            ID = item.getId() + 1;
//        } else {
//            ID = 1;
//        }
        if (lista != null) {
            for (AbsModel item : lista) {
                if (item.getId() > ID) {
                    ID = (item.getId()+1);
                }
            }
        }
        
            return ID;
        
    }

    public void remove(AbsModel obl) throws Exception {

        this.lista.remove(obl);

    }

    public AbsModel get(int index) {

        return lista.get(index);

    }

    public int size() {

        return lista.size();

    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public ArrayList<AbsModel> getAll() {
        return this.lista;
    }
}
