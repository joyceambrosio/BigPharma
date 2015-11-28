/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.auxiliar;

import bigpharma.dao.AbsDao;
import bigpharma.dao.DaoVenda;
import bigpharma.dao.auxiliar.AbsDaoAuxiliar;

/**
 *
 * @author Joyce
 */
public class DaoAuxiliarVenda extends AbsDaoAuxiliar {
    
    DaoVenda dao = null;
    DaoAuxiliarVenda instancia = null;
            
     private DaoAuxiliarVenda() throws Exception {
        dao = DaoVenda.getInstancia();
    }

    public DaoAuxiliarVenda getInstance() throws Exception {
        if (instancia == null) {
            instancia = new DaoAuxiliarVenda();
        }
        return instancia;
    }

    @Override
    protected AbsDao getDaoInstance() {
        return instancia.dao;
    }
    
    
}
