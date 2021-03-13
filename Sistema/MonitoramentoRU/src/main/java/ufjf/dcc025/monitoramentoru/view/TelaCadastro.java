/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufjf.dcc025.monitoramentoru.view;

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
        jLabelTitulo = new javax.swing.JLabel();
        jPanelCadastroUsuario = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        textFieldNome = new java.awt.TextField();
        jLabelCargo = new javax.swing.JLabel();
        jComboBoxCargo = new javax.swing.JComboBox<>();
        jLabelTelefone = new javax.swing.JLabel();
        textFieldNome1 = new java.awt.TextField();
        jLabelEmail1 = new javax.swing.JLabel();
        textFieldTelefone = new java.awt.TextField();
        jLabelIdentificador = new javax.swing.JLabel();
        jTextFieldIdentificador = new javax.swing.JTextField();
        jLabelSenha = new javax.swing.JLabel();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jLabelConfirmarSenha = new javax.swing.JLabel();
        jPasswordFieldConfirmarSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CadastroSistemaDeMonitoramento");
        setResizable(false);

        jLabelTitulo.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 18)); // NOI18N
        jLabelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/usuario-de-perfil.png"))); // NOI18N
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

        textFieldNome1.setFont(new java.awt.Font("Gill Sans MT", 0, 14)); // NOI18N

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

        javax.swing.GroupLayout jPanelCadastroUsuarioLayout = new javax.swing.GroupLayout(jPanelCadastroUsuario);
        jPanelCadastroUsuario.setLayout(jPanelCadastroUsuarioLayout);
        jPanelCadastroUsuarioLayout.setHorizontalGroup(
            jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addComponent(jLabelTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                                .addComponent(jLabelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextFieldIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
                                        .addComponent(textFieldNome1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(textFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelCadastroUsuarioLayout.setVerticalGroup(
            jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroUsuarioLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldNome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEmail1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelIdentificador, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jTextFieldIdentificador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelCadastroUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordFieldConfirmarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(304, 304, 304))
            .addComponent(jPanelCadastroUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCadastroUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentificadorActionPerformed

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
    private javax.swing.JComboBox<String> jComboBoxCargo;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelConfirmarSenha;
    private javax.swing.JLabel jLabelEmail1;
    private javax.swing.JLabel jLabelIdentificador;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelTelefone;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelCadastroUsuario;
    private javax.swing.JPasswordField jPasswordFieldConfirmarSenha;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldIdentificador;
    private java.awt.TextField textFieldNome;
    private java.awt.TextField textFieldNome1;
    private java.awt.TextField textFieldTelefone;
    // End of variables declaration//GEN-END:variables
}
