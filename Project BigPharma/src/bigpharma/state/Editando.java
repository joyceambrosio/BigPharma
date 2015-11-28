/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.state;

import bigpharma.view.AbsViewCadastroItem;
import bigpharma.view.AbsViewCadastroPessoa;

/**
 *
 * @author Adeline
 */
public class Editando implements IState{

    @Override
    public void cadastrandoItem(AbsViewCadastroItem cadastro) {
        
    }

    @Override
    public void editandoItem(AbsViewCadastroItem cadastro) {
        cadastro.getjTextFieldID().setEditable(true);
        cadastro.getjTextFieldNome().setEditable(true);
        cadastro.getjTextFieldPreco().setEditable(true);
        
        cadastro.getjButtonSalvarModificacao().setVisible(true);
    }

    @Override
    public void cadastrandoPessoa(AbsViewCadastroPessoa cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editandoPessoa(AbsViewCadastroPessoa cadastro) {
        cadastro.getjTextFieldID().setEditable(true);
        cadastro.getjTextFieldNome().setEditable(true);
       
        
        cadastro.getjButtonSalvarModificacao().setVisible(true);
    }

    @Override
    public void consultandoItem(AbsViewCadastroItem cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultandoPessoa(AbsViewCadastroPessoa cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
