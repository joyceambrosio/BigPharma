/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.view;

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        jMenuItemCadClienteFisico = new javax.swing.JMenuItem();
        jMenuItemCadClienteJuridico = new javax.swing.JMenuItem();
        jMenuItemCadProduto = new javax.swing.JMenuItem();
        jMenuItemCadFornecedor = new javax.swing.JMenuItem();
        jMenuItemCadCompra = new javax.swing.JMenuItem();
        jMenuConsulta = new javax.swing.JMenu();
        jMenuItemConComra = new javax.swing.JMenuItem();
        jMenuItemConCliente = new javax.swing.JMenuItem();
        jMenuItemConFornecedor = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuCadastro.setText("Cadastro");

        jMenuItemCadClienteFisico.setText("Cliente Físico");
        jMenuCadastro.add(jMenuItemCadClienteFisico);

        jMenuItemCadClienteJuridico.setText("Cliente Juridico");
        jMenuCadastro.add(jMenuItemCadClienteJuridico);

        jMenuItemCadProduto.setText("Produto");
        jMenuCadastro.add(jMenuItemCadProduto);

        jMenuItemCadFornecedor.setText("Fornecedor");
        jMenuCadastro.add(jMenuItemCadFornecedor);

        jMenuItemCadCompra.setText("Compra");
        jMenuCadastro.add(jMenuItemCadCompra);

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
        jMenuConsulta.add(jMenuItemConFornecedor);

        jMenuBar1.add(jMenuConsulta);

        jMenuVenda.setText("Venda");
        jMenuBar1.add(jMenuVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 579, Short.MAX_VALUE)
        );

        setBounds(0, 0, 816, 639);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemConClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemConClienteActionPerformed

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
                new MainView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuConsulta;
    private javax.swing.JMenuItem jMenuItemCadClienteFisico;
    private javax.swing.JMenuItem jMenuItemCadClienteJuridico;
    private javax.swing.JMenuItem jMenuItemCadCompra;
    private javax.swing.JMenuItem jMenuItemCadFornecedor;
    private javax.swing.JMenuItem jMenuItemCadProduto;
    private javax.swing.JMenuItem jMenuItemConCliente;
    private javax.swing.JMenuItem jMenuItemConComra;
    private javax.swing.JMenuItem jMenuItemConFornecedor;
    private javax.swing.JMenu jMenuVenda;
    // End of variables declaration//GEN-END:variables
}
