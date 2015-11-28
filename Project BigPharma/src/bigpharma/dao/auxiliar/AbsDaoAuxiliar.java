/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.dao.auxiliar;

import Observer.Observador;
import bigpharma.dao.AbsDao;
import bigpharma.model.AbsModel;
import java.util.ArrayList;

/**
 *
 * @author Joyce
 */
public abstract class AbsDaoAuxiliar extends AbsModel{
    private ArrayList<Observador> observadores = null;
   
    protected abstract AbsDao getDaoInstance();
    
    public AbsDaoAuxiliar() {
        observadores = new ArrayList<>();
    }
    
    public ArrayList<AbsModel> obtemTodos() {
        return getDaoInstance().obtemTodos();
    }

    public AbsModel obtem(int Id) {
        return getDaoInstance().obtem(Id);
    }

    public void Cadastra(AbsModel model) throws Exception {
        getDaoInstance().add(model);
        notificarObservadores();
    }

    public void Exclui(AbsModel model) throws Exception {
        getDaoInstance().remove(model);
        notificarObservadores();
    }
    
    public void notificarObservadores() {
        for (Observador item : observadores) {
            item.atualizar();
        }
    }
    
    public void cadastrarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }


}
