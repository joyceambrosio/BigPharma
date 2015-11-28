/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.bridge;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Joyce
 */
public class PersistenciaSerializacao implements IPersistencia {

    @Override
    public void salva(Object obj, String nomeArquivo) throws Exception {
        try {
            File daoFile = new File(nomeArquivo);
            if (daoFile.exists()) {
                daoFile.delete();
            }

            FileOutputStream outFile = new FileOutputStream(daoFile);
            ObjectOutputStream s = new ObjectOutputStream(outFile);
            s.writeObject(obj);
            s.close();

        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override
    public Object recupera(String nomeArquivo) throws Exception {
        try {
            File daoFile = new File(nomeArquivo);
            if (daoFile.exists()) {

                FileInputStream inFile = new FileInputStream(nomeArquivo);
                ObjectInputStream d = new ObjectInputStream(inFile);
                Object o = d.readObject();
                d.close();
                
                return o;
            } else {
                return null;
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

}
