/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.AbsModel;
import bigpharma.model.Venda;
import bigpharma.model.Produto;
import bigpharma.view.AbsViewCadastroTransacao;
import bigpharma.view.MainView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adeline
 */
public class PresenterCadastroVenda extends AbsPresenterCadastroTransacao{

    public PresenterCadastroVenda(AbsViewCadastroTransacao cadastro) {
        super(cadastro);
    }

    @Override
    public void salvar() {
        try {
            ((MainView) MainView.getFrames()[0]).vendas.add(((Venda) atual));
        } catch (Exception ex) {
            Logger.getLogger(PresenterCadastroVenda.class.getName()).log(Level.SEVERE, null, ex);
        }
        AbsModel newProduto = null;
        boolean resp = false;
        for (int i = 0; i < ((MainView) MainView.getFrames()[0]).produtos.size(); i++) {

            newProduto = ((MainView) MainView.getFrames()[0]).produtos.get(i);
            for (int j = 0; j < ((Venda) atual).getItems().size(); j++) {
                resp = ((Produto)newProduto).getNome().equals(((Venda) atual).getItems().get(j).getNome());

                if (resp) {
                    ((Produto)((MainView) MainView.getFrames()[0]).produtos.get(i)).setQtdeEstoque(((Produto)((MainView) MainView.getFrames()[0]).produtos.get(i)).getQtdeEstoque() - ((Venda) atual).getItems().get(j).getQtdeEstoque());
                }
            }
        }
        cadastro.setVisible(false);
    }
    
}
