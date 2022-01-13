package UserSetting;

import static SomeFunctions.Helper.AcountExist;
import SomeFunctions.MyConnection;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

public class Admin extends javax.swing.JFrame {
       public static String Combo;
        public static String loginAs;
        public static String user;
        public static String pass;
        public static String Hint;
  
    public Admin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextUserName = new javax.swing.JTextField();
        jTextHint = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextRePass1 = new javax.swing.JPasswordField();
        jTextPass = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelLoginAs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(16, 18, 24));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 6, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Name: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Hint:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 60, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Re-Password: ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 262, 150, 30));

        jTextUserName.setBackground(new java.awt.Color(35, 35, 35));
        jTextUserName.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jTextUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 240, 30));

        jTextHint.setBackground(new java.awt.Color(35, 35, 35));
        jTextHint.setForeground(new java.awt.Color(254, 254, 254));
        jTextHint.setSelectedTextColor(new java.awt.Color(80, 80, 80));
        jTextHint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextHintActionPerformed(evt);
            }
        });
        jTextHint.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextHintKeyTyped(evt);
            }
        });
        jPanel1.add(jTextHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 240, 30));

        jButtonCancel.setBackground(new java.awt.Color(254, 254, 254));
        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setForeground(new java.awt.Color(1, 1, 1));
        jButtonCancel.setText("Cancel");
        jButtonCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 160, 50));

        jButtonRegister.setBackground(new java.awt.Color(254, 254, 254));
        jButtonRegister.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonRegister.setForeground(new java.awt.Color(1, 1, 1));
        jButtonRegister.setText("Register");
        jButtonRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonRegisterMouseEntered(evt);
            }
        });
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 160, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Click to Login");
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
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 110, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Password: ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 120, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Register Admin");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 300, 50));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 72, 430, 20));

        jTextRePass1.setBackground(new java.awt.Color(35, 35, 35));
        jTextRePass1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextRePass1.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jTextRePass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 240, 30));

        jTextPass.setBackground(new java.awt.Color(35, 35, 35));
        jTextPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextPass.setForeground(new java.awt.Color(254, 254, 254));
        jPanel1.add(jTextPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 240, 30));

        jComboBox1.setBackground(new java.awt.Color(254, 254, 254));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(1, 1, 1));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principle", "Teacher", "Student" }));
        jComboBox1.setBorder(null);
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 240, 30));

        jLabelLoginAs.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelLoginAs.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLoginAs.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoginAs.setText("Register As:");
        jPanel1.add(jLabelLoginAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextHintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextHintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextHintActionPerformed

    private void jTextHintKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextHintKeyTyped
       
    }//GEN-LAST:event_jTextHintKeyTyped

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
       Combo = jComboBox1.getSelectedItem().toString();
        
           
        String Query = "SELECT * FROM login WHERE loginAs ="+"'"+Combo+"'";
        PreparedStatement p;
        ResultSet r;
        try{
            p = MyConnection.getConnection().prepareStatement(Query);
            r = p.executeQuery();
            if(r.next()){
                if(!r.getString("loginAs").equals("Principle")){
                    RegisterAccount();
                }
                else{
                JOptionPane.showMessageDialog(null, "The Principle Account Already Exist!");
                }
            }
            else{                
                RegisterAccount();
            }
        }catch(SQLException | HeadlessException e){
           JOptionPane.showMessageDialog(null,"Try Again"+e.getMessage());
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        lf.pack();
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        Border border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        jLabel7.setBorder(border);
        jLabel7.setForeground(Color.red);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBorder(null);
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jButtonRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegisterMouseEntered
      
    }//GEN-LAST:event_jButtonRegisterMouseEntered

    //==================Some Funtions==============================
    
    public boolean CheckField(){
        String Name = jTextUserName.getText();
        String Pass = String.valueOf(jTextPass.getPassword());
        String pass2 = String.valueOf(jTextRePass1.getPassword());
        Hint = jTextHint.getText();
        
        if(Name.trim().equals("")|| Pass.trim().equals("")|| pass2.trim().equals("")||
                Hint.trim().equals("")){
            JOptionPane.showMessageDialog(null, "The one or more TextField are Empty","Error",2);
            return false;
        }
        else if(!Pass.equals(pass2)){
            JOptionPane.showMessageDialog(null,"Password Does Not Match", "Try Again",2);
            return false;
        }
        else
            return true;
    }
    
    
    
//============== Register Start ================================================
    private void RegisterAccount(){
      Combo = jComboBox1.getSelectedItem().toString();
       loginAs = String.valueOf(jComboBox1.getSelectedItem());
       user = jTextUserName.getText();
       pass =String.valueOf(jTextPass.getPassword());
       Hint = jTextHint.getText();
        
        if(pass.length()<6 && pass.length()>0)
            JOptionPane.showMessageDialog(null, "Please Choose Password Greater Than 6 Character!");
        else{    
        if(CheckField()){
            if(!AcountExist(user)){
               if(Combo.equals("Teacher")){
                    AdmimPassword admin = new AdmimPassword();
                    admin.setVisible(true);
                    admin.pack();
                    admin.setLocationRelativeTo(null);
                    return;
                }
                PreparedStatement ps;
                String registerQuery = "insert into login(userName, userpassword, Hint, loginAs) values(?,?,?,?)";
              
        try {
            ps = MyConnection.getConnection().prepareStatement(registerQuery);
            ps.setString(1, user);
            ps.setString(2,pass);
            ps.setString(3, Hint);
            ps.setString(4, loginAs);           
            if(ps.executeUpdate() != 0)
                JOptionPane.showMessageDialog(null,"Your Account Has Been Created");
            else
                JOptionPane.showMessageDialog(null,"An Error Has Occured Please Check!");
                
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }
        }
    }
    //================Register End==============================================   
         
    
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelLoginAs;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextHint;
    private javax.swing.JPasswordField jTextPass;
    private javax.swing.JPasswordField jTextRePass1;
    private javax.swing.JTextField jTextUserName;
    // End of variables declaration//GEN-END:variables
}
