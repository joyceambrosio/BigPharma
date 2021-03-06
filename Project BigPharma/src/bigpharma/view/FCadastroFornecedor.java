/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigpharma.view;

import bigpharma.model.PessoaJuridico;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Joyce
 */
public class FCadastroFornecedor extends AbsViewCadastroPessoa {

    /**
     * Creates new form FCadastroClienteJuridico
     */
    PessoaJuridico pessoa;

    public FCadastroFornecedor() {
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelRazaoSocial = new javax.swing.JLabel();
        jLabeCNPJ = new javax.swing.JLabel();
        jLabelTelefone = new javax.swing.JLabel();
        jLabelID = new javax.swing.JLabel();
        jLabelRua = new javax.swing.JLabel();
        jLabelCidade = new javax.swing.JLabel();
        jLabelBairro = new javax.swing.JLabel();
        jLabelNumero = new javax.swing.JLabel();
        jLabelCEP = new javax.swing.JLabel();
        jTextFieldRazaoSocial = new javax.swing.JTextField();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldCNPJ = new javax.swing.JTextField();
        jTextFieldTelefone = new javax.swing.JTextField();
        jTextFieldRua = new javax.swing.JTextField();
        jTextFieldNumero = new javax.swing.JTextField();
        jTextFieldBairro = new javax.swing.JTextField();
        jTextFieldCidade = new javax.swing.JTextField();
        jTextFieldCEP = new javax.swing.JTextField();
        jLabelNomeFantasia = new javax.swing.JLabel();
        jTextFieldNomeFantasia = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonSair = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvarModificacao = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setTitle("Cadastro Fornecedor");

        jLabelRazaoSocial.setText("Razão Social");

        jLabeCNPJ.setText("CNPJ");

        jLabelTelefone.setText("Telefone");

        jLabelID.setText("ID");

        jLabelRua.setText("Rua");

        jLabelCidade.setText("Cidade");

        jLabelBairro.setText("Bairo");

        jLabelNumero.setText("N°");

        jLabelCEP.setText("CEP");

        jTextFieldRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRazaoSocialActionPerformed(evt);
            }
        });

        jTextFieldCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCEPActionPerformed(evt);
            }
        });

        jLabelNomeFantasia.setText("Nome Fantasia");

        jTextFieldNomeFantasia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeFantasiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                    .addComponent(jLabelRua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCEP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabelCidade)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldCidade))
                                    .addComponent(jTextFieldRua)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabeCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabelTelefone)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelID)
                        .addComponent(jTextFieldRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNomeFantasia)
                    .addComponent(jTextFieldNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeCNPJ)
                    .addComponent(jLabelTelefone)
                    .addComponent(jTextFieldCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRua)
                    .addComponent(jLabelNumero)
                    .addComponent(jTextFieldRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBairro)
                    .addComponent(jLabelCidade)
                    .addComponent(jTextFieldBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCEP)
                    .addComponent(jTextFieldCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvarModificacao.setText("Salvar Modificações");
        jButtonSalvarModificacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarModificacaoActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvarModificacao)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditar)
                .addGap(18, 18, 18)
                .addComponent(jButtonSair)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonSair)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonSalvarModificacao)
                    .addComponent(jButtonExcluir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCEPActionPerformed

    private void jTextFieldRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRazaoSocialActionPerformed

    private void jTextFieldNomeFantasiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeFantasiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeFantasiaActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
//        int id = new Integer(this.jTextFieldID.getText());
//        int cnpj = new Integer(this.jTextFieldCNPJ.getText());
//        String nome = this.jTextFieldNomeFantasia.getText();
//        int tel = new Integer(this.jTextFieldTelefone.getText());
//        String razaoSocial = this.jTextFieldRazaoSocial.getText();
//
//        String rua = this.jTextFieldRua.getText();
//        int num = new Integer(this.jTextFieldNumero.getText());
//        String bairro = this.jTextFieldBairro.getText();
//        String cidade = this.jTextFieldCidade.getText();
//        int cep = new Integer(this.jTextFieldCEP.getText());
//
//        ((MainView) MainView.getFrames()[0]).fornecedores.add(new PessoaJuridico(cnpj, nome, new Endereco(rua, num, bairro, cidade, cep), tel, razaoSocial));
//        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
//        this.setjTextFieldsEnable();
//        this.setjButtonSalvarModificacaoTrue();
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarModificacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarModificacaoActionPerformed
        //((MainView) MainView.getFrames()[0]).fornecedores.remove(pessoa);
        //pessoa.setId(new Integer(this.jTextFieldID.getText())) ;
        pessoa.setDocumento(new Integer(this.jTextFieldCNPJ.getText()));
        pessoa.setNome(this.jTextFieldNomeFantasia.getText());
        pessoa.setRazaoSocial(this.jTextFieldRazaoSocial.getText());
        pessoa.setTelefone(new Integer(this.jTextFieldTelefone.getText()));
        
        pessoa.getEndereco().setBairro(this.jTextFieldBairro.getText());
        pessoa.getEndereco().setCep(new Integer(this.jTextFieldCEP.getText()));
        pessoa.getEndereco().setCidade(this.jTextFieldCidade.getText());
        pessoa.getEndereco().setNum(new Integer(this.jTextFieldNumero.getText()));
        pessoa.getEndereco().setRua(this.jTextFieldRua.getText());

        //((MainView) MainView.getFrames()[0]).fornecedores.add(new PessoaJuridico(cnpj, id, nome, new Endereco(rua, num, bairro, cidade, cep), tel, razaoSocial));
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSalvarModificacaoActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
//        boolean resp=false;
//        for (int i=0; i<((MainView) MainView.getFrames()[0]).compras.size();i++ ){
//            resp=(pessoa.getDocumento()==((MainView) MainView.getFrames()[0]).compras.get(i).getFornecedor().getDocumento())&&(pessoa.getNome()==((MainView) MainView.getFrames()[0]).compras.get(i).getFornecedor().getNome());
//        }
//        if(resp==false){
//            ((MainView) MainView.getFrames()[0]).fornecedores.remove(pessoa);
//        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    public void setjTextFieldBairro(String bairro) {
        this.jTextFieldBairro.setText(bairro);
    }

    public void setjTextFieldCEP(int cep) {
        this.jTextFieldCEP.setText(Integer.toString(cep));
    }

    public void setjTextFieldCNPJ(int cnpj) {
        this.jTextFieldCNPJ.setText(Integer.toString(cnpj));
    }

    public void setjTextFieldCidade(String cidade) {
        this.jTextFieldCidade.setText(cidade);
    }

    public void setjTextFieldID(int id) {
        this.jTextFieldID.setText(Integer.toString(id));
    }

    public void setjTextFieldNomeFantasia(String nome) {
        this.jTextFieldNomeFantasia.setText(nome);
    }

    public void setjTextFieldNumero(int num) {
        this.jTextFieldNumero.setText(Integer.toString(num));
    }

    public void setjTextFieldRua(String rua) {
        this.jTextFieldRua.setText(rua);
    }

    public void setjTextFieldTelefone(int tel) {
        this.jTextFieldTelefone.setText(Integer.toString(tel));
    }

    public void setjTextFieldRazaoSocial(String razaoSocial) {
        this.jTextFieldRazaoSocial.setText(razaoSocial);
    }

    public JTextField getjTextFieldRazaoSocial() {
        return jTextFieldRazaoSocial;
    }
    
    
