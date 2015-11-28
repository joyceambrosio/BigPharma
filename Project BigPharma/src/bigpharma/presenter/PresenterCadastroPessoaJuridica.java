/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.Endereco;
import bigpharma.model.PessoaJuridico;
import bigpharma.view.AbsViewCadastroPessoa;
import bigpharma.view.FCadastroPessoaJuridica;
import bigpharma.view.MainView;

/**
 *
 * @author Adeline
 */
public class PresenterCadastroPessoaJuridica extends AbsPresenterCadastroPessoa {

    public PresenterCadastroPessoaJuridica(AbsViewCadastroPessoa cadastro) {
        super(cadastro);
    }

    @Override
    public void salvar() {
        int id = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldID().getText());
        int cpf = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldDocumento().getText());
        String nome = ((AbsViewCadastroPessoa) cadastro).getjTextFieldNome().getText();
        int tel = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldTelefone().getText());

        String rua = ((AbsViewCadastroPessoa) cadastro).getjTextFieldRua().getText();
        int num = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldNumero().getText());
        String bairro = ((AbsViewCadastroPessoa) cadastro).getjTextFieldBairro().getText();
        String cidade = ((AbsViewCadastroPessoa) cadastro).getjTextFieldCidade().getText();
        int cep = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldCEP().getText());
        String razao = ((FCadastroPessoaJuridica) cadastro).getjTextFieldRazaoSocial().getText();

        ((MainView) MainView.getFrames()[0]).clientes.add(new PessoaJuridico(cpf, nome, new Endereco(rua, num, bairro, cidade, cep), tel, razao));
        cadastro.setVisible(false);
    }

    @Override
    public void salvarModificacao() {
         //((MainView) MainView.getFrames()[0]).clientes.remove(pessoa);
        //pessoa.setId(new Integer(this.jTextFieldID.getText()));
        ((PessoaJuridico)atual).setDocumento(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldDocumento().getText()));
        ((PessoaJuridico)atual).setNome(((AbsViewCadastroPessoa) cadastro).getjTextFieldNome().getText());
        ((PessoaJuridico)atual).setRazaoSocial(((FCadastroPessoaJuridica) cadastro).getjTextFieldRazaoSocial().getText());
        ((PessoaJuridico)atual).setTelefone(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldTelefone().getText()));

        ((PessoaJuridico)atual).getEndereco().setBairro(((AbsViewCadastroPessoa) cadastro).getjTextFieldBairro().getText());
        ((PessoaJuridico)atual).getEndereco().setCep(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldCEP().getText()));
        ((PessoaJuridico)atual).getEndereco().setCidade(((AbsViewCadastroPessoa) cadastro).getjTextFieldCidade().getText());
        ((PessoaJuridico)atual).getEndereco().setNum(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldNumero().getText()));
        ((PessoaJuridico)atual).getEndereco().setRua(((AbsViewCadastroPessoa) cadastro).getjTextFieldRua().getText());

        //((MainView) MainView.getFrames()[0]).clientes.add(new PessoaJuridico(cnpj, id, nome, new Endereco(rua, num, bairro, cidade, cep), tel, razaoSocial));
        cadastro.setVisible(false);
    }

    @Override
    public void excluir() {
         boolean resp=false;
        for (int i=0; i<((MainView) MainView.getFrames()[0]).vendas.size();i++ ){
            resp=(((PessoaJuridico)atual).getDocumento()==((MainView) MainView.getFrames()[0]).vendas.get(i).getCliente().getDocumento())&&(((PessoaJuridico)atual).getNome()==((MainView) MainView.getFrames()[0]).vendas.get(i).getCliente().getNome());
        }
        if(resp==false){
            ((MainView) MainView.getFrames()[0]).clientes.remove(((PessoaJuridico)atual));
        }
    }

}
