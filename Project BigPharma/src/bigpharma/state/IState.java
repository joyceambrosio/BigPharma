/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.state;

import bigpharma.view.AbsViewCadastroItem;
import bigpharma.view.AbsViewCadastroPessoa;

/**
 *
 * @author Adeline
 */
public interface IState {

    public void cadastrandoItem(AbsViewCadastroItem cadastro);
    public void cadastrandoPessoa(AbsViewCadastroPessoa cadastro);
    
    public void editandoItem(AbsViewCadastroItem cadastro);
    public void editandoPessoa(AbsViewCadastroPessoa cadastro);
    
    public void consultandoItem(AbsViewCadastroItem cadastro);
    public void consultandoPessoaFisica(AbsViewCadastroPessoa cadastro);
    public void consultandoPessoaJuridica(AbsViewCadastroPessoa cadastro);

}
