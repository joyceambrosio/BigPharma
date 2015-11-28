/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao;

import bigpharma.dao.bridge.IPersistencia;
import bigpharma.model.AbsModel;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public class AbsDao {

    protected java.util.List<AbsModel> lista;
    protected String fileName = null;
    private IPersistencia formaPersistencia = null;

    public AbsDao(IPersistencia FormaPersistencia) {
        this.formaPersistencia = FormaPersistencia;
    }

    public void add(AbsModel obl) throws Exception {
        if (this.lista == null) {
            this.lista = new ArrayList<>();
        }

//        if (obl.getId() == 0) {
//            obl.setId(nextId());
        this.lista.add(obl);
//        }
        save();
    }

//    private int nextId() {
//        int ultId = 0;
//        if (lista != null) {
//            for (AbsModel item : lista) {
//                if (item.getId() > ultId) {
//                    ultId = item.getId();
//                }
//            }
//        }
//
//        return ++ultId;
//    }
    public void remove(AbsModel obl) throws Exception {
        if (this.lista == null) {
            this.lista = new ArrayList<AbsModel>();
        }
        int pos = -1;
        for (AbsModel item : lista) {
            if (item.getId() == obl.getId()) {
                pos = lista.indexOf(item);
            }
        }
        this.lista.remove(pos);

        save();
    }

    public void save() throws Exception {
        if (fileName != null) {
            this.formaPersistencia.salva(lista, fileName);
        }
    }

//    public AbsModel obtem(int Id) {
//        if (lista != null) {
//            for (AbsModel item : lista) {
//                if (item.getId() == Id) {
//                    return (AbsModel) item;
//                }
//            }
//        }
//        return null;
//    }
    public void load() throws Exception {
        if (fileName != null) {
            lista = (ArrayList<AbsModel>) formaPersistencia.recupera(fileName);
        }
    }

    public ArrayList<AbsModel> obtemTodos() {
        ArrayList<AbsModel> result = new ArrayList<>();
        if (lista != null) {
            for (AbsModel item : this.lista) {
                result.add((AbsModel) item);
            }
        }
        return result;
    }
}
