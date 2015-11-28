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
public interface IPersistencia {
    void salva(Object obj, String nomeArquivo) throws Exception;
    Object recupera(String nomeArquivo) throws Exception;
}
