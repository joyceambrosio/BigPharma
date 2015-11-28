/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Joyce
 */
public abstract class Observado{

    private List<Observador> observadores = null;

    private void notifica() {
        if (observadores != null) {
            for (Observador observador : observadores) {
                observador.atualizar();
            }
        }
    }

    public void addObservador(Observador observador) {
        if (observador == null) {
            observadores = new ArrayList<Observador>();
        }
        observadores.add(observador);
    }

    public void removeObservador(Observador observador) {
        if (observador != null) {
            observadores.remove(observador);
        }
    }
}
