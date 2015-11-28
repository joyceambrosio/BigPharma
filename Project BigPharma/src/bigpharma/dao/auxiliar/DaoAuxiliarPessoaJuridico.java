/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.auxiliar;

import bigpharma.dao.AbsDao;
import bigpharma.dao.DaoPessoaJuridico;

/**
 *
 * @author Joyce
 */
public class DaoAuxiliarPessoaJuridico extends AbsDaoAuxiliar {

    DaoPessoaJuridico dao = null;
    DaoAuxiliarPessoaJuridico instancia = null;

    private DaoAuxiliarPessoaJuridico() throws Exception {
        dao = DaoPessoaJuridico.getInstancia();
    }

    public DaoAuxiliarPessoaJuridico getInstance() throws Exception {
        if (instancia == null) {
            instancia = new DaoAuxiliarPessoaJuridico();
        }
        return instancia;
    }

    @Override
    protected AbsDao getDaoInstance() {
        return instancia.dao;
    }

}
