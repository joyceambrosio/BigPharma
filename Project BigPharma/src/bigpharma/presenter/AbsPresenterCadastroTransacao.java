/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.Produto;
import bigpharma.model.Transacao;
import bigpharma.view.AbsViewCadastroTransacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Adeline
 */
public abstract class AbsPresenterCadastroTransacao extends AbsPresenterCadastro {
    
    double totalTransacao = 0.0;
    public AbsPresenterCadastroTransacao(AbsViewCadastroTransacao cadastro) {
        super(cadastro);

        cadastro.getjButtonNovo()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        novo();
                    }
                });

        cadastro.getjButtonAdicionarProduto()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        adicionarProduto();
                    }
                });
        
        
        
        
    }

    public void novo() {

    }

    public void adicionarProduto() {
        Produto produto = (Produto) ((AbsViewCadastroTransacao) cadastro).getjComboBoxProduto().getSelectedItem();
        int quantidade = Integer.parseInt(((AbsViewCadastroTransacao) cadastro).getjTextFieldQtdProduto().getText());
        double totalItem = quantidade * produto.getPreco();

        DefaultTableModel model = (DefaultTableModel) ((AbsViewCadastroTransacao) cadastro).getjTableProdutos().getModel();
        model.addRow(new Object[]{
            produto.getNome(),
            produto.getPreco(),
            quantidade,
            totalItem
        });

        produto.setQtdeEstoque(quantidade);
        ((Transacao)atual).add(produto);

        ((AbsViewCadastroTransacao) cadastro).setTotalTransacao(((AbsViewCadastroTransacao) cadastro).getTotalTransacao() + totalItem) ;
        ((AbsViewCadastroTransacao) cadastro).getjFormattedTextFieldDisplayTotal().setValue(((AbsViewCadastroTransacao) cadastro).getTotalTransacao());
        ((AbsViewCadastroTransacao) cadastro).getjTextFieldQtdProduto().setText("");
    }

}
