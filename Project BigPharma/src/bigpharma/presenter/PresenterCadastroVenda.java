/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.Venda;
import bigpharma.model.Produto;
import bigpharma.view.AbsViewCadastroTransacao;
import bigpharma.view.MainView;

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
        ((MainView) MainView.getFrames()[0]).vendas.add(((Venda) atual));
        Produto newProduto = null;
        boolean resp = false;
        for (int i = 0; i < ((MainView) MainView.getFrames()[0]).produtos.size(); i++) {

            newProduto = ((MainView) MainView.getFrames()[0]).produtos.get(i);
            for (int j = 0; j < ((Venda) atual).getItems().size(); j++) {
                resp = newProduto.getNome().equals(((Venda) atual).getItems().get(j).getNome());

                if (resp) {
                    ((MainView) MainView.getFrames()[0]).produtos.get(i).setQtdeEstoque(((MainView) MainView.getFrames()[0]).produtos.get(i).getQtdeEstoque() - ((Venda) atual).getItems().get(j).getQtdeEstoque());
                }
            }
        }
        cadastro.setVisible(false);
    }
    
}
