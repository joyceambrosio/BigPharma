/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.auxiliar;

import bigpharma.dao.AbsDao;
import bigpharma.dao.DaoCompra;

/**
 *
 * @author Joyce
 */
public class DaoAuxiliarCompra extends AbsDaoAuxiliar {

    DaoCompra dao = null;
    DaoAuxiliarCompra instancia = null;

    private DaoAuxiliarCompra() throws Exception {
        dao = DaoCompra.getInstancia();
    }

    public DaoAuxiliarCompra getInstance() throws Exception {
        if (instancia == null) {
            instancia = new DaoAuxiliarCompra();
        }
        return instancia;
    }

    @Override
    protected AbsDao getDaoInstance() {
        return instancia.dao;
    }

}
