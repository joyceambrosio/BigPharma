/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.AbsModel;
import bigpharma.view.AbsViewCadastro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adeline
 */
public abstract class AbsPresenterCadastro extends AbsModel {

    protected AbsViewCadastro cadastro = null;
    protected AbsModel atual = null;

    public AbsPresenterCadastro(AbsViewCadastro cadastro) {
        try {
            this.cadastro = cadastro;

        } catch (Exception e) {

        }

        cadastro.getjButtonSair()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        sair();
                    }
                });
        cadastro.getjButtonSalvar()
                .addActionListener(new ActionListener(){
                  @Override
                  public void actionPerformed(ActionEvent e
                  ){
                      salvar();
                  }
                }
                );
    }

    public AbsViewCadastro getCadastro() {
        return cadastro;
    }
    
    public void sair(){
         cadastro.setVisible(false);
    }
    
    public abstract void salvar();

}
