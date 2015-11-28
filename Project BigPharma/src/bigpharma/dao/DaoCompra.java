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
public class DaoCompra extends AbsDao {

    private static DaoCompra instancia = null;

    private DaoCompra() throws Exception {
        super(BridgeSettings.getDefaultPersistencia());
        super.fileName = "Compra";
        load();
    }

    public static DaoCompra getInstancia() throws Exception {
        if (instancia == null) {
            instancia = new DaoCompra();
        }
        return instancia;
    }
    
}
