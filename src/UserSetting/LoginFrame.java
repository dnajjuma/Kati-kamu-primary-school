package UserSetting;

import MainPackage.MainFrame;
import SomeFunctions.MyConnection;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import javax.swing.border.Border;
import javax.swing.*;

public class LoginFrame extends JFrame{
    public static String SeeUser;

    int loginAttempt = 1;
    public LoginFrame() {
        initComponents();
    this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jTextUserName = new javax.swing.JTextField();
        jLabelLoginAs = new javax.swing.JLabel();
        jCancel = new javax.swing.JButton();
        jLogin = new javax.swing.JButton();
        jPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login");
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(19, 22, 29));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(228, 228, 228), 6));
        jPanel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel1KeyTyped(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextUserName.setBackground(new java.awt.Color(50, 50, 50));
        jTextUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextUserName.setForeground(new java.awt.Color(193, 193, 193));
        jTextUserName.setText("username");
        jTextUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextUserNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextUserNameFocusLost(evt);
            }
        });
        jTextUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextUserNameKeyTyped(evt);
            }
        });
        jPanel1.add(jTextUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 330, 40));

        jLabelLoginAs.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelLoginAs.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginAs.setText("Login As :");
        jPanel1.add(jLabelLoginAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 160, 40));

        jCancel.setBackground(new java.awt.Color(56, 56, 56));
        jCancel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jCancel.setForeground(new java.awt.Color(255, 255, 255));
        jCancel.setText("Cancel");
        jCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCancelMouseExited(evt);
            }
        });
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 160, 48));

        jLogin.setBackground(new java.awt.Color(38, 38, 38));
        jLogin.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLogin.setText("Login");
        jLogin.setBorder(null);
        jLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLoginMouseExited(evt);
            }
        });
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        jLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLoginKeyTyped(evt);
            }
        });
        jPanel1.add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 160, 47));

        jPassword.setBackground(new java.awt.Color(52, 52, 52));
        jPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPassword.setForeground(new java.awt.Color(222, 217, 217));
        jPassword.setText("password");
        jPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFocusLost(evt);
            }
        });
        jPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPasswordKeyTyped(evt);
            }
        });
        jPanel1.add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 330, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Click to create a new acount");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 230, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Forgot Password");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 140, -1));

        jSeparator1.setBackground(new java.awt.Color(1, 1, 1));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 86, 430, 10));

        jComboBox1.setBackground(new java.awt.Color(254, 254, 254));
        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(1, 1, 1));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principle", "Teacher", "Student" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 160, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login to System ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 380, 53));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        if(loginAttempt <= 3){
            loginAttempt++;
        PreparedStatement st;
        ResultSet rs;
        String loginAs = String.valueOf(jComboBox1.getSelectedItem());
        String username = jTextUserName.getText();
        String Password = String.valueOf(jPassword.getPassword());
        
        String query ="SELECT * FROM login where userName=? AND userpassword=? And LoginAs=?" ;
        
        try {
            
        st = MyConnection.getConnection().prepareStatement(query);
        st.setString(1, username);
        st.setString(2, Password);
        st.setString(3, loginAs);
        
        rs = st.executeQuery();
        
        rs.next();        
            if(rs.getRow() == 1){
                SeeUser = jComboBox1.getSelectedItem().toString();
                MainFrame mf = new MainFrame();
                mf.setVisible(true);
                mf.pack();
                mf.setLocationRelativeTo(null);
                mf.setExtendedState(MainFrame.MAXIMIZED_BOTH);
                this.dispose();        
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "Invalid UserName and Password","Error",2);
        }
        }
        catch(SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        }
        }
        else{
            JOptionPane.showMessageDialog(this,"You Attempt more than 3 times");
            System.exit(0);
        }
    }//GEN-LAST:event_jLoginActionPerformed
    
    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jCancelActionPerformed

    private void jLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLoginMouseEntered
        
        jLogin.setBackground(Color.GREEN);
    }//GEN-LAST:event_jLoginMouseEntered

    private void jCancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelMouseEntered
        jCancel.setBackground(Color.red);
    }//GEN-LAST:event_jCancelMouseEntered

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        Admin ad = new Admin();
        ad.setVisible(true);
        ad.pack();
        ad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        jLabel6.setForeground(Color.red);
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        jLabel6.setBorder(border);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
      jLabel6.setForeground(Color.white);
      jLabel6.setBorder(null);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
      Hint hint = new Hint();
      hint.setVisible(true);
      hint.setLocationRelativeTo(null);
      
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.red);
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        jLabel7.setBorder(border);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setForeground(Color.white);
        jLabel7.setBorder(null);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLoginMouseExited
        
        jLogin.setBackground(Color.black);
    }//GEN-LAST:event_jLoginMouseExited

    private void jPanel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel1KeyTyped
        
    }//GEN-LAST:event_jPanel1KeyTyped

    private void jLoginKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLoginKeyTyped
     
    }//GEN-LAST:event_jLoginKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      // DataAcces d = new DataAcces();
        
    }//GEN-LAST:event_formWindowOpened

    private void jPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
            jLoginActionPerformed(null);
    }//GEN-LAST:event_jPasswordKeyTyped

    private void jTextUserNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextUserNameKeyTyped
        char num = evt.getKeyChar();
        if(num == KeyEvent.VK_ENTER)
            jTextUserName.nextFocus();
    }//GEN-LAST:event_jTextUserNameKeyTyped

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUserNameFocusGained

        if(jTextUserName.getText().trim().equals("username")){
            jTextUserName.setText("");
            jTextUserName.setForeground(Color.white);

        }
    }//GEN-LAST:event_jTextUserNameFocusGained

    private void jTextUserNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextUserNameFocusLost

        if(jTextUserName.getText().trim().equals("")||
            jTextUserName.getText().trim().equals("username")){
        jTextUserName.setText("username");
        jTextUserName.setForeground(new Color(153,153,153,153));
        }
    }//GEN-LAST:event_jTextUserNameFocusLost

    private void jPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusGained
        
        if(jPassword.getText().equals("password")){
            jPassword.setText("");
            jPassword.setForeground(Color.white);
        }
    }//GEN-LAST:event_jPasswordFocusGained

    private void jPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFocusLost
        
        if(jPassword.getText().equals("")||
           jPassword.getText().equals("password")){
        jPassword.setText("password");
        jPassword.setForeground(new Color(153,153,153,153));
        }
    }//GEN-LAST:event_jPasswordFocusLost

    private void jCancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelMouseExited
        jCancel.setBackground(Color.black);
     
    }//GEN-LAST:event_jCancelMouseExited

    
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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancel;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLoginAs;
    private javax.swing.JButton jLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextUserName;
    // End of variables declaration//GEN-END:variables
}
