/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.presenter;

import BD.Serializador;
import bigpharma.state.Cadastrando;
import bigpharma.state.IState;
import bigpharma.view.FCadastroCompra;
import bigpharma.view.FCadastroFornecedor;
import bigpharma.view.FCadastroFuncionario;
import bigpharma.view.FCadastroPessoaFisica;
import bigpharma.view.FCadastroPessoaJuridica;
import bigpharma.view.FCadastroProduto;
import bigpharma.view.FCadastroVenda;
import bigpharma.view.FConsultaCliente;
import bigpharma.view.FConsultaFornecedor;
import bigpharma.view.FConsultaFuncionario;
import bigpharma.view.FConsultaProduto;
import bigpharma.view.MainView;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;

/**
 *
 * @author Adeline
 */
public class PresenterMain {

//    public ArrayList<Pessoa> clientes = new ArrayList();
//    public ArrayList<Compra> compras = new ArrayList();
//    public ArrayList<Produto> produtos = new ArrayList();
//    public ArrayList<Venda> vendas = new ArrayList();
//    public ArrayList<PessoaJuridico> fornecedores = new ArrayList();
//    public ArrayList<PessoaFisico> funcionarios = new ArrayList();
    
    public MainView main = new MainView();
    public IState state;

    public PresenterMain(MainView main) {
        this.main = main;
        
        main.getjMenuItemConCliente()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroPessoaFisica objCadastro2 = new FCadastroPessoaFisica();
                        main.getjDesktopPane().add(objCadastro2);
                        FCadastroPessoaJuridica objCadastro3 = new FCadastroPessoaJuridica();
                        main.getjDesktopPane().add(objCadastro3);
                        FConsultaCliente objCadastro = new FConsultaCliente(objCadastro2, objCadastro3);
                        main.getjDesktopPane().add(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemCadClienteJuridico()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroPessoaJuridica objCadastro = new FCadastroPessoaJuridica();
                        PresenterCadastroPessoaJuridica cadastro = new PresenterCadastroPessoaJuridica(objCadastro);
                        main.getjDesktopPane().add(objCadastro);
                         state=new Cadastrando();
                         state.cadastrandoPessoa(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemCadClienteFisico()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroPessoaFisica objCadastro = new FCadastroPessoaFisica();
                        PresenterCadastroPessoaFisica cadastro = new PresenterCadastroPessoaFisica(objCadastro);
                        main.getjDesktopPane().add(objCadastro);
                         state=new Cadastrando();
                         state.cadastrandoPessoa(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemCadFornecedor()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroFornecedor objCadastro = new FCadastroFornecedor();
                        PresenterCadastroPessoaJuridica cadastro = new PresenterCadastroPessoaJuridica(objCadastro);
                        main.getjDesktopPane().add(objCadastro);
                        state = new Cadastrando();
                        state.cadastrandoPessoa(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemCadCompra()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroCompra objCadastro = new FCadastroCompra();
                        PresenterCadastroCompra cadastro = new PresenterCadastroCompra(objCadastro);
                        main.getjDesktopPane().add(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemVenda()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroVenda objCadastro = new FCadastroVenda();
                        PresenterCadastroVenda cadastro = new PresenterCadastroVenda(objCadastro);
                        main.getjDesktopPane().add(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemCadProduto()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroProduto objCadastro = new FCadastroProduto();
                        PresenterCadastroProduto cadastro = new PresenterCadastroProduto(objCadastro);
                        main.getjDesktopPane().add(objCadastro);
                        state = new Cadastrando();
                        state.cadastrandoItem(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemConProduto()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroProduto objCadastro3 = new FCadastroProduto();
                        main.getjDesktopPane().add(objCadastro3);
                        FConsultaProduto objCadastro = new FConsultaProduto(objCadastro3);
                        main.getjDesktopPane().add(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemConFornecedor()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroFornecedor objCadastro3 = new FCadastroFornecedor();
                        main.getjDesktopPane().add(objCadastro3);
                        FConsultaFornecedor objCadastro = new FConsultaFornecedor(objCadastro3);
                        main.getjDesktopPane().add(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemFuncionario()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroFuncionario objCadastro = new FCadastroFuncionario();
                        PresenterCadastroPessoaFisica cadastro = new PresenterCadastroPessoaFisica(objCadastro);
                        main.getjDesktopPane().add(objCadastro);
                         state=new Cadastrando();
                         state.cadastrandoPessoa(objCadastro);
                        carrega(true, objCadastro);
                    }
                });
        
        main.getjMenuItemConFuncionario()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        FCadastroFuncionario objCadastro = new FCadastroFuncionario();
                        main.getjDesktopPane().add(objCadastro);
                        FConsultaFuncionario objCadastro2 = new FConsultaFuncionario(objCadastro);
                        main.getjDesktopPane().add(objCadastro2);
                        carrega(true, objCadastro2);
                    }
                });
        
        main.getjMenuItemSalvar()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        //upgrade();
                    }
                });
        
        main.getjMenuItemCarregar()
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        //update();
                    }
                });
        
    }
    
    public void carregaMain(boolean b, javax.swing.JFrame janela) {
        janela.setLocationRelativeTo(null);
        janela.setExtendedState(main.MAXIMIZED_BOTH);
        janela.setVisible(b);
    }
    
    public void carrega(boolean b, JInternalFrame janela) {
        janela.moveToFront();
        Dimension d = main.getjDesktopPane().getSize();        
        janela.setLocation((d.width - janela.getSize().width) / 2, (d.height - janela.getSize().height) / 2);        
        janela.setVisible(b);
    }
    
//    public void update() {
//        Serializador s = new Serializador();
//        main.produtos = s.deserializaProdutos();
//        main.clientes = s.deserializaClientes();
//        main.funcionarios = s.deserializaFuncionarios();
//        main.fornecedores = s.deserializaFornecedores();
//        main.compras = s.deserializaCompras();
//        main.vendas = s.deserializaVendas();
//    }
//    
//    public void upgrade() {
//        Serializador s = new Serializador();
//        s.serializaProdutos(main.produtos);
//        s.serializaClientes(main.clientes);
//        s.serializaCompras(main.compras);
//        s.serializaFornecedores(main.fornecedores);
//        s.serializaFuncionarios(main.funcionarios);
//        s.serializaProdutos(main.produtos);
//        s.serializaVendas(main.vendas);
//    }
    
}
