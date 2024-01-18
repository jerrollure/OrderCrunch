package newpackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Jerrol Gutierrez &
 *         Robbie Tria
 */
public class Chips extends javax.swing.JFrame {

    /**
     * Creates new form Chips
     */
    public Chips() {
        initComponents();
        txAmount.setBackground(new java.awt.Color(0,0,0,1)); // Set Amount text field transparent
        tpChips = tpChipsReceipt;
    }
    
    // Declare Chips frame text pane for Main frame to access
    public static JTextPane tpChips;
    
    DefaultTableModel model;
    
   
    public void receipt() {
         // Create a Date object to represent the current date and time
        Date dte = new Date();
        
         // Create SimpleDateFormat objects to format the date and time
        SimpleDateFormat dformat = new SimpleDateFormat("yyyy-mm-dd");
        SimpleDateFormat tformat = new SimpleDateFormat("hh:mm:ss a");
        
        // Format the date and time as strings
        String date = dformat.format(dte);
        String time = tformat.format(dte);
        
        // Set the content of the receipt text pane
        tpChipsReceipt.setText("                                                      Crunch Crafters \n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "                        \n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "---------------------------------------------------------------------------------------------------\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + " \t\t     Customer: " + lbName.getText() + "\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "---------------------------------------------------------------------------------------------------\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "   Product \t             Price                       Quantity \t                     Total \n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "---------------------------------------------------------------------------------------------------\n");
        
        // Get the table model of the orders table
        DefaultTableModel tbl = (DefaultTableModel) tbOrders.getModel();
        
        // Iterate over each row in the table 
        for (int i = 0; i < tbOrders.getRowCount(); i ++) {
            // Get the values from each column in the current row     
            String product = tbl.getValueAt(i,0).toString();
            String price = tbl.getValueAt(i,1).toString();
            String quantity = tbl.getValueAt(i,2).toString();
            String total = tbl.getValueAt(i,3).toString();
            
            // Attach the product details to the receipt text pane
            tpChipsReceipt.setText(tpChipsReceipt.getText() + product + "       " + price + "\t\t       " + quantity + "\t                         " + total + "\n" );
        }
        // Attach the total, amount, change, and date/time to the receipt text pane    
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "                                                                                               \n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "                                                                                               \n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + " Total : \t              " + lbTotal.getText() + "\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + " Amount : \t              " + txAmount.getText() + "\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + " Change : \t              " + lbChange.getText() + "\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "---------------------------------------------------------------------------------------------------\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "  \tDate: " + date + "  \tTime: " + time + "\n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "                                                                                               \n");
        tpChipsReceipt.setText(tpChipsReceipt.getText() + "                                               Thank you for ordering! \n");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        Close = new javax.swing.JLabel();
        Maximize = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        OrderCrunch = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Chips = new javax.swing.JLabel();
        btMain = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        lbProduct2 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        btProduct2 = new javax.swing.JButton();
        spProduct2 = new javax.swing.JSpinner();
        jPanel13 = new javax.swing.JPanel();
        lbProduct3 = new javax.swing.JLabel();
        lbPrice3 = new javax.swing.JLabel();
        btProduct3 = new javax.swing.JButton();
        spProduct3 = new javax.swing.JSpinner();
        jPanel12 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbProduct6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btProduct6 = new javax.swing.JButton();
        spProduct6 = new javax.swing.JSpinner();
        jPanel15 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        lbProduct5 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btProduct5 = new javax.swing.JButton();
        spProduct5 = new javax.swing.JSpinner();
        jPanel18 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        lbProduct4 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        btProduct4 = new javax.swing.JButton();
        spProduct4 = new javax.swing.JSpinner();
        jPanel22 = new javax.swing.JPanel();
        lbProduct7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        btProduct7 = new javax.swing.JButton();
        spProduct7 = new javax.swing.JSpinner();
        jPanel23 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        lbProduct8 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        btProduct8 = new javax.swing.JButton();
        spProduct8 = new javax.swing.JSpinner();
        jPanel25 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        lbProduct9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        btProduct9 = new javax.swing.JButton();
        spProduct9 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        spProduct1 = new javax.swing.JSpinner();
        btProduct1 = new javax.swing.JButton();
        lbProduct1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        lbProduct12 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        btProduct12 = new javax.swing.JButton();
        spProduct12 = new javax.swing.JSpinner();
        jPanel36 = new javax.swing.JPanel();
        lbProduct14 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        btProduct14 = new javax.swing.JButton();
        spProduct14 = new javax.swing.JSpinner();
        jPanel37 = new javax.swing.JPanel();
        lbProduct13 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btProduct13 = new javax.swing.JButton();
        spProduct13 = new javax.swing.JSpinner();
        jPanel38 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        lbProduct16 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btProduct16 = new javax.swing.JButton();
        spProduct16 = new javax.swing.JSpinner();
        jPanel41 = new javax.swing.JPanel();
        lbProduct17 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        btProduct17 = new javax.swing.JButton();
        spProduct17 = new javax.swing.JSpinner();
        jPanel42 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        lbProduct10 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        btProduct10 = new javax.swing.JButton();
        spProduct10 = new javax.swing.JSpinner();
        jPanel48 = new javax.swing.JPanel();
        lbProduct15 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        btProduct15 = new javax.swing.JButton();
        spProduct15 = new javax.swing.JSpinner();
        jPanel49 = new javax.swing.JPanel();
        lbProduct18 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        spProduct18 = new javax.swing.JSpinner();
        btProduct18 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        lbProduct11 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        btProduct11 = new javax.swing.JButton();
        spProduct11 = new javax.swing.JSpinner();
        jPanel27 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbOrders = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbChange = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txAmount = new javax.swing.JTextField();
        btTotal = new javax.swing.JToggleButton();
        btDelete = new javax.swing.JToggleButton();
        btCalculate = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpChipsReceipt = new javax.swing.JTextPane();
        btClear = new javax.swing.JToggleButton();
        btReceipt = new javax.swing.JToggleButton();
        lbName = new javax.swing.JLabel();

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

        OrderCrunch.setFont(new java.awt.Font("Segoe UI Symbol", 1, 20)); // NOI18N
        OrderCrunch.setForeground(new java.awt.Color(255, 255, 255));
        OrderCrunch.setText("OrderCrunch");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(OrderCrunch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1387, Short.MAX_VALUE)
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
                    .addComponent(OrderCrunch)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Close, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Minimize)
                        .addComponent(Maximize)))
                .addContainerGap())
        );

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 50));

        jPanel3.setBackground(new java.awt.Color(111, 138, 145));

        Chips.setFont(new java.awt.Font("Segoe UI Symbol", 1, 26)); // NOI18N
        Chips.setForeground(new java.awt.Color(255, 255, 255));
        Chips.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Chips.setText("Chips");
        Chips.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btMain.setBackground(new java.awt.Color(111, 138, 145));
        btMain.setFont(new java.awt.Font("Segoe UI Symbol", 1, 26)); // NOI18N
        btMain.setForeground(new java.awt.Color(255, 255, 255));
        btMain.setText("Main");
        btMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        btMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMainActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Chips, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(btMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(360, Short.MAX_VALUE)
                .addComponent(btMain, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(Chips, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 1020));

        jTabbedPane1.setBackground(new java.awt.Color(0, 120, 175));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Symbol", 0, 11)); // NOI18N

        jPanel4.setBackground(new java.awt.Color(0, 120, 175));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(111, 138, 145));
        jPanel9.setMaximumSize(new java.awt.Dimension(225, 145));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Beet (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(111, 138, 145));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct2.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct2.setText("Beet Chips");

        jLabel41.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("P 110");

        btProduct2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct2.setText("Add");
        btProduct2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct2ActionPerformed(evt);
            }
        });

        spProduct2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct2))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lbProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(spProduct2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct2)))
                .addGap(10, 10, 10))
        );

        jPanel13.setBackground(new java.awt.Color(111, 138, 145));
        jPanel13.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct3.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct3.setText("Cassava Chips");

        lbPrice3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        lbPrice3.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice3.setText("P 120");

        btProduct3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct3.setText("Add");
        btProduct3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct3ActionPerformed(evt);
            }
        });

        spProduct3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrice3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct3))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(lbProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPrice3))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(spProduct3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct3)))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(111, 138, 145));
        jPanel12.setMaximumSize(new java.awt.Dimension(225, 145));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cassava chips (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel11)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel14.setBackground(new java.awt.Color(111, 138, 145));
        jPanel14.setForeground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct6.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct6.setText("Vegetable Chips");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("P 150");

        btProduct6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct6.setText("Add");
        btProduct6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct6ActionPerformed(evt);
            }
        });

        spProduct6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(lbProduct6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(lbProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(spProduct6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct6)))
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(111, 138, 145));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vegetable chips (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel16.setBackground(new java.awt.Color(111, 138, 145));
        jPanel16.setMaximumSize(new java.awt.Dimension(225, 145));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Chili lime (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(34, 34, 34))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel17.setBackground(new java.awt.Color(111, 138, 145));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct5.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct5.setText("CL Plantain Chips");
        lbProduct5.setToolTipText("");

        jLabel34.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("P 140");

        btProduct5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct5.setText("Add");
        btProduct5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct5ActionPerformed(evt);
            }
        });

        spProduct5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct5.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProduct5)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(btProduct5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        jPanel18.setBackground(new java.awt.Color(111, 138, 145));
        jPanel18.setMaximumSize(new java.awt.Dimension(225, 145));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Kangkong chips (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel19.setBackground(new java.awt.Color(111, 138, 145));
        jPanel19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct4.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct4.setText("Kangkong Chips");

        jLabel44.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("P 130");

        btProduct4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct4.setText("Add");
        btProduct4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct4ActionPerformed(evt);
            }
        });

        spProduct4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(lbProduct4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct4))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(lbProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(spProduct4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct4)))
                .addGap(10, 10, 10))
        );

        jPanel22.setBackground(new java.awt.Color(111, 138, 145));
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel22.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct7.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct7.setText("Mango Chips");

        jLabel28.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("P 160");

        btProduct7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct7.setText("Add");
        btProduct7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct7ActionPerformed(evt);
            }
        });

        spProduct7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spProduct7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProduct7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(spProduct7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct7))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(lbProduct7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)))
                .addGap(14, 14, 14))
        );

        jPanel23.setBackground(new java.awt.Color(111, 138, 145));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salmon skin (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel24.setBackground(new java.awt.Color(111, 138, 145));
        jPanel24.setForeground(new java.awt.Color(255, 255, 255));
        jPanel24.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct8.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct8.setText("Strawberry crisps");

        jLabel29.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("P 170");

        btProduct8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct8.setText("Add");
        btProduct8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct8ActionPerformed(evt);
            }
        });

        spProduct8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct8.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(lbProduct8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(spProduct8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btProduct8)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduct8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spProduct8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(btProduct8))
                .addGap(12, 12, 12))
        );

        jPanel25.setBackground(new java.awt.Color(111, 138, 145));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mango chips (Custom).png"))); // NOI18N
        jLabel12.setToolTipText("");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel26.setBackground(new java.awt.Color(111, 138, 145));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Strawberry crisps (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel46.setBackground(new java.awt.Color(111, 138, 145));
        jPanel46.setForeground(new java.awt.Color(255, 255, 255));
        jPanel46.setPreferredSize(new java.awt.Dimension(225, 90));

        lbProduct9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct9.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct9.setText("Salmon skin ");

        jLabel31.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("P 400");

        btProduct9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct9.setText("Add");
        btProduct9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct9ActionPerformed(evt);
            }
        });

        spProduct9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct9.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel46Layout = new javax.swing.GroupLayout(jPanel46);
        jPanel46.setLayout(jPanel46Layout);
        jPanel46Layout.setHorizontalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel46Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(lbProduct9, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(spProduct9, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel46Layout.createSequentialGroup()
                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(btProduct9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel46Layout.setVerticalGroup(
            jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel46Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduct9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spProduct9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(btProduct9))
                .addGap(11, 11, 11))
        );

        jPanel2.setBackground(new java.awt.Color(111, 138, 145));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/banana chips (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(111, 138, 145));

        spProduct1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btProduct1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct1.setText("Add");
        btProduct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct1ActionPerformed(evt);
            }
        });

        lbProduct1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct1.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct1.setText("Banana Chips");

        jLabel36.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("P 100");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct1))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(btProduct1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                        .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Chips 1", jPanel4);

        jPanel5.setBackground(new java.awt.Color(0, 120, 175));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setFont(new java.awt.Font("Segoe UI Symbol", 0, 12)); // NOI18N

        jPanel28.setBackground(new java.awt.Color(111, 138, 145));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/matchstick (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(33, 33, 33))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel29.setBackground(new java.awt.Color(111, 138, 145));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sweet potato (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(33, 33, 33))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel30.setBackground(new java.awt.Color(111, 138, 145));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yellow habanero (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(33, 33, 33))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel33.setBackground(new java.awt.Color(111, 138, 145));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paprika (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(34, 34, 34))
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel34.setBackground(new java.awt.Color(111, 138, 145));
        jPanel34.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct12.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct12.setText("Paprika Plantain");

        jLabel38.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("P 120");

        btProduct12.setBackground(new java.awt.Color(87, 104, 111));
        btProduct12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct12.setText("Add");
        btProduct12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct12ActionPerformed(evt);
            }
        });

        spProduct12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct12.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lbProduct12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct12))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(lbProduct12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38))
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(spProduct12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct12)))
                .addGap(10, 10, 10))
        );

        jPanel36.setBackground(new java.awt.Color(111, 138, 145));
        jPanel36.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct14.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct14.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct14.setText("Yellow Habanero");

        jLabel32.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("P 140");

        btProduct14.setBackground(new java.awt.Color(87, 104, 111));
        btProduct14.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct14.setText("Add");
        btProduct14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct14ActionPerformed(evt);
            }
        });

        spProduct14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct14.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct14))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(lbProduct14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(spProduct14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct14)))
                .addGap(10, 10, 10))
        );

        jPanel37.setBackground(new java.awt.Color(111, 138, 145));
        jPanel37.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct13.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct13.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct13.setText("Sweet Potato");

        jLabel33.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("P 130");

        btProduct13.setBackground(new java.awt.Color(87, 104, 111));
        btProduct13.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct13.setText("Add");
        btProduct13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct13ActionPerformed(evt);
            }
        });

        spProduct13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct13.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct13, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct13))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(lbProduct13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33))
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(spProduct13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct13)))
                .addGap(10, 10, 10))
        );

        jPanel38.setBackground(new java.awt.Color(111, 138, 145));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Salted eggs (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel39.setBackground(new java.awt.Color(111, 138, 145));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/smoked cheese (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel40.setBackground(new java.awt.Color(111, 138, 145));
        jPanel40.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct16.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct16.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct16.setText("Smoked Chips");

        jLabel46.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("P 430");
        jLabel46.setToolTipText("");

        btProduct16.setBackground(new java.awt.Color(87, 104, 111));
        btProduct16.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct16.setText("Add");
        btProduct16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct16ActionPerformed(evt);
            }
        });

        spProduct16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct16.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct16, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct16))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel40Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(lbProduct16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46))
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(spProduct16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct16)))
                .addGap(10, 10, 10))
        );

        jPanel41.setBackground(new java.awt.Color(111, 138, 145));
        jPanel41.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct17.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct17.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct17.setText("SE Crunchy Roll");

        jLabel39.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("P 430");

        btProduct17.setBackground(new java.awt.Color(87, 104, 111));
        btProduct17.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct17.setText("Add");
        btProduct17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct17ActionPerformed(evt);
            }
        });

        spProduct17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct17.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct17, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct17))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel41Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(lbProduct17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39))
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(spProduct17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct17)))
                .addGap(10, 10, 10))
        );

        jLabel39.getAccessibleContext().setAccessibleName("P 435");

        jPanel42.setBackground(new java.awt.Color(111, 138, 145));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/crunchy roll.png"))); // NOI18N

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel43.setBackground(new java.awt.Color(111, 138, 145));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sour cream and onion (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel47.setBackground(new java.awt.Color(111, 138, 145));
        jPanel47.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct10.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct10.setText("Matchstick vegtbl");

        jLabel37.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("P 100");

        btProduct10.setBackground(new java.awt.Color(87, 104, 111));
        btProduct10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct10.setText("Add");
        btProduct10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct10ActionPerformed(evt);
            }
        });

        spProduct10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel47Layout = new javax.swing.GroupLayout(jPanel47);
        jPanel47.setLayout(jPanel47Layout);
        jPanel47Layout.setHorizontalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel47Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct10))
                .addGap(0, 0, 0)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spProduct10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProduct10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel47Layout.setVerticalGroup(
            jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel47Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduct10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spProduct10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btProduct10)
                    .addComponent(jLabel37))
                .addGap(11, 11, 11))
        );

        jPanel48.setBackground(new java.awt.Color(111, 138, 145));
        jPanel48.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct15.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct15.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct15.setText("SE Potato Chips");

        jLabel43.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("P 630");

        btProduct15.setBackground(new java.awt.Color(87, 104, 111));
        btProduct15.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct15.setText("Add");
        btProduct15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct15ActionPerformed(evt);
            }
        });

        spProduct15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct15.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spProduct15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProduct15))
                .addContainerGap())
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel48Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduct15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spProduct15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btProduct15)
                    .addComponent(jLabel43))
                .addGap(11, 11, 11))
        );

        jPanel49.setBackground(new java.awt.Color(111, 138, 145));
        jPanel49.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct18.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct18.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct18.setText("Sour crm & Onion");

        jLabel40.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("P 430");

        spProduct18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct18.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btProduct18.setBackground(new java.awt.Color(87, 104, 111));
        btProduct18.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct18.setText("Add");
        btProduct18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel49Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbProduct18)))
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel49Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(spProduct18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btProduct18))
                .addGap(57, 57, 57))
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel49Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduct18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spProduct18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(btProduct18))
                .addGap(12, 12, 12))
        );

        jPanel31.setBackground(new java.awt.Color(111, 138, 145));
        jPanel31.setForeground(new java.awt.Color(255, 255, 255));

        lbProduct11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lbProduct11.setForeground(new java.awt.Color(255, 255, 255));
        lbProduct11.setText("BBQ Plantain");

        jLabel45.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("P 110");

        btProduct11.setBackground(new java.awt.Color(87, 104, 111));
        btProduct11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        btProduct11.setText("Add");
        btProduct11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProduct11ActionPerformed(evt);
            }
        });

        spProduct11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spProduct11.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbProduct11, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btProduct11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(spProduct11))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(lbProduct11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(spProduct11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btProduct11)))
                .addGap(10, 10, 10))
        );

        jPanel27.setBackground(new java.awt.Color(111, 138, 145));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BBQ  (Custom).png"))); // NOI18N

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(35, 35, 35))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel38, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel48, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Chips 2", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 100, 850, 940));

        jPanel6.setBackground(new java.awt.Color(0, 120, 175));

        tbOrders.setBackground(new java.awt.Color(111, 138, 145));
        tbOrders.setForeground(new java.awt.Color(255, 255, 255));
        tbOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Price", "Quantity", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbOrders);
        if (tbOrders.getColumnModel().getColumnCount() > 0) {
            tbOrders.getColumnModel().getColumn(1).setResizable(false);
            tbOrders.getColumnModel().getColumn(2).setResizable(false);
            tbOrders.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Amount:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Change:");

        lbTotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lbChange.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbChange.setForeground(new java.awt.Color(255, 255, 255));
        lbChange.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbChange.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Total:");

        txAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txAmount.setForeground(new java.awt.Color(255, 255, 255));
        txAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        btTotal.setBackground(new java.awt.Color(87, 104, 111));
        btTotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btTotal.setForeground(new java.awt.Color(255, 255, 255));
        btTotal.setText("Total");
        btTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTotalActionPerformed(evt);
            }
        });

        btDelete.setBackground(new java.awt.Color(87, 104, 111));
        btDelete.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btDelete.setForeground(new java.awt.Color(255, 255, 255));
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        btCalculate.setBackground(new java.awt.Color(87, 104, 111));
        btCalculate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btCalculate.setForeground(new java.awt.Color(255, 255, 255));
        btCalculate.setText("Calculate");
        btCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalculateActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(tpChipsReceipt);

        btClear.setBackground(new java.awt.Color(87, 104, 111));
        btClear.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btClear.setForeground(new java.awt.Color(255, 255, 255));
        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });

        btReceipt.setBackground(new java.awt.Color(87, 104, 111));
        btReceipt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        btReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btReceipt.setText("Receipt");
        btReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReceiptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbChange, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btCalculate, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(btTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbChange, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(btTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 130, 510, 910));

        lbName.setBackground(new java.awt.Color(255, 255, 255));
        lbName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 1045, 510, 20));

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

    private void btMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMainActionPerformed
        // Main button to Main frame
        Main main = new Main();
        main.setVisible(true);
    }//GEN-LAST:event_btMainActionPerformed

    private void btTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTotalActionPerformed
        // Total Button
        
        int total = 0;
        
        // Get the table model of the orders table
        TableModel tbmodel = tbOrders.getModel();

        if (tbmodel.getRowCount() == 0) {
            // If the table is empty, show an error message
            JOptionPane.showMessageDialog(null, "Table is empty.", "   Error", JOptionPane.ERROR_MESSAGE); 
        } else {
            // Iterate over each row in the table and sum the values in the fourth column
            for (int i = 0; i < tbOrders.getRowCount(); i ++) {
                total = total + Integer.parseInt(tbOrders.getValueAt(i, 3).toString());
            }
        }
        
        // Set the total price value in the total label
        lbTotal.setText(Integer.toString(total));
    }//GEN-LAST:event_btTotalActionPerformed

    private void btCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalculateActionPerformed
        // Pay Button
        String pay = txAmount.getText();
        
        if (!pay.isEmpty()) {
            // If the payment amount is not empty, calculate the change
            int total = Integer.parseInt(lbTotal.getText());
            int amount = Integer.parseInt(txAmount.getText());
            
            // Check if the amount is less than total
            if (amount < total) {
                JOptionPane.showMessageDialog(this, "Payment is insufficient","   Error", JOptionPane.ERROR_MESSAGE);  
            } else {
                // Calculate change if amount is sufficient
                int change = total - amount;
                // Set the change value in the change label
                lbChange.setText(Integer.toString(change));
            }
        } else {
            // If the payment amount is empty, show an error message
            JOptionPane.showMessageDialog(this, "Enter amount.", "   Error", JOptionPane.ERROR_MESSAGE); 
        }
    }//GEN-LAST:event_btCalculateActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // Delete row button from Table
        DefaultTableModel tbl = (DefaultTableModel) tbOrders.getModel();
        
        if (tbOrders.getSelectedRowCount () == 1) {
            // If a single row is selected, remove it from the table
            tbl.removeRow(tbOrders.getSelectedRow());
        } else {
            if (tbOrders.getRowCount() == 0) {
                // If the table is empty, show an error message
                JOptionPane.showMessageDialog(this, "Table is Empty.", "   Error", JOptionPane.ERROR_MESSAGE);  
            } else {
                // If no row are selected, show an error message
                JOptionPane.showMessageDialog(this, "Select a row to delete.", "   Error", JOptionPane.ERROR_MESSAGE); 
            }
        }
    }//GEN-LAST:event_btDeleteActionPerformed
    
    // Show receipt button
    private void btReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReceiptActionPerformed
        // Access the Main frame label(peek) value to attach in Chips frame text pane(receipt)
        String receipt = Main.lbMain.getText(); 
        
        lbName.setText(receipt);
        
        if (Main.lbMain.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Peek a Customer name in Main Window");  
            return;
        } if (tbOrders.getRowCount() == 0 ) {
            JOptionPane.showMessageDialog(this, "Enter customer orders"); 
            return;
        } if (lbTotal.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Total customer orders"); 
            return; 
        } if (txAmount.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter Amount");
            return;
        } if (lbChange.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Calculate customer change");   
        } else {
            receipt();
        }

    }//GEN-LAST:event_btReceiptActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // Clear Button
        DefaultTableModel tbl = (DefaultTableModel) tbOrders.getModel();
        tbl.setRowCount(0);

        // Reset the values of the spinner components
        spProduct1.setValue(0);
        spProduct2.setValue(0);
        spProduct3.setValue(0);
        spProduct4.setValue(0);
        spProduct5.setValue(0);
        spProduct6.setValue(0);
        spProduct7.setValue(0);
        spProduct8.setValue(0);
        spProduct9.setValue(0);
        spProduct10.setValue(0);
        spProduct11.setValue(0);
        spProduct12.setValue(0);
        spProduct13.setValue(0);
        spProduct14.setValue(0);
        spProduct15.setValue(0);
        spProduct16.setValue(0);
        spProduct17.setValue(0);
        spProduct18.setValue(0);
        
        // Clear the text in components
        tpChipsReceipt.setText("");
        lbTotal.setText("");
        txAmount.setText("");
        lbChange.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void btProduct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct1ActionPerformed
        // Product1 Add Button
        int price1 = 100;
        
        // Get the Product name, quantity, and calculate the total price
        String p1 = lbProduct1.getText();
        int qty  = Integer.parseInt(spProduct1.getValue().toString());
        int tot = qty * price1;
        
        // Get the table model of the orders table
        model = (DefaultTableModel)tbOrders.getModel();
        
        // Add a new row to the table with the product details
        model.addRow(new Object[] {
            p1, price1, qty, tot,
        });
    }//GEN-LAST:event_btProduct1ActionPerformed

    private void btProduct2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct2ActionPerformed
        // Product2 Add Button
        int price2 = 110;

        String p2 = lbProduct2.getText();
        int qty  = Integer.parseInt(spProduct2.getValue().toString());
        int tot = qty * price2;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p2, price2, qty, tot,
        });
    }//GEN-LAST:event_btProduct2ActionPerformed

    private void btProduct3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct3ActionPerformed
        // Product3 Add Button
        int price3 = 120;

        String p3 = lbProduct3.getText();
        int qty  = Integer.parseInt(spProduct3.getValue().toString());
        int tot = qty * price3;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p3, price3, qty, tot,
        });
    }//GEN-LAST:event_btProduct3ActionPerformed

    private void btProduct6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct6ActionPerformed
        // Product6 Add Button
        int price6 = 150;

        String p6 = lbProduct6.getText();
        int qty  = Integer.parseInt(spProduct6.getValue().toString());
        int tot = qty * price6;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p6, price6, qty, tot,
        });
    }//GEN-LAST:event_btProduct6ActionPerformed

    private void btProduct5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct5ActionPerformed
        // Product5 Add Button
        int price5 = 140;

        String p5 = lbProduct5.getText();
        int qty  = Integer.parseInt(spProduct5.getValue().toString());
        int tot = qty * price5;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p5, price5, qty, tot,
        });
    }//GEN-LAST:event_btProduct5ActionPerformed

    private void btProduct4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct4ActionPerformed
        // Product4 Add Button
        int price4 = 130;

        String p4 = lbProduct4.getText();
        int qty  = Integer.parseInt(spProduct4.getValue().toString());
        int tot = qty * price4;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p4, price4, qty, tot,
        });
    }//GEN-LAST:event_btProduct4ActionPerformed

    private void btProduct7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct7ActionPerformed
        // Product7 Add Button
        int price7 = 160;

        String p7 = lbProduct7.getText();
        int qty  = Integer.parseInt(spProduct7.getValue().toString());
        int tot = qty * price7;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p7, price7, qty, tot,
        });
    }//GEN-LAST:event_btProduct7ActionPerformed

    private void btProduct8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct8ActionPerformed
        // Product8 Add Button
        int price8 = 170;

        String p8 = lbProduct8.getText();
        int qty  = Integer.parseInt(spProduct8.getValue().toString());
        int tot = qty * price8;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p8, price8, qty, tot,
        });
    }//GEN-LAST:event_btProduct8ActionPerformed

    private void btProduct9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct9ActionPerformed
        // Product9 Add Button
        int price9 = 400;

        String p9 = lbProduct9.getText();
        int qty  = Integer.parseInt(spProduct9.getValue().toString());
        int tot = qty * price9;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p9, price9, qty, tot,
        });
    }//GEN-LAST:event_btProduct9ActionPerformed

    private void btProduct10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct10ActionPerformed
        // Product10 Add Button
        int price10 = 100;

        String p10 = lbProduct10.getText();
        int qty  = Integer.parseInt(spProduct10.getValue().toString());
        int tot = qty * price10;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p10, price10, qty, tot,
        });
    }//GEN-LAST:event_btProduct10ActionPerformed

    private void btProduct11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct11ActionPerformed
        // Product11 Add Button
        int price11 = 110;

        String p11 = lbProduct11.getText();
        int qty  = Integer.parseInt(spProduct11.getValue().toString());
        int tot = qty * price11;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p11, price11, qty, tot,
        });
    }//GEN-LAST:event_btProduct11ActionPerformed

    private void btProduct12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct12ActionPerformed
        // Product12 Add Button
        int price12 = 120;

        String p12 = lbProduct12.getText();
        int qty  = Integer.parseInt(spProduct12.getValue().toString());
        int tot = qty * price12;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p12, price12, qty, tot,
        });
    }//GEN-LAST:event_btProduct12ActionPerformed

    private void btProduct13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct13ActionPerformed
        // Product13 Add Button
        int price13 = 130;

        String p13 = lbProduct13.getText();
        int qty  = Integer.parseInt(spProduct13.getValue().toString());
        int tot = qty * price13;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p13, price13, qty, tot,
        });
    }//GEN-LAST:event_btProduct13ActionPerformed

    private void btProduct14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct14ActionPerformed
        // Product14 Add Button
        int price14 = 140;

        String p14 = lbProduct14.getText();
        int qty  = Integer.parseInt(spProduct14.getValue().toString());
        int tot = qty * price14;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p14, price14, qty, tot,
        });
    }//GEN-LAST:event_btProduct14ActionPerformed

    private void btProduct15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct15ActionPerformed
        // Product15 Add Button
        int price15 = 630;

        String p15 = lbProduct15.getText();
        int qty  = Integer.parseInt(spProduct15.getValue().toString());
        int tot = qty * price15;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p15, price15, qty, tot,
        });
    }//GEN-LAST:event_btProduct15ActionPerformed

    private void btProduct16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct16ActionPerformed
        // Product16 Add Button
        int price16 = 430;

        String p16 = lbProduct16.getText();
        int qty  = Integer.parseInt(spProduct16.getValue().toString());
        int tot = qty * price16;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p16, price16, qty, tot,
        });
    }//GEN-LAST:event_btProduct16ActionPerformed

    private void btProduct17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct17ActionPerformed
        // Product17 Add Button
        int price17 = 430;

        String p17 = lbProduct17.getText();
        int qty  = Integer.parseInt(spProduct17.getValue().toString());
        int tot = qty * price17;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p17, price17, qty, tot,
        });
    }//GEN-LAST:event_btProduct17ActionPerformed

    private void btProduct18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProduct18ActionPerformed
        // Product18 Add Button
        int price18 = 430;

        String p18 = lbProduct18.getText();
        int qty  = Integer.parseInt(spProduct18.getValue().toString());
        int tot = qty * price18;

        model = (DefaultTableModel)tbOrders.getModel();

        model.addRow(new Object[] {
            p18, price18, qty, tot,
        });
    }//GEN-LAST:event_btProduct18ActionPerformed

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
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chips.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chips().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Chips;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Maximize;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel OrderCrunch;
    private javax.swing.JToggleButton btCalculate;
    private javax.swing.JToggleButton btClear;
    private javax.swing.JToggleButton btDelete;
    private javax.swing.JButton btMain;
    private javax.swing.JButton btProduct1;
    private javax.swing.JButton btProduct10;
    private javax.swing.JButton btProduct11;
    private javax.swing.JButton btProduct12;
    private javax.swing.JButton btProduct13;
    private javax.swing.JButton btProduct14;
    private javax.swing.JButton btProduct15;
    private javax.swing.JButton btProduct16;
    private javax.swing.JButton btProduct17;
    private javax.swing.JButton btProduct18;
    private javax.swing.JButton btProduct2;
    private javax.swing.JButton btProduct3;
    private javax.swing.JButton btProduct4;
    private javax.swing.JButton btProduct5;
    private javax.swing.JButton btProduct6;
    private javax.swing.JButton btProduct7;
    private javax.swing.JButton btProduct8;
    private javax.swing.JButton btProduct9;
    private javax.swing.JToggleButton btReceipt;
    private javax.swing.JToggleButton btTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbChange;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPrice3;
    private javax.swing.JLabel lbProduct1;
    private javax.swing.JLabel lbProduct10;
    private javax.swing.JLabel lbProduct11;
    private javax.swing.JLabel lbProduct12;
    private javax.swing.JLabel lbProduct13;
    private javax.swing.JLabel lbProduct14;
    private javax.swing.JLabel lbProduct15;
    private javax.swing.JLabel lbProduct16;
    private javax.swing.JLabel lbProduct17;
    private javax.swing.JLabel lbProduct18;
    private javax.swing.JLabel lbProduct2;
    private javax.swing.JLabel lbProduct3;
    private javax.swing.JLabel lbProduct4;
    private javax.swing.JLabel lbProduct5;
    private javax.swing.JLabel lbProduct6;
    private javax.swing.JLabel lbProduct7;
    private javax.swing.JLabel lbProduct8;
    private javax.swing.JLabel lbProduct9;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel panel;
    private javax.swing.JSpinner spProduct1;
    private javax.swing.JSpinner spProduct10;
    private javax.swing.JSpinner spProduct11;
    private javax.swing.JSpinner spProduct12;
    private javax.swing.JSpinner spProduct13;
    private javax.swing.JSpinner spProduct14;
    private javax.swing.JSpinner spProduct15;
    private javax.swing.JSpinner spProduct16;
    private javax.swing.JSpinner spProduct17;
    private javax.swing.JSpinner spProduct18;
    private javax.swing.JSpinner spProduct2;
    private javax.swing.JSpinner spProduct3;
    private javax.swing.JSpinner spProduct4;
    private javax.swing.JSpinner spProduct5;
    private javax.swing.JSpinner spProduct6;
    private javax.swing.JSpinner spProduct7;
    private javax.swing.JSpinner spProduct8;
    private javax.swing.JSpinner spProduct9;
    private javax.swing.JTable tbOrders;
    private javax.swing.JTextPane tpChipsReceipt;
    private javax.swing.JTextField txAmount;
    // End of variables declaration//GEN-END:variables
}