//
//    public void setjButtonSalvarFalse() {
//        this.jButtonSalvar.setVisible(false);
//    }
//
//    public void setjButtonSalvarModificacaoTrue() {
//        this.jButtonSalvarModificacao.setVisible(true);
//    }
//
//    public void setjButtonSalvarModificacaoFalse() {
//        this.jButtonSalvarModificacao.setVisible(false);
//    }
//
//    public void setjButtonEditarFalse() {
//        this.jButtonEditar.setVisible(false);
//    }
//    public void setjButtonExcluirFalse() {
//        this.jButtonExcluir.setVisible(false);
//    }
//
//    public void setjTextFieldsUnable() {
//        this.jTextFieldID.setEditable(false);
//        this.jTextFieldNomeFantasia.setEditable(false);
//        this.jTextFieldBairro.setEditable(false);
//        this.jTextFieldCEP.setEditable(false);
//        this.jTextFieldCNPJ.setEditable(false);
//        this.jTextFieldCidade.setEditable(false);
//        this.jTextFieldNumero.setEditable(false);
//        this.jTextFieldRua.setEditable(false);
//        this.jTextFieldTelefone.setEditable(false);
//        this.jTextFieldRazaoSocial.setEditable(false);
//
//    }
//
//    public void setjTextFieldsEnable() {
//        this.jTextFieldID.setEditable(true);
//        this.jTextFieldNomeFantasia.setEditable(true);
//        this.jTextFieldBairro.setEditable(true);
//        this.jTextFieldCEP.setEditable(true);
//        this.jTextFieldCNPJ.setEditable(true);
//        this.jTextFieldCidade.setEditable(true);
//        this.jTextFieldNumero.setEditable(true);
//        this.jTextFieldRua.setEditable(true);
//        this.jTextFieldTelefone.setEditable(true);
//        this.jTextFieldRazaoSocial.setEditable(true);
//    }
//
    public void setPessoa(PessoaJuridico pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public JButton getjButtonEditar() {
        return jButtonEditar;
    }

    @Override
    public JButton getjButtonExcluir() {
        return jButtonExcluir;
    }

    @Override
    public JButton getjButtonSair() {
        return jButtonSair;
    }

    @Override
    public JButton getjButtonSalvar() {
        return jButtonSalvar;
    }

    @Override
    public JButton getjButtonSalvarModificacao() {
        return jButtonSalvarModificacao;
    }
    
    
@Override
    public JTextField getjTextFieldBairro() {
        return jTextFieldBairro;
    }
    
    @Override
    public JTextField getjTextFieldCEP() {
        return jTextFieldCEP;
    }

    @Override
    public JTextField getjTextFieldDocumento() {
        return jTextFieldCNPJ;
    }

    @Override
    public JTextField getjTextFieldCidade() {
        return jTextFieldCidade;
    }

    @Override
    public JTextField getjTextFieldID() {
        return jTextFieldID;
    }

    @Override
    public JTextField getjTextFieldNome() {
        return jTextFieldNomeFantasia;
    }

    @Override
    public JTextField getjTextFieldNumero() {
        return jTextFieldNumero;
    }

    @Override
    public JTextField getjTextFieldRua() {
        return jTextFieldRua;
    }
    @Override
    public JTextField getjTextFieldTelefone() {
        return jTextFieldTelefone;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonSalvarModificacao;
    private javax.swing.JLabel jLabeCNPJ;
    private javax.swing.JLabel jLabelBairro;
    private javax.swing.JLabel jLabelCEP;
    private javax.swing.JLabel jLabelCidade;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNomeFantasia;
    private javax.swing.JLabel jLabelNumero;
    private javax.swing.JLabel jLabelRazaoSocial;
    private javax.swing.JLabel jLabelRua;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldBairro;
    private javax.swing.JTextField jTextFieldCEP;
    private javax.swing.JTextField jTextFieldCNPJ;
    private javax.swing.JTextField jTextFieldCidade;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNomeFantasia;
    private javax.swing.JTextField jTextFieldNumero;
    private javax.swing.JTextField jTextFieldRazaoSocial;
    private javax.swing.JTextField jTextFieldRua;
    private javax.swing.JTextField jTextFieldTelefone;
    // End of variables declaration//GEN-END:variables

    @Override
    public JLabel getjLabelID() {
        return jLabelID;
    }
}
