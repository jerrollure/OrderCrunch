package newpackage;

import java.awt.print.PrinterException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jerrol Gutierrez &
 *         Robbie Tria
 */
public class Main extends javax.swing.JFrame {
    Queue<String> queue = new LinkedList<>();
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        lbMain = lbPeek; 
    }
    
    // Declare Main frame label for Chips frame to access
    public static JLabel lbMain; 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Maximize = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btChips = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lbPeek = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbQueue = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txCustomer = new javax.swing.JTextField();
        btEnqueue = new javax.swing.JButton();
        btDequeue = new javax.swing.JButton();
        btPeek = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tpMainReceipt = new javax.swing.JTextPane();
        btPrint = new javax.swing.JButton();
        btShow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("OrderCrunch");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1077, Short.MAX_VALUE)
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
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Minimize)
                        .addComponent(Maximize)))
                .addContainerGap())
        );

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 50));

        jPanel3.setBackground(new java.awt.Color(111, 138, 145));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Main");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btChips.setBackground(new java.awt.Color(111, 138, 145));
        btChips.setFont(new java.awt.Font("Segoe UI Symbol", 1, 26)); // NOI18N
        btChips.setForeground(new java.awt.Color(255, 255, 255));
        btChips.setText("Chips");
        btChips.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btChips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btChipsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btChips, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btChips, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(257, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 780));

        jPanel4.setBackground(new java.awt.Color(0, 120, 175));

        jPanel5.setBackground(new java.awt.Color(111, 138, 145));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 100, 104), 2));

        lbPeek.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        lbPeek.setForeground(new java.awt.Color(255, 255, 255));
        lbPeek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPeek, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbPeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(111, 138, 145));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(82, 100, 104), 2));

        lbQueue.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        lbQueue.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbQueue, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbQueue, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Customer Name");

        txCustomer.setBackground(new java.awt.Color(82, 100, 104));
        txCustomer.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txCustomer.setForeground(new java.awt.Color(255, 255, 255));
        txCustomer.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btEnqueue.setBackground(new java.awt.Color(87, 104, 111));
        btEnqueue.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btEnqueue.setForeground(new java.awt.Color(255, 255, 255));
        btEnqueue.setText("Add to queue");
        btEnqueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnqueueActionPerformed(evt);
            }
        });

        btDequeue.setBackground(new java.awt.Color(87, 104, 111));
        btDequeue.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btDequeue.setForeground(new java.awt.Color(255, 255, 255));
        btDequeue.setText("Remove from queue");
        btDequeue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDequeueActionPerformed(evt);
            }
        });

        btPeek.setBackground(new java.awt.Color(87, 104, 111));
        btPeek.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btPeek.setForeground(new java.awt.Color(255, 255, 255));
        btPeek.setText("Peek customer ");
        btPeek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPeekActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tpMainReceipt);

        btPrint.setBackground(new java.awt.Color(87, 104, 111));
        btPrint.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        btPrint.setForeground(new java.awt.Color(255, 255, 255));
        btPrint.setText("Print");
        btPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPrintActionPerformed(evt);
            }
        });

        btShow.setBackground(new java.awt.Color(87, 104, 111));
        btShow.setFont(new java.awt.Font("Segoe UI Semibold", 0, 22)); // NOI18N
        btShow.setForeground(new java.awt.Color(255, 255, 255));
        btShow.setText("Show Receipt");
        btShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDequeue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEnqueue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txCustomer, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btPeek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btShow)
                .addGap(227, 227, 227))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btShow, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(btEnqueue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDequeue, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btPeek, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 1090, 710));

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
        setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_panelMouseDragged

    private void btChipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btChipsActionPerformed
        // Chips button to Chips frame
        Chips menu = new Chips();
        menu.setVisible(true);
    }//GEN-LAST:event_btChipsActionPerformed

    private void btEnqueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnqueueActionPerformed
        // Enqueue button
        
        // Get the entered customer name 
        String cusname = txCustomer.getText();
        
        // Check if the user entered customer name
        if (!cusname.isEmpty()) {
            // If the the customer name is not empty, enqueue it into the queue
            String Customer = txCustomer.getText();
            queue.offer(Customer);
            txCustomer.setText("");
            
            // Update the label to display the updated queue
            lbQueue.setText(queue.toString()); 
        } else {
            // If the customer name is empty, show an error message
            JOptionPane.showMessageDialog(this, "Enter customer's name to add them to the queue.", "   Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btEnqueueActionPerformed

    private void btDequeueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDequeueActionPerformed
        // Dequeue button
        
        // Check if the queue is empty
        if (!queue.isEmpty()) {
            // If the queue is not empty, dequeue an element
            queue.poll();
            lbPeek.setText("");
            tpMainReceipt.setText("");
            
            // Update the label to display the updated queue
            lbQueue.setText(queue.toString());
        } else {
            // If the queue is empty, show an error message
            JOptionPane.showMessageDialog(this, "Queue is empty.", "   Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btDequeueActionPerformed

    private void btPeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPeekActionPerformed
        // Peek Button
        
        // Check if the queue is empty
        if (!queue.isEmpty()) {
            // If the queue is not empty, retrieve the element at the front of the queue
            String peek = queue.peek();
            lbPeek.setText(peek);
        } else {
            // If the queue is empty, show an error message
            JOptionPane.showMessageDialog(this, "Queue is empty.", "   Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btPeekActionPerformed

    private void btPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPrintActionPerformed
        // Print receipt Button
        
        // Get the generated receipt
        String rcpt = tpMainReceipt.getText();
        
        // Check if the receipt text pane is empty
        if (!rcpt.isEmpty()) {
            try {
                // Print receipt
                tpMainReceipt.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            // if the receipt text pane is empty, show a message
            JOptionPane.showMessageDialog(this, "Process the customer's order first"); 
        }
    }//GEN-LAST:event_btPrintActionPerformed

    private void btShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btShowActionPerformed
        // Access the Chips frame text pane(receipt) values to show in Main frame  
            String receipt = Chips.tpChips.getText(); 
            tpMainReceipt.setText(receipt); 
    }//GEN-LAST:event_btShowActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Maximize;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton btChips;
    private javax.swing.JButton btDequeue;
    private javax.swing.JButton btEnqueue;
    private javax.swing.JButton btPeek;
    private javax.swing.JButton btPrint;
    private javax.swing.JButton btShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPeek;
    private javax.swing.JLabel lbQueue;
    private javax.swing.JPanel panel;
    private javax.swing.JTextPane tpMainReceipt;
    private javax.swing.JTextField txCustomer;
    // End of variables declaration//GEN-END:variables
}