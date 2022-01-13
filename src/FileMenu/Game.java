package FileMenu;


import java.awt.Color;
import java.util.Random;
import javax.swing.JTextField;

public class Game extends javax.swing.JFrame {

 
    public Game() {
        initComponents();
    }
    public int colorChoser(){
          int x = 1 + (int) (Math.random() * 10);
          return x;
}    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelGame = new javax.swing.JPanel();
        jLabelWelcomeGame = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jTextFieldGame = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanelGame.setBackground(new java.awt.Color(255, 204, 102));
        jPanelGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0), 6));
        jPanelGame.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelWelcomeGame.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 50)); // NOI18N
        jLabelWelcomeGame.setForeground(new java.awt.Color(0, 153, 0));
        jLabelWelcomeGame.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWelcomeGame.setText("Welcome to Game");
        jLabelWelcomeGame.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 6));
        jPanelGame.add(jLabelWelcomeGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 530, 70));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Exit");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelGame.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, 60, 40));

        jSeparator1.setBackground(new java.awt.Color(0, 102, 0));
        jPanelGame.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 750, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 102, 0));
        jPanelGame.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 750, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 102, 0));
        jPanelGame.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 750, 10));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 4));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton3.setBackground(new java.awt.Color(0, 153, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setBackground(new java.awt.Color(0, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setBackground(new java.awt.Color(0, 153, 153));
        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setBackground(new java.awt.Color(0, 153, 153));
        jButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(0, 153, 153));
        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setBackground(new java.awt.Color(0, 153, 153));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setBackground(new java.awt.Color(0, 153, 153));
        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setBackground(new java.awt.Color(0, 153, 153));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jPanelGame.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 750, 170));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 4));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jButton11.setBackground(new java.awt.Color(0, 153, 153));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton11);

        jButton12.setBackground(new java.awt.Color(0, 153, 153));
        jButton12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton12);

        jButton13.setBackground(new java.awt.Color(0, 153, 153));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton13);

        jButton14.setBackground(new java.awt.Color(0, 153, 153));
        jButton14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton14);

        jButton15.setBackground(new java.awt.Color(0, 153, 153));
        jButton15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton15);

        jButton16.setBackground(new java.awt.Color(0, 153, 153));
        jButton16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton16);

        jButton17.setBackground(new java.awt.Color(0, 153, 153));
        jButton17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton17);

        jButton18.setBackground(new java.awt.Color(0, 153, 153));
        jButton18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton18);

        jButton19.setBackground(new java.awt.Color(0, 153, 153));
        jButton19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jButton19);

        jPanelGame.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 750, 60));

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 0), 4));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton20.setBackground(new java.awt.Color(0, 153, 153));
        jButton20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20);

        jButton21.setBackground(new java.awt.Color(0, 153, 153));
        jButton21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton21);

        jButton22.setBackground(new java.awt.Color(0, 153, 153));
        jButton22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton22);

        jButton23.setBackground(new java.awt.Color(0, 153, 153));
        jButton23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton23);

        jButton24.setBackground(new java.awt.Color(0, 153, 153));
        jButton24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton24);

        jButton25.setBackground(new java.awt.Color(0, 153, 153));
        jButton25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton25);

        jButton26.setBackground(new java.awt.Color(0, 153, 153));
        jButton26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton26);

        jButton27.setBackground(new java.awt.Color(0, 153, 153));
        jButton27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton27);

        jButton28.setBackground(new java.awt.Color(0, 153, 153));
        jButton28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.add(jButton28);

        jPanelGame.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 750, 60));

        jButtonTwo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonTwo.setText("TwoPlayer");
        jButtonTwo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true));
        jButtonTwo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonTwo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonTwoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonTwoMouseExited(evt);
            }
        });
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 140, 40));

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true));
        jButtonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonResetMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonResetMouseExited(evt);
            }
        });
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 140, 40));

        jButtonOne.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonOne.setText("OnePlayer");
        jButtonOne.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 0), 1, true));
        jButtonOne.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonOne.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonOneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButtonOneMouseExited(evt);
            }
        });
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOneActionPerformed(evt);
            }
        });
        jPanelGame.add(jButtonOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 140, 40));

        jTextFieldGame.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanelGame.add(jTextFieldGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 530, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/imoji.png"))); // NOI18N
        jPanelGame.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/gameBanner.png"))); // NOI18N
        jPanelGame.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, 60, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGame, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelGame, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        
        jButton2.setBackground(Color.red);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(Color.white);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton5.setBackground(Color.red);
                break;
            case 2:
                jButton5.setBackground(Color.yellow);
                break;
            case 3:
                jButton5.setBackground(Color.DARK_GRAY);
                break;
            case 4:
                jButton5.setBackground(Color.black);
                break;
            case 5:
                jButton5.setBackground(Color.PINK);
                break;
            case 6:
                jButton5.setBackground(Color.orange);
                break;
            case 7:
                jButton5.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton5.setBackground(Color.blue);
                break;
            case 9:
                jButton5.setBackground(Color.green);
                break;
            default:
                jButton5.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwoActionPerformed
        jButton11.setEnabled (true);
        jButton12.setEnabled(true);
        jButton13.setEnabled (true);
        jButton14.setEnabled(true);
        jButton15.setEnabled (true);
        jButton16.setEnabled(true);
        jButton17.setEnabled (true);
        jButton18.setEnabled(true);
        jButton19.setEnabled (true);
        jLabelWelcomeGame.setText(null);
        jTextFieldGame.setText("Find the Color Faster and You Win");
        
        
    }//GEN-LAST:event_jButtonTwoActionPerformed

    private void jButtonTwoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTwoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTwoMouseExited

    private void jButtonTwoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTwoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTwoMouseEntered

    private void jButtonResetMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonResetMouseEntered

    private void jButtonResetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonResetMouseExited

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        Color c = new Color(0,153,153);
        jButton20.setBackground(c);
        jButton1.setBackground(c);
        jButton3.setBackground(c);
        jButton4.setBackground(c);
        jButton5.setBackground(c);
        jButton6.setBackground(c);
        jButton7.setBackground(c);
        jButton8.setBackground(c);
        jButton9.setBackground(c);
        jButton10.setBackground(c);
        jButton11.setBackground(c);
        jButton12.setBackground(c);
        jButton13.setBackground(c);
        jButton14.setBackground(c);
        jButton15.setBackground(c);
        jButton16.setBackground(c);
        jButton17.setBackground(c);
        jButton18.setBackground(c);
        jButton19.setBackground(c);
        jTextFieldGame.setText("");
        jLabelWelcomeGame.setText("Welcome To Game");
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonOneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOneMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOneMouseEntered

    private void jButtonOneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOneMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonOneMouseExited

    private void jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOneActionPerformed
        jButton11.setEnabled (false);
        jButton12.setEnabled(false);
        jButton13.setEnabled (false);
        jButton14.setEnabled(false);
        jButton15.setEnabled (false);
        jButton16.setEnabled(false);
        jButton17.setEnabled (false);
        jButton18.setEnabled(false);
        jButton19.setEnabled (false);
        jLabelWelcomeGame.setText("");
        jTextFieldGame.setText("Find the Color And Match Them");
        jTextFieldGame.setEditable(false);
        
    }//GEN-LAST:event_jButtonOneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton1.setBackground(Color.red);
                break;
            case 2:
                jButton1.setBackground(Color.yellow);
                break;
            case 3:
                jButton1.setBackground(Color.DARK_GRAY);
                break;
            case 4:
                jButton1.setBackground(Color.black);
                break;
            case 5:
                jButton1.setBackground(Color.PINK);
                break;
            case 6:
                jButton1.setBackground(Color.orange);
                break;
            case 7:
                jButton1.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton1.setBackground(Color.blue);
                break;
            case 9:
                jButton1.setBackground(Color.green);
                break;
            default:
                jButton1.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton3.setBackground(Color.red);
                break;
            case 2:
                jButton3.setBackground(Color.yellow);
                break;
            case 3:
                jButton3.setBackground(Color.darkGray);
                break;
            case 4:
                jButton3.setBackground(Color.black);
                break;
            case 5:
                jButton3.setBackground(Color.PINK);
                break;
            case 6:
                jButton3.setBackground(Color.orange);
                break;
            case 7:
                jButton3.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton3.setBackground(Color.blue);
                break;
            case 9:
                jButton3.setBackground(Color.green);
                break;
            default:
                jButton3.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton4.setBackground(Color.red);
                break;
            case 2:
                jButton4.setBackground(Color.yellow);
                break;
            case 3:
                jButton4.setBackground(Color.darkGray);
                break;
            case 4:
                jButton4.setBackground(Color.black);
                break;
            case 5:
                jButton4.setBackground(Color.PINK);
                break;
            case 6:
                jButton4.setBackground(Color.orange);
                break;
            case 7:
                jButton4.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton4.setBackground(Color.blue);
                break;
            case 9:
                jButton4.setBackground(Color.green);
                break;
            default:
                jButton4.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton6.setBackground(Color.red);
                break;
            case 2:
                jButton6.setBackground(Color.yellow);
                break;
            case 3:
                jButton6.setBackground(Color.darkGray);
                break;
            case 4:
                jButton6.setBackground(Color.black);
                break;
            case 5:
                jButton6.setBackground(Color.PINK);
                break;
            case 6:
                jButton6.setBackground(Color.orange);
                break;
            case 7:
                jButton6.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton6.setBackground(Color.blue);
                break;
            case 9:
                jButton6.setBackground(Color.green);
                break;
            default:
                jButton6.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton7.setBackground(Color.red);
                break;
            case 2:
                jButton7.setBackground(Color.yellow);
                break;
            case 3:
                jButton7.setBackground(Color.darkGray);
                break;
            case 4:
                jButton7.setBackground(Color.black);
                break;
            case 5:
                jButton7.setBackground(Color.PINK);
                break;
            case 6:
                jButton7.setBackground(Color.orange);
                break;
            case 7:
                jButton7.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton7.setBackground(Color.blue);
                break;
            case 9:
                jButton7.setBackground(Color.green);
                break;
            default:
                jButton7.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton8.setBackground(Color.red);
                break;
            case 2:
                jButton8.setBackground(Color.yellow);
                break;
            case 3:
                jButton8.setBackground(Color.darkGray);
                break;
            case 4:
                jButton8.setBackground(Color.black);
                break;
            case 5:
                jButton8.setBackground(Color.PINK);
                break;
            case 6:
                jButton8.setBackground(Color.orange);
                break;
            case 7:
                jButton8.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton8.setBackground(Color.blue);
                break;
            case 9:
                jButton8.setBackground(Color.green);
                break;
            default:
                jButton8.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton9.setBackground(Color.red);
                break;
            case 2:
                jButton9.setBackground(Color.yellow);
                break;
            case 3:
                jButton9.setBackground(Color.darkGray);
                break;
            case 4:
                jButton9.setBackground(Color.black);
                break;
            case 5:
                jButton9.setBackground(Color.PINK);
                break;
            case 6:
                jButton9.setBackground(Color.orange);
                break;
            case 7:
                jButton9.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton9.setBackground(Color.blue);
                break;
            case 9:
                jButton9.setBackground(Color.green);
                break;
            default:
                jButton9.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        switch (colorChoser()) {
            case 1:
                jButton10.setBackground(Color.red);
                break;
            case 2:
                jButton10.setBackground(Color.yellow);
                break;
            case 3:
                jButton10.setBackground(Color.darkGray);
                break;
            case 4:
                jButton10.setBackground(Color.black);
                break;
            case 5:
                jButton10.setBackground(Color.PINK);
                break;
            case 6:
                jButton10.setBackground(Color.orange);
                break;
            case 7:
                jButton10.setBackground(Color.MAGENTA);
                break;
            case 8:
                jButton10.setBackground(Color.blue);
                break;
            case 9:
                jButton10.setBackground(Color.green);
                break;
            default:
                jButton10.setBackground(Color.white);
                break;
        }
           
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jButton20.setBackground(Color.yellow);
    }//GEN-LAST:event_jButton20ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelWelcomeGame;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelGame;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldGame;
    // End of variables declaration//GEN-END:variables
}
