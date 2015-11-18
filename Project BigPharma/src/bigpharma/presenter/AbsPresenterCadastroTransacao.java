/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.view.AbsViewCadastroTransacao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adeline
 */
public abstract class AbsPresenterCadastroTransacao extends AbsPresenterCadastro {

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

    }

}
