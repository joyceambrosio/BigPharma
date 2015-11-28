/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.AbsModel;
import bigpharma.model.Compra;
import bigpharma.model.PessoaJuridico;
import bigpharma.model.Produto;
import bigpharma.view.AbsViewCadastroTransacao;
import bigpharma.view.FCadastroCompra;
import bigpharma.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adeline
 */
public class PresenterCadastroCompra extends AbsPresenterCadastroTransacao {

    public PresenterCadastroCompra(AbsViewCadastroTransacao cadastro) {
        super(cadastro);

        ((FCadastroCompra) cadastro).getjButtonAdicionarFornecedor()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        adicionarFornecedor();
                    }
                });
    }

    @Override
    public void salvar() {
        try {
            ((MainView) MainView.getFrames()[0]).compras.add(((Compra) atual));
        } catch (Exception ex) {
            Logger.getLogger(PresenterCadastroCompra.class.getName()).log(Level.SEVERE, null, ex);
        }
        AbsModel newProduto = null;
        boolean resp = false;
        for (int i = 0; i < ((MainView) MainView.getFrames()[0]).produtos.size(); i++) {

            newProduto = ((MainView) MainView.getFrames()[0]).produtos.get(i);
            for (int j = 0; j < ((Compra) atual).getItems().size(); j++) {
                resp = ((Produto)newProduto).getNome().equals(((Compra) atual).getItems().get(j).getNome());

                if (resp) {
                    ((Produto)((MainView) MainView.getFrames()[0]).produtos.get(i)).setQtdeEstoque(((Produto)((MainView) MainView.getFrames()[0]).produtos.get(i)).getQtdeEstoque() + ((Compra) atual).getItems().get(j).getQtdeEstoque());
                }
            }
        }
        cadastro.setVisible(false);
    }

    public void adicionarFornecedor() {
        PessoaJuridico fornecedor = (PessoaJuridico) ((FCadastroCompra) cadastro).getjComboBoxFornecedor().getSelectedItem();
        ((Compra) atual).setFornecedor(fornecedor);
    }
}
