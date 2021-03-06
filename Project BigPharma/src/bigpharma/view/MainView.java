/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.view;

import bigpharma.composite.Lista;
import bigpharma.presenter.PresenterMain;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Joyce
 */
public class MainView extends javax.swing.JFrame {

    /**
     * Creates new form MainView
     */
    public MainView() {
        initComponents();
    }

    //public ArrayList<Pessoa> clientes = new ArrayList();
    public Lista clientes = new Lista();
    
    //public ArrayList<Compra> compras = new ArrayList();
    public Lista compras = new Lista();
    
    //public ArrayList<Produto> produtos = new ArrayList();
    public Lista produtos = new Lista();
    
    //public ArrayList<Venda> vendas = new ArrayList();
    public Lista vendas = new Lista();
    
    //public ArrayList<PessoaJuridico> fornecedores = new ArrayList();
    public Lista fornecedores = new Lista();
    
    //public ArrayList<PessoaFisico> funcionarios = new ArrayList();
    public Lista funcionarios = new Lista();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadClienteFisico = new javax.swing.JMenuItem();
        jMenuItemCadClienteJuridico = new javax.swing.JMenuItem();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemCadFornecedor = new javax.swing.JMenuItem();
        jMenuItemFuncionario = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConComra = new javax.swing.JMenuItem();
        jMenuItemConCliente = new javax.swing.JMenuItem();
        jMenuItemConFornecedor = new javax.swing.JMenuItem();
        jMenuItemConProduto = new javax.swing.JMenuItem();
        jMenuItemConFuncionario = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuItemCadCompra = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSalvar = new javax.swing.JMenuItem();
        jMenuItemCarregar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPaneLayout = new javax.swing.GroupLayout(jDesktopPane);
        jDesktopPane.setLayout(jDesktopPaneLayout);
        jDesktopPaneLayout.setHorizontalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        jDesktopPaneLayout.setVerticalGroup(
            jDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadClienteFisico.setText("Cliente Físico");
        jMenuItemCadClienteFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteFisicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadClienteFisico);

