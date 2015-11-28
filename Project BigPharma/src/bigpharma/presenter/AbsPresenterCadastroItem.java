/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.Produto;
import bigpharma.model.Transacao;
import bigpharma.state.Editando;
import bigpharma.state.IState;
import bigpharma.view.AbsViewCadastroItem;
import bigpharma.view.FCadastroProduto;
import bigpharma.view.MainView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adeline
 */
public abstract class AbsPresenterCadastroItem extends AbsPresenterCadastro {

    public IState state;

    public AbsPresenterCadastroItem(AbsViewCadastroItem cadastro) {
        super(cadastro);

        cadastro.getjButtonSalvarModificacao()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        salvarModificacao();
                    }

                });

        cadastro.getjButtonExcluir()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        excluir();
                    }

                });
        cadastro.getjButtonEditar()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        editar();
                    }

                });
        cadastro.getjButtonSalvar()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        salvar();
                    }

                });

    }

    @Override
    public void salvar() {
        //int id = new Integer(((AbsViewCadastroItem) cadastro).getjTextFieldID().getText());
        double preco = new Double(((AbsViewCadastroItem) cadastro).getjTextFieldPreco().getText().replace(",", "."));
        String nome = ((AbsViewCadastroItem) cadastro).getjTextFieldNome().getText();
        atual = new Produto(nome, preco);

        try {
            ((MainView) MainView.getFrames()[0]).produtos.add(atual);
        } catch (Exception ex) {
            Logger.getLogger(AbsPresenterCadastroItem.class.getName()).log(Level.SEVERE, null, ex);
        }

        cadastro.setVisible(false);
    }

    public void salvarModificacao() {
        //((MainView) MainView.getFrames()[0]).produtos.remove(produto);
        //produto.setId(new Integer(this.jTextFieldID.getText()));
        ((Produto) atual).setNome(((FCadastroProduto) cadastro).getjTextFieldNome().getText());
        ((Produto) atual).setPreco(new Double(((AbsViewCadastroItem) cadastro).getjTextFieldPreco().getText().replace(",", ".")));

        //((MainView) MainView.getFrames()[0]).produtos.add(new Produto(id, nome, preco));
        cadastro.setVisible(false);
    }

    public void excluir() {
        boolean resp = false;
        for (int i = 0; i < ((MainView) MainView.getFrames()[0]).vendas.size(); i++) {
            for (int j = 0; j < ((Transacao) ((MainView) MainView.getFrames()[0]).vendas.get(i)).getItems().size(); j++) {
                resp = (((Produto) atual).getNome() == ((Transacao) ((MainView) MainView.getFrames()[0]).vendas.get(i)).getItems().get(j).getNome()) && (((Produto) atual).getNome() == ((Transacao) ((MainView) MainView.getFrames()[0]).vendas.get(i)).getItems().get(j).getNome());

            }
            for (int j = 0; j < ((Transacao) ((MainView) MainView.getFrames()[0]).compras.get(i)).getItems().size(); j++) {
                resp = (((Produto) atual).getNome() == ((Transacao) ((MainView) MainView.getFrames()[0]).compras.get(i)).getItems().get(j).getNome()) && (((Produto) atual).getNome() == ((Transacao) ((MainView) MainView.getFrames()[0]).compras.get(i)).getItems().get(j).getNome());

            }
        }
        if (resp == false) {
            try {
                ((MainView) MainView.getFrames()[0]).produtos.remove(((Produto) atual));
            } catch (Exception ex) {
                Logger.getLogger(AbsPresenterCadastroItem.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void editar() {
        state = new Editando();
        state.editandoItem((AbsViewCadastroItem) cadastro);
    }

}
