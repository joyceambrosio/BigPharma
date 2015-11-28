/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao;

import bigpharma.dao.auxiliar.AbsDaoAuxiliar;

/**
 *
 * @author Joyce
 */
public class DaoAuxiliarProduto extends AbsDaoAuxiliar {
    
    DaoProduto dao = null;
    DaoAuxiliarProduto instancia = null;
            
     private DaoAuxiliarProduto() throws Exception {
        dao = DaoProduto.getInstancia();
    }

    public DaoAuxiliarProduto getInstance() throws Exception {
        if (instancia == null) {
            instancia = new DaoAuxiliarProduto();
        }
        return instancia;
    }

    @Override
    protected AbsDao getDaoInstance() {
        return instancia.dao;
    }
    
}
