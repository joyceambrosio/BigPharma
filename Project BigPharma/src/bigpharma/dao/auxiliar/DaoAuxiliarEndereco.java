/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.auxiliar;

import bigpharma.dao.AbsDao;
import bigpharma.dao.DaoEndereco;

/**
 *
 * @author Joyce
 */
public class DaoAuxiliarEndereco extends AbsDaoAuxiliar {

    DaoEndereco dao = null;
    DaoAuxiliarEndereco instancia = null;

    private DaoAuxiliarEndereco() throws Exception {
        dao = DaoEndereco.getInstancia();
    }

    public DaoAuxiliarEndereco getInstance() throws Exception {
        if (instancia == null) {
            instancia = new DaoAuxiliarEndereco();
        }
        return instancia;
    }

    @Override
    protected AbsDao getDaoInstance() {
        return instancia.dao;
    }

}
