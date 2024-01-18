package newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerrol Gutierrez &
 *         Robbie Tria
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Maximize = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txUsername = new javax.swing.JTextField();
        psPassword = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(111, 138, 145));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 120, 175));
        panel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMouseDragged(evt);
            }
        });
        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OrderCrunch");

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-close-window-50.png"))); // NOI18N
        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });

        Maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-maximize-button-50.png"))); // NOI18N
        Maximize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaximizeMouseClicked(evt);
            }
        });

        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-minimize-window-50.png"))); // NOI18N
        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 637, Short.MAX_VALUE)
                .addComponent(Minimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Maximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Close)
                .addGap(36, 36, 36))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Minimize)
                    .addComponent(Maximize))
                .addContainerGap())
        );

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Logo (Small).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 480, 480));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icon.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Password");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 180, -1));

        txUsername.setBackground(new java.awt.Color(82, 100, 104));
        txUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txUsername.setForeground(new java.awt.Color(255, 255, 255));
        txUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 180, 32));

        psPassword.setBackground(new java.awt.Color(82, 100, 104));
        psPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        psPassword.setForeground(new java.awt.Color(255, 255, 255));
        psPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(psPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 180, 32));

        btLogin.setBackground(new java.awt.Color(0, 120, 175));
        btLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btLogin.setForeground(new java.awt.Color(255, 255, 255));
        btLogin.setText("Login");
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // Login Button
        
        // Get the entered username and password
        String user = txUsername.getText();
        String pass = psPassword.getText();
        
        // Check if the user entered any value
        if (user.isEmpty() || pass.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter username and password.", "   Error", JOptionPane.ERROR_MESSAGE); 
        } else {
            // Check if the user entered correct username and password
            if (user.equals("demo") && pass.equals("demo")) {
                new Main().setVisible(true);
                this.setVisible(false);
            } else {
                // If the username and password are incorrect, show an error message
                JOptionPane.showMessageDialog(null, "Invalid username or password"); 
            }
        }
    }//GEN-LAST:event_btLoginActionPerformed

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        // Close Button
        dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void MaximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaximizeMouseClicked
        // Maximize Button
        
        // Check the current state of the window
        if (this.getExtendedState() != Login.MAXIMIZED_BOTH) {
            // If the window is not maximized, the window is maximized
            this.setExtendedState(Login.MAXIMIZED_BOTH);
        } else {
            // If the window is already maximized, restore window to normal size
            this.setExtendedState(Login.NORMAL);
        }
    }//GEN-LAST:event_MaximizeMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // Minimize Button
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_MinimizeMouseClicked
    
    // Create a Movable frame
    private int xMouse,yMouse;
    private void panelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMousePressed
        // Store the initial mouse position when the panel is pressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_panelMousePressed

    private void panelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseDragged
        // Calculate the new location of the frame based on the mouse drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_panelMouseDragged

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Maximize;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton btLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel panel;
    private javax.swing.JPasswordField psPassword;
    private javax.swing.JTextField txUsername;
    // End of variables declaration//GEN-END:variables
}