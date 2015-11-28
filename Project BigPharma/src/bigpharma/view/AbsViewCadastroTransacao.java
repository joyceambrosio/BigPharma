/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Adeline
 */
public abstract class AbsViewCadastroTransacao extends AbsViewCadastro {

    public abstract JButton getjButtonNovo();

    public abstract JButton getjButtonAdicionarProduto();

    public abstract JComboBox getjComboBoxProduto();

    public abstract JFormattedTextField getjFormattedTextFieldDisplayTotal();

    public abstract JLabel getjLabelTotal();

    public abstract JTable getjTableProdutos();

    public abstract JTextField getjTextFieldDataCompra();

    public abstract JTextField getjTextFieldQtdProduto();

    public abstract double getTotalTransacao();

    public abstract void setTotalTransacao(double totalCompra);
    
}
