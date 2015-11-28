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
public class DaoPessoaJuridico extends AbsDao {
    
    private static DaoPessoaJuridico instancia = null;
    
    private DaoPessoaJuridico() throws Exception {
        super(BridgeSettings.getDefaultPersistencia());
        super.fileName = "ClienteJuridico";
        load();
    }

    public static DaoPessoaJuridico getInstancia() throws Exception {
        if (instancia == null) {
            instancia = new DaoPessoaJuridico();
        }
        return instancia;
    }
}
