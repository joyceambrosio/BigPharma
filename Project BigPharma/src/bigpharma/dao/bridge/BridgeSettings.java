/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.bridge;

/**
 *
 * @author Joyce
 */
public class BridgeSettings {

    public static IPersistencia getDefaultPersistencia() {
        return new PersistenciaSerializacao();
    }
}
