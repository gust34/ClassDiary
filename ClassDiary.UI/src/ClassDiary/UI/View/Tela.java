package ClassDiary.UI.View;

import ClassDiary.Business.Services.AutenticacaoService;
import ClassDiary.Domain.DTO.Usuario;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame 
{

    AutenticacaoService Auth;
    public Tela() {
        initComponents();
        Auth = new AutenticacaoService();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        cxLogin = new javax.swing.JTextField();
        cxSenha = new javax.swing.JPasswordField();
        BtEntrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cxLogin.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cxLoginActionPerformed(evt);
            }
        });
        jPanel1.add(cxLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 400, 50));

        cxSenha.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jPanel1.add(cxSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 400, 50));

        BtEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/btnlogin.png"))); // NOI18N
        BtEntrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        BtEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(BtEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 240, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Password.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/User.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/background4.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cxLoginActionPerformed

    }//GEN-LAST:event_cxLoginActionPerformed

    private void BtEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEntrarActionPerformed
        Usuario user;
        user = Auth.Logar(cxLogin.getText(), cxSenha.getText()); 
        if(user != null)
        {
            home tela = new home(user);
            tela.setVisible(true);
            dispose();
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "Login ou Senha inv??lido, tente novamente");
        }
    }//GEN-LAST:event_BtEntrarActionPerformed
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtEntrar;
    private javax.swing.JTextField cxLogin;
    private javax.swing.JPasswordField cxSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
