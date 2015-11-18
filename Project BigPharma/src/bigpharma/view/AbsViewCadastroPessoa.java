/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.view;

import javax.swing.JButton;

/**
 *
 * @author Adeline
 */
public abstract class AbsViewCadastroPessoa extends AbsViewCadastro {

    public abstract JButton getjButtonEditar();

    public abstract JButton getjButtonExcluir();

    public abstract JButton getjButtonSalvarModificacao();

}
