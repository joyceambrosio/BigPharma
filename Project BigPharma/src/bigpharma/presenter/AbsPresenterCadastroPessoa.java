/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.view.AbsViewCadastroPessoa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Adeline
 */
public abstract class AbsPresenterCadastroPessoa extends AbsPresenterCadastro {

    public AbsPresenterCadastroPessoa(AbsViewCadastroPessoa cadastro) {
        super(cadastro);

        cadastro.getjButtonEditar()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        editar();
                    }
                });

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

    }

    public void editar() {

    }

    public void salvarModificacao() {

    }

    public void excluir() {

    }

}
