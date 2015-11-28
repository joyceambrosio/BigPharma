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
public abstract class AbsViewCadastroPessoa extends AbsViewCadastro {

    public abstract JButton getjButtonEditar();

    public abstract JButton getjButtonExcluir();

    public abstract JButton getjButtonSalvarModificacao();
    
     public abstract JTextField getjTextFieldBairro();

    public abstract JTextField getjTextFieldCEP();

    public abstract JTextField getjTextFieldDocumento();

    public abstract JTextField getjTextFieldCidade();

    public abstract JTextField getjTextFieldID();

    public abstract JTextField getjTextFieldNome();

    public abstract JTextField getjTextFieldNumero();

    public abstract JTextField getjTextFieldRua();

    public abstract JTextField getjTextFieldTelefone();

    public abstract JLabel getjLabelID();

}
