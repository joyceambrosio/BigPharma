/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao;

import bigpharma.dao.bridge.BridgeSettings;

/**
 *
 * @author Joyce
 */
public class DaoPessoaFisico extends AbsDao {

    private static DaoPessoaFisico instancia = null;

    private DaoPessoaFisico() throws Exception {
        super(BridgeSettings.getDefaultPersistencia());
        super.fileName = "ClienteFisico";
        load();
    }

    public static DaoPessoaFisico getInstancia() throws Exception {
        if (instancia == null) {
            instancia = new DaoPessoaFisico();
        }
        return instancia;
    }

}
