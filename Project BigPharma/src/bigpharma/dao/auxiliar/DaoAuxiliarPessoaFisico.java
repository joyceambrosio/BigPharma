/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.auxiliar;

import bigpharma.dao.AbsDao;
import bigpharma.dao.DaoPessoaFisico;

/**
 *
 * @author Joyce
 */
public class DaoAuxiliarPessoaFisico extends AbsDaoAuxiliar {

    DaoPessoaFisico dao = null;
    DaoAuxiliarPessoaFisico instancia = null;

    public DaoAuxiliarPessoaFisico() throws Exception  {
        dao = DaoPessoaFisico.getInstancia();
    }
    public DaoAuxiliarPessoaFisico getInstance() throws Exception{
        if(instancia == null)
            instancia = new DaoAuxiliarPessoaFisico();
        return instancia;
    }
       
    @Override
    protected AbsDao getDaoInstance() {
        return instancia.dao;
    }

}
