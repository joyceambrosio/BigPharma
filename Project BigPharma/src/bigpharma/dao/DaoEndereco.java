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
public class DaoEndereco extends AbsDao {
    
    private static DaoEndereco instancia = null;

    public DaoEndereco() throws Exception {
        super(BridgeSettings.getDefaultPersistencia());
        super.fileName = "Endereco";
        load();
    }

    public static DaoEndereco getInstancia() throws Exception {
        if (instancia == null) {
            instancia = new DaoEndereco();
        }
        return instancia;
    }

}
