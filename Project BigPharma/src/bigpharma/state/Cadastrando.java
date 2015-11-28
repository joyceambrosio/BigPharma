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
public class Cadastrando implements IState {

    @Override
    public void cadastrandoItem(AbsViewCadastroItem cadastro) {
        cadastro.getjButtonEditar().setVisible(false);
        cadastro.getjButtonSalvarModificacao().setVisible(false);
        cadastro.getjButtonExcluir().setVisible(false);
        cadastro.getjTextFieldID().setVisible(false);
        cadastro.getjLabelID().setVisible(false);

    }

    @Override
    public void editandoItem(AbsViewCadastroItem cadastro) {

    }

    @Override
    public void cadastrandoPessoa(AbsViewCadastroPessoa cadastro) {
        cadastro.getjButtonEditar().setVisible(false);
        cadastro.getjButtonSalvarModificacao().setVisible(false);
        cadastro.getjButtonExcluir().setVisible(false);
        cadastro.getjTextFieldID().setVisible(false);
        cadastro.getjLabelID().setVisible(false);
    }

    @Override
    public void editandoPessoa(AbsViewCadastroPessoa cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultandoItem(AbsViewCadastroItem cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultandoPessoaFisica(AbsViewCadastroPessoa cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultandoPessoaJuridica(AbsViewCadastroPessoa cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
