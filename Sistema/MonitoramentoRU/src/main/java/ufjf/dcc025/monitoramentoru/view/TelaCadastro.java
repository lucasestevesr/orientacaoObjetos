/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.view;

import javax.swing.JOptionPane;
import ufjf.dcc025.monitoramentoru.controller.UsuarioController;

/**
 *
 * @author Your Name <lucas.esteves@engenharia.ufjf.br>
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        this.setLocationRelativeTo(null);
        //txtId.setText(Integer.toString(UsuarioController.getId()));

    }

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
        jLabelNome = new javax.swing.JLabel();
        textFieldNome = new java.awt.TextField();
        jLabelCargo = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jLabelTelefone = new javax.swing.JLabel();
        textFieldEmail = new java.awt.TextField();
        jLabelEmail1 = new javax.swing.JLabel();
        textFieldTelefone = new java.awt.TextField();
        jLabelIdentificador = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelConfirmarSenha = new javax.swing.JLabel();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();
        jButtonSalvar = new javax.swing.JButton();
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
        jLabelTitulo.setText("Cadastro de Usuário");
        jLabelTitulo.setToolTipText("");

        jPanelCadastroUsuario.setPreferredSize(new java.awt.Dimension(780, 400));

        jLabelNome.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelNome.setText("Nome: ");

        textFieldNome.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jLabelCargo.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelCargo.setText("Cargo:");

        jComboBoxCargo.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jComboBoxCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Discente", "Docente", "Tae" }));

        jLabelTelefone.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelTelefone.setText("Telefone:");
        jLabelTelefone.setPreferredSize(new java.awt.Dimension(41, 17));

        textFieldEmail.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jLabelEmail1.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelEmail1.setText("Email:");

        textFieldTelefone.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

        jLabelIdentificador.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelIdentificador.setText("Identificador:");
        jLabelIdentificador.setPreferredSize(new java.awt.Dimension(41, 17));

        jTextFieldIdentificador.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N
        jTextFieldIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificadorActionPerformed(evt);
            }
        });

        jLabelSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelSenha.setText("Senha:");
        jLabelSenha.setPreferredSize(new java.awt.Dimension(41, 17));

        jLabelConfirmarSenha.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        jLabelConfirmarSenha.setText("Confirmar Senha:");
        jLabelConfirmarSenha.setPreferredSize(new java.awt.Dimension(41, 17));

        jPasswordFieldConfirmarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConfirmarSenhaActionPerformed(evt);
            }
        });

        jButtonSalvar.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSalvar.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setToolTipText("");
        jButtonSalvar.setMargin(new java.awt.Insets(5, 14, 5, 14));
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
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
                    .addComponent(jLabelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textFieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                                .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanelCadastroUsuarioLayout.setVerticalGroup(
            jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jComboBoxCargo))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addGap(7, 7, 7))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCadastroUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(323, 323, 323))
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

    private void jTextFieldIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentificadorActionPerformed

    private void jPasswordFieldConfirmarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConfirmarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConfirmarSenhaActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        validacao();
        //Try and Catch para esse metódo que depende do usuário.     
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelConfirmarSenha;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCadastroUsuario;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldIdentificador;
    private java.awt.TextField textFieldEmail;
    private java.awt.TextField textFieldNome;
    private java.awt.TextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
    private void validacao() {
        boolean sucesso;
        try {
            UsuarioController usuarioContoller = new UsuarioController();

            sucesso = usuarioContoller.cadastrarUsuario(jComboBoxCargo.getSelectedItem().toString(), textFieldNome.getText(), jTextFieldIdentificador.getText(), textFieldEmail.getText(), textFieldTelefone.getText(), jPasswordFieldSenha.getText(), jPasswordFieldConfirmarSenha.getText());

            if (sucesso) {
                JOptionPane.showMessageDialog(null, "Cadastro Realizado.");

            } else {
                JOptionPane.showMessageDialog(null, "Os campos não foram preenchidos corretamente.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        //Como fazer funcionar?! \/
        //txtId.setText(Integer.toString(UsuarioController.getId())); 
        this.dispose();
    }
}
