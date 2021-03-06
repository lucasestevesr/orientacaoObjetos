/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.view;

import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.dao.BancoDeDadosUsuario;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class TelaPerfil extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    //Usuario usuario;
    public TelaPerfil() {
        initComponents();
        this.setLocationRelativeTo(null);

        //this.usuario = null;
        //txtId.setText(Integer.toString(UsuarioController.getId()));
    }
//
//    public Usuario getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.usuario = usuario;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroUsuario = new javax.swing.JPanel();
        jLabelNomeEditar = new javax.swing.JLabel();
        textFieldNomeEditar = new java.awt.TextField();
        jLabelTelefoneEditar = new javax.swing.JLabel();
        textFieldEmailEd = new java.awt.TextField();
        jLabelEmailEditar = new javax.swing.JLabel();
        textFieldTelefoneEd = new java.awt.TextField();
        jLabelIdentificadorEditar = new javax.swing.JLabel();
        jTextFieldIdentificadorEd = new javax.swing.JTextField();
        jLabelSenhaEditar = new javax.swing.JLabel();
        jPasswordFieldSenhaEd = new javax.swing.JPasswordField();
        jLabelConfirmarSenhaEditar = new javax.swing.JLabel();
        jPasswordFieldConfirmarSenhaEd = new javax.swing.JPasswordField();
        jButtonEditar = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastroSistemaDeMonitoramento");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabelTitulo.setText("Perfil do Usuário");
        jLabelTitulo.setToolTipText("");

        jPanelCadastroUsuario.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelNomeEditar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelNomeEditar.setText("Nome: ");

        textFieldNomeEditar.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        textFieldNomeEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeEditarActionPerformed(evt);
            }
        });

        jLabelTelefoneEditar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelTelefoneEditar.setText("Telefone:");
        jLabelTelefoneEditar.setPreferredSize(new java.awt.Dimension(41, 17));

        textFieldEmailEd.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jLabelEmailEditar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelEmailEditar.setText("Email:");

        textFieldTelefoneEd.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jLabelIdentificadorEditar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelIdentificadorEditar.setText("Identificador:");
        jLabelIdentificadorEditar.setPreferredSize(new java.awt.Dimension(41, 17));

        jTextFieldIdentificadorEd.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jTextFieldIdentificadorEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificadorEdActionPerformed(evt);
            }
        });

        jLabelSenhaEditar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelSenhaEditar.setText("Senha:");
        jLabelSenhaEditar.setPreferredSize(new java.awt.Dimension(41, 17));

        jLabelConfirmarSenhaEditar.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelConfirmarSenhaEditar.setText("Confirmar Senha:");
        jLabelConfirmarSenhaEditar.setPreferredSize(new java.awt.Dimension(41, 17));

        jPasswordFieldConfirmarSenhaEd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfirmarSenhaEdActionPerformed(evt);
            }
        });

        jButtonEditar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonEditar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButtonEditar.setText("Editar");
        jButtonEditar.setToolTipText("");
        jButtonEditar.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonVoltar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonVoltar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setToolTipText("");
        jButtonVoltar.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroUsuarioLayout = new javax.swing.GroupLayout(jPanelCadastroUsuario);
        jPanelCadastroUsuario.setLayout(jPanelCadastroUsuarioLayout);
        jPanelCadastroUsuarioLayout.setHorizontalGroup(
            jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefoneEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmailEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIdentificadorEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSenhaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textFieldEmailEd, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldTelefoneEd, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
                                .addComponent(textFieldNomeEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldIdentificadorEd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                                    .addComponent(jPasswordFieldSenhaEd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(16, 16, 16)
                                    .addComponent(jLabelConfirmarSenhaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPasswordFieldConfirmarSenhaEd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanelCadastroUsuarioLayout.setVerticalGroup(
            jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNomeEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNomeEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmailEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldEmailEd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTelefoneEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldTelefoneEd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabelIdentificadorEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSenhaEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(jPasswordFieldSenhaEd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelConfirmarSenhaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordFieldConfirmarSenhaEd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                        .addGap(53, 53, 53))
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addComponent(jTextFieldIdentificadorEd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(343, 343, 343)
                .addComponent(jLabelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdentificadorEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificadorEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentificadorEdActionPerformed

    private void jPasswordFieldConfirmarSenhaEdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarSenhaEdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConfirmarSenhaEdActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        
        TelaPrincipal telaprincipal = new TelaPrincipal();
        boolean editar = BancoDeDadosUsuario.editarCadastro(textFieldNomeEditar.getText(), jTextFieldIdentificadorEd.getText(), textFieldEmailEd.getText(),
                textFieldTelefoneEd.getText(), jPasswordFieldSenhaEd.getText(), jPasswordFieldConfirmarSenhaEd.getText());
        if (editar) {
            JOptionPane.showMessageDialog(this, "Os dados foram editados corretamente.");
            this.setVisible(false);            
        } else {
            JOptionPane.showMessageDialog(this, "Os campos não foram preenchidos corretamente.");
        }
        //Try and Catch para esse metódo que depende do usuário.     

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void textFieldNomeEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeEditarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPerfil().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelConfirmarSenhaEditar;
    private javax.swing.JLabel jLabelEmailEditar;
    private javax.swing.JLabel jLabelIdentificadorEditar;
    private javax.swing.JLabel jLabelNomeEditar;
    private javax.swing.JLabel jLabelSenhaEditar;
    private javax.swing.JLabel jLabelTelefoneEditar;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastroUsuario;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenhaEd;
    private javax.swing.JPasswordField jPasswordFieldSenhaEd;
    private javax.swing.JTextField jTextFieldIdentificadorEd;
    private java.awt.TextField textFieldEmailEd;
    private java.awt.TextField textFieldNomeEditar;
    private java.awt.TextField textFieldTelefoneEd;
    // End of variables declaration//GEN-END:variables

}
