/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import bigpharma.model.AbsModel;
import bigpharma.model.Transacao;
import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class ListaTransacao implements ITransacao {
    public ArrayList<Transacao> lista = null;
    
    public ListaTransacao () {
        if (this.lista == null) 
            lista = new ArrayList();
    }

    public void add(Transacao obl) throws Exception {
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
}
