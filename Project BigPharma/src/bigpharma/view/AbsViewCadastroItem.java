/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Adeline
 */
public abstract class AbsViewCadastroItem extends AbsViewCadastro {

    public abstract JButton getjButtonEditar();

    public abstract JButton getjButtonExcluir();

    public abstract JButton getjButtonSalvarModificacao();

    public abstract JTextField getjTextFieldID();

    public abstract JTextField getjTextFieldPreco();

    public abstract JTextField getjTextFieldNome();
    
    public abstract JLabel getjLabelID();
}