        jMenuItemCadClienteJuridico.setText("Cliente Juridico");
        jMenuItemCadClienteJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadClienteJuridicoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadClienteJuridico);

        jMenuItemCadProduto.setText("Produto");
        jMenuItemCadProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadProdutoActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadProduto);

        jMenuItemCadFornecedor.setText("Fornecedor");
        jMenuItemCadFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadFornecedorActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemCadFornecedor);

        jMenuItemFuncionario.setText("Funcionário");
        jMenuItemFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastro.add(jMenuItemFuncionario);

        jMenuBar1.add(jMenuCadastro);

        jMenuConsulta.setText("Consulta");

        jMenuItemConComra.setText("Compra");
        jMenuConsulta.add(jMenuItemConComra);

        jMenuItemConCliente.setText("Cliente");
        jMenuItemConCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConClienteActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConCliente);

        jMenuItemConFornecedor.setText("Fornecedor");
        jMenuItemConFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConFornecedorActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConFornecedor);

        jMenuItemConProduto.setText("Produto");
        jMenuItemConProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConProdutoActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConProduto);

        jMenuItemConFuncionario.setText("Funcionário");
        jMenuItemConFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConFuncionarioActionPerformed(evt);
            }
        });
        jMenuConsulta.add(jMenuItemConFuncionario);

        jMenuBar1.add(jMenuConsulta);

        jMenuVenda.setText("Transações");

        jMenuItemVenda.setText("Venda");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemVenda);

        jMenuItemCadCompra.setText("Compra");
        jMenuItemCadCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadCompraActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemCadCompra);

        jMenuBar1.add(jMenuVenda);

        jMenu1.setText("Arquivo");

        jMenuItemSalvar.setText("Salvar Modificações em Arquivo");
        jMenuItemSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalvarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSalvar);

        jMenuItemCarregar.setText("Carregar Arquivos");
        jMenuItemCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCarregarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemCarregar);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setBounds(0, 0, 816, 639);
    }// </editor-fold>//GEN-END:initComponents


    private void jMenuItemConClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConClienteActionPerformed

    }//GEN-LAST:event_jMenuItemConClienteActionPerformed

    private void jMenuItemCadClienteFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteFisicoActionPerformed

    }//GEN-LAST:event_jMenuItemCadClienteFisicoActionPerformed

    private void jMenuItemCadClienteJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadClienteJuridicoActionPerformed

    }//GEN-LAST:event_jMenuItemCadClienteJuridicoActionPerformed

    private void jMenuItemCadFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadFornecedorActionPerformed

    }//GEN-LAST:event_jMenuItemCadFornecedorActionPerformed

    private void jMenuItemCadCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadCompraActionPerformed

    }//GEN-LAST:event_jMenuItemCadCompraActionPerformed

    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed

    }//GEN-LAST:event_jMenuItemVendaActionPerformed

    private void jMenuItemCadProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadProdutoActionPerformed

    }//GEN-LAST:event_jMenuItemCadProdutoActionPerformed

    private void jMenuItemConProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConProdutoActionPerformed

    }//GEN-LAST:event_jMenuItemConProdutoActionPerformed

    private void jMenuItemConFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConFornecedorActionPerformed

    }//GEN-LAST:event_jMenuItemConFornecedorActionPerformed

    private void jMenuItemFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionarioActionPerformed

    }//GEN-LAST:event_jMenuItemFuncionarioActionPerformed

    private void jMenuItemConFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConFuncionarioActionPerformed

    }//GEN-LAST:event_jMenuItemConFuncionarioActionPerformed

    private void jMenuItemSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalvarActionPerformed

    }//GEN-LAST:event_jMenuItemSalvarActionPerformed

    private void jMenuItemCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCarregarActionPerformed

    }//GEN-LAST:event_jMenuItemCarregarActionPerformed
    public JMenuItem getjMenuItemCadClienteFisico() {
        return jMenuItemCadClienteFisico;
    }

    public JMenuItem getjMenuItemCadClienteJuridico() {
        return jMenuItemCadClienteJuridico;
    }

    public JMenuItem getjMenuItemCadCompra() {
        return jMenuItemCadCompra;
    }

    public JMenuItem getjMenuItemCadFornecedor() {
        return jMenuItemCadFornecedor;
    }

    public JMenuItem getjMenuItemCadProduto() {
        return jMenuItemCadProduto;
    }

    public JMenuItem getjMenuItemCarregar() {
        return jMenuItemCarregar;
    }

    public JMenuItem getjMenuItemConCliente() {
        return jMenuItemConCliente;
    }

    public JMenuItem getjMenuItemConComra() {
        return jMenuItemConComra;
    }

    public JMenuItem getjMenuItemConFornecedor() {
        return jMenuItemConFornecedor;
    }

    public JMenuItem getjMenuItemConFuncionario() {
        return jMenuItemConFuncionario;
    }

    public JMenuItem getjMenuItemConProduto() {
        return jMenuItemConProduto;
    }

    public JMenuItem getjMenuItemSalvar() {
        return jMenuItemSalvar;
    }

    public JMenuItem getjMenuItemFuncionario() {
        return jMenuItemFuncionario;
    }

    public JMenuItem getjMenuItemVenda() {
        return jMenuItemVenda;
    }

    public JDesktopPane getjDesktopPane() {
        return jDesktopPane;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                    MainView main = new MainView();
                    new PresenterMain(main).carregaMain(true, main);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItemCadClienteFisico;
    private javax.swing.JMenuItem jMenuItemCadClienteJuridico;
    private javax.swing.JMenuItem jMenuItemCadCompra;
    private javax.swing.JMenuItem jMenuItemCadFornecedor;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemCarregar;
    private javax.swing.JMenuItem jMenuItemConCliente;
    private javax.swing.JMenuItem jMenuItemConComra;
    private javax.swing.JMenuItem jMenuItemConFornecedor;
    private javax.swing.JMenuItem jMenuItemConFuncionario;
    private javax.swing.JMenuItem jMenuItemConProduto;
    private javax.swing.JMenuItem jMenuItemFuncionario;
    private javax.swing.JMenuItem jMenuItemSalvar;
    private javax.swing.JMenuItem jMenuItemVenda;
    private javax.swing.JMenu jMenuVenda;
    // End of variables declaration//GEN-END:variables
}
