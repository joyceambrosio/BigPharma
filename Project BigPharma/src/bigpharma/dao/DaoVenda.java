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
public class DaoVenda extends AbsDao {

    private static DaoVenda instancia = null;

    private DaoVenda() throws Exception {
        super(BridgeSettings.getDefaultPersistencia());
        super.fileName = "Venda";
        load();
    }

    public static DaoVenda getInstancia() throws Exception {
        if (instancia == null) {
            instancia = new DaoVenda();
        }
        return instancia;
    }
}
