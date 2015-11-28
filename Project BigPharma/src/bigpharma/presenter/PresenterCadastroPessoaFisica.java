/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import bigpharma.model.Endereco;
import bigpharma.model.PessoaFisico;
import bigpharma.model.Venda;
import bigpharma.view.AbsViewCadastroPessoa;
import bigpharma.view.FCadastroPessoaFisica;
import bigpharma.view.MainView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Adeline
 */
public class PresenterCadastroPessoaFisica extends AbsPresenterCadastroPessoa {

    public PresenterCadastroPessoaFisica(AbsViewCadastroPessoa cadastro) {
        super(cadastro);
    }

    @Override
    public void salvar() {
        //int id = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldID().getText());
        int cpf = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldDocumento().getText());
        String nome = ((AbsViewCadastroPessoa) cadastro).getjTextFieldNome().getText();
        int tel = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldTelefone().getText());

        String rua = ((AbsViewCadastroPessoa) cadastro).getjTextFieldRua().getText();
        int num = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldNumero().getText());
        String bairro = ((AbsViewCadastroPessoa) cadastro).getjTextFieldBairro().getText();
        String cidade = ((AbsViewCadastroPessoa) cadastro).getjTextFieldCidade().getText();
        int cep = new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldCEP().getText());
        cadastro.setVisible(false);

        if (cadastro instanceof FCadastroPessoaFisica) {
            try {
                ((MainView) MainView.getFrames()[0]).clientes.add(new PessoaFisico(cpf, 0, nome, new Endereco(rua, num, bairro, cidade, cep), tel));
            } catch (Exception ex) {
                Logger.getLogger(PresenterCadastroPessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                ((MainView) MainView.getFrames()[0]).funcionarios.add(new PessoaFisico(cpf, 0, nome, new Endereco(rua, num, bairro, cidade, cep), tel));
            } catch (Exception ex) {
                Logger.getLogger(PresenterCadastroPessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void salvarModificacao() {
        //((MainView) MainView.getFrames()[0]).clientes.remove(pessoa);
        //pessoa.setId(new Integer(this.jTextFieldID.getText())) ;
        ((PessoaFisico) atual).setDocumento(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldDocumento().getText()));
        ((PessoaFisico) atual).setNome(((AbsViewCadastroPessoa) cadastro).getjTextFieldNome().getText());
        //pessoa.setRazaoSocial(this.jTextFieldRazaoSocial.getText());
        ((PessoaFisico) atual).setTelefone(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldTelefone().getText()));

        ((PessoaFisico) atual).getEndereco().setBairro(((AbsViewCadastroPessoa) cadastro).getjTextFieldBairro().getText());
        ((PessoaFisico) atual).getEndereco().setCep(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldCEP().getText()));
        ((PessoaFisico) atual).getEndereco().setCidade(((AbsViewCadastroPessoa) cadastro).getjTextFieldCidade().getText());
        ((PessoaFisico) atual).getEndereco().setNum(new Integer(((AbsViewCadastroPessoa) cadastro).getjTextFieldNumero().getText()));
        ((PessoaFisico) atual).getEndereco().setRua(((AbsViewCadastroPessoa) cadastro).getjTextFieldRua().getText());

        //((MainView) MainView.getFrames()[0]).clientes.add(new PessoaFisico(cpf, id, nome, new Endereco(rua, num, bairro, cidade, cep), tel));
        cadastro.setVisible(false);
    }

    @Override
    public void excluir() {
        boolean resp = false;
        for (int i = 0; i < ((MainView) MainView.getFrames()[0]).vendas.size(); i++) {
            resp = (((PessoaFisico) atual).getDocumento() == ((Venda) ((MainView) MainView.getFrames()[0]).vendas.get(i)).getCliente().getDocumento()) && (((PessoaFisico) atual).getNome() == ((Venda) ((MainView) MainView.getFrames()[0]).vendas.get(i)).getCliente().getNome());
        }
        if (resp == false) {
            try {
                ((MainView) MainView.getFrames()[0]).clientes.remove(((PessoaFisico) atual));
            } catch (Exception ex) {
                Logger.getLogger(PresenterCadastroPessoaFisica.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
