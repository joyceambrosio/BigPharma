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
public class DaoProduto extends AbsDao {

    private static DaoProduto instancia = null;

    public DaoProduto() throws Exception {
        super(BridgeSettings.getDefaultPersistencia());
        super.fileName = "Produto";
        load();
    }

    public static DaoProduto getInstancia() throws Exception {
        if (instancia == null) {
            instancia = new DaoProduto();
        }
        return instancia;
    }

}
