
package com.mycompany.loginandregister;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import java.text.DecimalFormat;

/**
 *
 * @author Damian kenny
 */
public class POSsystem extends javax.swing.JFrame {
    

    private void dashboard() {
        DashBoard dashBoard = new DashBoard(); 
        dashBoard.setVisible(true);
        dashBoard.setLocationRelativeTo(null);
        this.dispose();  
    }
    public POSsystem() {
        initComponents();
        
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
    }

    public void addTable(int ID, String Name, int QTY, Double Price){
        
        DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
        
        DecimalFormat dec = new DecimalFormat("00.00");
        double totalPrice = Price * Double.valueOf(QTY);
        String TotalPrice = dec.format(totalPrice);
        
        for(int row = 0; row < jTable1.getRowCount(); row++){
        
            if(Name == jTable1.getValueAt(row, 1)){
                dt.removeRow(jTable1.convertRowIndexToModel(row));
            }else{
                
            }
    }
        
        Vector v = new Vector();
        
        v.add(ID);
        v.add(Name);
        v.add(QTY);
        v.add(TotalPrice);
        
        dt.addRow(v);
    }
    
    public void Calculate(){
        int numberOfRows = jTable1.getRowCount();
        double total = 0.0;
        
        for(int i = 0; i < numberOfRows; i++){
            
            double value = Double.valueOf(jTable1.getValueAt(i, 3).toString());
            total += value;
        }
        
        DecimalFormat dec = new DecimalFormat("00.00");
        totalText.setText(dec.format(total));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        totalText = new javax.swing.JLabel();
        balanceText = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        payText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnOnion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        onionText = new javax.swing.JLabel();
        btnLeeks = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        leeksText = new javax.swing.JLabel();
        btnTomato = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        tomatoText = new javax.swing.JLabel();
        btnPork = new javax.swing.JButton();
        porkText = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        beefText = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnBeef = new javax.swing.JButton();
        btnChicken = new javax.swing.JButton();
        chickenText = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalmon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        salmonText = new javax.swing.JLabel();
        btnBanana = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        bananaText = new javax.swing.JLabel();
        btnCoffee1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        coffeeText = new javax.swing.JLabel();
        riceText = new javax.swing.JLabel();
        btnRice = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        lysolText = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnLysol = new javax.swing.JButton();
        btnMilk = new javax.swing.JButton();
        milkText = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnCelery = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        onionText1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cucumberText = new javax.swing.JLabel();
        btnLeeks1 = new javax.swing.JButton();
        btnRaddish = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        raddishText = new javax.swing.JLabel();
        celeryText = new javax.swing.JLabel();
        btnBeans = new javax.swing.JButton();
        btnCarrots = new javax.swing.JButton();
        btnBroccoli = new javax.swing.JButton();
        broccoliText = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        carrotsText = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        beansText = new javax.swing.JLabel();
        text2 = new javax.swing.JLabel();
        btnPineapple = new javax.swing.JButton();
        text3 = new javax.swing.JLabel();
        pineappleText = new javax.swing.JLabel();
        btnMango = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        mangoText = new javax.swing.JLabel();
        btnWatermelon = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        watermelonText = new javax.swing.JLabel();
        btnApple = new javax.swing.JButton();
        text4 = new javax.swing.JLabel();
        appleText = new javax.swing.JLabel();
        btnOrange = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        orangeText = new javax.swing.JLabel();
        btnGrapes = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        grapesText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1300, 750));
        setSize(new java.awt.Dimension(1000, 700));

        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(153, 102, 0));

        jTable1.setBackground(new java.awt.Color(255, 223, 164));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ID", "Item Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        receipt.setColumns(20);
        receipt.setRows(5);
        jScrollPane2.setViewportView(receipt);

        jPanel4.setBackground(new java.awt.Color(255, 223, 164));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setText("Total :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel15.setText("Amount Paid :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Balance :");

        totalText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        totalText.setText("0.00");

        balanceText.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        balanceText.setText("0.00");

        btnPay.setBackground(new java.awt.Color(0, 153, 0));
        btnPay.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnPay.setText("PAY");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrint.setText("Print Receipt ");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        payText.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jLabel16.setText("Back to Dashboard");

        jButton1.setText("DashBoard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(jLabel13))
                            .addGap(124, 124, 124)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(balanceText)
                                .addComponent(payText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(totalText)
                            .addGap(2, 2, 2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addGap(92, 92, 92)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPrint)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(payText, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(balanceText))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jButton1)))
                    .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnDelete.setBackground(new java.awt.Color(255, 223, 164));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 223, 164));
        jTabbedPane1.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(255, 223, 164));
        jPanel1.setForeground(new java.awt.Color(255, 223, 164));

        btnOnion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onion.jpg"))); // NOI18N
        btnOnion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOnionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Red Onions 1kg");

        onionText.setForeground(new java.awt.Color(255, 223, 164));
        onionText.setText("0");

        btnLeeks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leeks.jpg"))); // NOI18N
        btnLeeks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLeeks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeeksActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Leeks 500g");

        leeksText.setForeground(new java.awt.Color(255, 223, 164));
        leeksText.setText("0");

        btnTomato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tomato-je.jpg"))); // NOI18N
        btnTomato.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnTomato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTomatoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tomato 500g");

        tomatoText.setForeground(new java.awt.Color(255, 223, 164));
        tomatoText.setText("0");

        btnPork.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pork-sh1419942758jpg.jpg"))); // NOI18N
        btnPork.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPorkActionPerformed(evt);
            }
        });

        porkText.setBackground(new java.awt.Color(255, 223, 164));
        porkText.setForeground(new java.awt.Color(255, 223, 164));
        porkText.setText("0");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Pork 1kg");

        beefText.setBackground(new java.awt.Color(255, 223, 164));
        beefText.setForeground(new java.awt.Color(255, 223, 164));
        beefText.setText("0");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Beef 1kg");

        btnBeef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beef-1.jpg"))); // NOI18N
        btnBeef.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBeef.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeefActionPerformed(evt);
            }
        });

        btnChicken.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chicken-breast2.jpg"))); // NOI18N
        btnChicken.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnChicken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChickenActionPerformed(evt);
            }
        });

        chickenText.setBackground(new java.awt.Color(255, 223, 164));
        chickenText.setForeground(new java.awt.Color(255, 223, 164));
        chickenText.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Chicken Breast");

        btnSalmon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/24328-sil-gtkfish-atlanticsalmon.jpg"))); // NOI18N
        btnSalmon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalmonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Salmon 500g");

        salmonText.setBackground(new java.awt.Color(255, 223, 164));
        salmonText.setForeground(new java.awt.Color(255, 223, 164));
        salmonText.setText("0");

        btnBanana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banana.jpg"))); // NOI18N
        btnBanana.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBanana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBananaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Banana 250g");

        bananaText.setBackground(new java.awt.Color(255, 223, 164));
        bananaText.setForeground(new java.awt.Color(255, 223, 164));
        bananaText.setText("0");

        btnCoffee1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/coffee.jpg"))); // NOI18N
        btnCoffee1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCoffee1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoffee1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Nescafe Coffee");

        coffeeText.setBackground(new java.awt.Color(255, 223, 164));
        coffeeText.setForeground(new java.awt.Color(255, 223, 164));
        coffeeText.setText("0");

        riceText.setBackground(new java.awt.Color(255, 223, 164));
        riceText.setForeground(new java.awt.Color(255, 223, 164));
        riceText.setText("0");

        btnRice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rice-kilo.jpg"))); // NOI18N
        btnRice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRiceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Rice 1kg");

        lysolText.setBackground(new java.awt.Color(255, 223, 164));
        lysolText.setForeground(new java.awt.Color(255, 223, 164));
        lysolText.setText("0");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Lysol");

        btnLysol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lysol.jpg"))); // NOI18N
        btnLysol.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLysol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLysolActionPerformed(evt);
            }
        });

        btnMilk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kotmale-milk.jpg"))); // NOI18N
        btnMilk.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMilk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMilkActionPerformed(evt);
            }
        });

        milkText.setBackground(new java.awt.Color(255, 223, 164));
        milkText.setForeground(new java.awt.Color(255, 223, 164));
        milkText.setText("0");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Kotmale Milk");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(onionText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnOnion))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)
                                .addComponent(leeksText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLeeks)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(32, 32, 32)
                                .addComponent(tomatoText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnTomato, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalmon, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(salmonText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBanana, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bananaText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coffeeText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCoffee1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMilk, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(milkText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLysol, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lysolText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(riceText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnRice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnChicken)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(20, 20, 20)
                                .addComponent(chickenText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(52, 52, 52)
                                .addComponent(beefText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBeef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(38, 38, 38)
                                .addComponent(porkText, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPork, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(171, 171, 171))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOnion)
                    .addComponent(btnLeeks)
                    .addComponent(btnTomato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(onionText))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(leeksText))
                    .addComponent(tomatoText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBeef)
                    .addComponent(btnChicken)
                    .addComponent(btnPork, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)
                        .addComponent(chickenText))
                    .addComponent(jLabel8)
                    .addComponent(porkText)
                    .addComponent(beefText))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBanana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCoffee1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalmon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(salmonText)
                    .addComponent(coffeeText)
                    .addComponent(bananaText))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMilk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLysol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(milkText))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(lysolText)
                        .addComponent(riceText)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel1);

        jPanel5.setBackground(new java.awt.Color(255, 223, 164));

        btnCelery.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Celery-stalks-and-leaves-7860193 (1).jpg"))); // NOI18N
        btnCelery.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCelery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeleryActionPerformed(evt);
            }
        });

        text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text1.setText("Celery 100g");

        onionText1.setForeground(new java.awt.Color(255, 223, 164));
        onionText1.setText("0");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Cucumber 150g");

        cucumberText.setForeground(new java.awt.Color(255, 223, 164));
        cucumberText.setText("0");

        btnLeeks1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cucumber (1).jpg"))); // NOI18N
        btnLeeks1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLeeks1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeeks1ActionPerformed(evt);
            }
        });

        btnRaddish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/raddish.jpg"))); // NOI18N
        btnRaddish.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRaddish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaddishActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Raddish 250g");

        raddishText.setForeground(new java.awt.Color(255, 223, 164));
        raddishText.setText("0");

        celeryText.setForeground(new java.awt.Color(255, 223, 164));
        celeryText.setText("0");

        btnBeans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/beans.jpg"))); // NOI18N
        btnBeans.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBeans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeansActionPerformed(evt);
            }
        });

        btnCarrots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrots.jpg"))); // NOI18N
        btnCarrots.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCarrots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarrotsActionPerformed(evt);
            }
        });

        btnBroccoli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Broccoli.jpg"))); // NOI18N
        btnBroccoli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBroccoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBroccoliActionPerformed(evt);
            }
        });

        broccoliText.setForeground(new java.awt.Color(255, 223, 164));
        broccoliText.setText("0");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Broccoli 100g");

        carrotsText.setForeground(new java.awt.Color(255, 223, 164));
        carrotsText.setText("0");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel20.setText("Carrots 150g");

        beansText.setForeground(new java.awt.Color(255, 223, 164));
        beansText.setText("0");

        text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text2.setText("Beans 150g");

        btnPineapple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pineapple.jpg"))); // NOI18N
        btnPineapple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPineapple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPineappleActionPerformed(evt);
            }
        });

        text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text3.setText("Pineapple");

        pineappleText.setForeground(new java.awt.Color(255, 223, 164));
        pineappleText.setText("0");

        btnMango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mango.jpg"))); // NOI18N
        btnMango.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMangoActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Mango 100g");

        mangoText.setForeground(new java.awt.Color(255, 223, 164));
        mangoText.setText("0");

        btnWatermelon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/watermelon.jpg"))); // NOI18N
        btnWatermelon.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnWatermelon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWatermelonActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Watermelon");

        watermelonText.setForeground(new java.awt.Color(255, 223, 164));
        watermelonText.setText("0");

        btnApple.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apple.jpg"))); // NOI18N
        btnApple.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppleActionPerformed(evt);
            }
        });

        text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        text4.setText("Apples 300g");

        appleText.setForeground(new java.awt.Color(255, 223, 164));
        appleText.setText("0");

        btnOrange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/orange.jpg"))); // NOI18N
        btnOrange.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnOrange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrangeActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("Orange 300g");

        orangeText.setForeground(new java.awt.Color(255, 223, 164));
        orangeText.setText("0");

        btnGrapes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/grapes.jpg"))); // NOI18N
        btnGrapes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGrapes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrapesActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Grapes 100g");

        grapesText.setForeground(new java.awt.Color(255, 223, 164));
        grapesText.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(text1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(onionText1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(celeryText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCelery, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cucumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnLeeks1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(raddishText, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnRaddish, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(text2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(beansText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBeans, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(27, 27, 27)
                                .addComponent(carrotsText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnCarrots, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(broccoliText, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addComponent(btnBroccoli, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(text3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pineappleText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnPineapple, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(27, 27, 27)
                                .addComponent(mangoText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMango, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(watermelonText, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnWatermelon, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(text4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(appleText, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnApple, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(27, 27, 27)
                                .addComponent(orangeText, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnOrange, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(grapesText, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGrapes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLeeks1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRaddish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCelery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text1)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(onionText1)
                        .addComponent(celeryText))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel18)
                        .addComponent(cucumberText))
                    .addComponent(raddishText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCarrots, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBeans, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBroccoli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(broccoliText))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel20)
                        .addComponent(carrotsText))
                    .addComponent(beansText)
                    .addComponent(text2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnMango, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPineapple, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnWatermelon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(watermelonText))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(mangoText)
                        .addComponent(pineappleText))
                    .addComponent(text3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnOrange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnApple, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnGrapes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(grapesText))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel23)
                        .addComponent(orangeText)
                        .addComponent(appleText))
                    .addComponent(text4))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jTabbedPane1)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Vegetables");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        
        DefaultTableModel dt = (DefaultTableModel)jTable1.getModel();
        
        //remove products from table
        int rw= jTable1.getSelectedRow();
        dt.removeRow(rw);
        
        //remove quantity lable
        String r  = dt.getValueAt(jTable1.getSelectedRow(), 0).toString();
        
        switch(r){
            
            case "1" :
                onionText.setText("0");
                break;    
                
            case "2" :
                leeksText.setText("0");
                break;
                
            case "3" :
                tomatoText.setText("0");
                break;
                
            case "4" :
                chickenText.setText("0");
                break;  
                
            case "5" :
                beefText.setText("0");
                break;
                
            case "6" :
                porkText.setText("0");
                break;
                
            case "7" :
                salmonText.setText("0");
                break; 
                
            case "8" :
                bananaText.setText("0");
                break;
                
            case "9" :
                coffeeText.setText("0");
                break;
                
            case "10" :
                milkText.setText("0");
                break; 
                
            case "11" :
                lysolText.setText("0");
                break;
                
            case "12" :
                riceText.setText("0");
                break;
            case "13" :
                celeryText.setText("0");
                break;
                
            case "14" :
                cucumberText.setText("0");
                break;
                
            default:
                System.out.println("Over");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        
        double totalBill = Double.valueOf(totalText.getText());
        double paidAmount = Double.valueOf(payText.getText());
        double Balance = paidAmount - totalBill;
        
        DecimalFormat dec = new DecimalFormat("00.00");
        
        balanceText.setText(String.valueOf(dec.format(Balance)));
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
              
        try{
            receipt.setText("                              GreenWhich Grocery Store\n");
            receipt.setText(receipt.getText() + "                             12/1, Galle Road, Sri Lanka\n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------\n");
            receipt.setText(receipt.getText() + "  Item \t\tQty \tPrice" + "\n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------\n");
            
            DefaultTableModel def = (DefaultTableModel) jTable1.getModel();
            
            for(int i = 0; i < jTable1.getRowCount(); i++){
                
                String Name = def.getValueAt(i, 1).toString();
                String QTY = def.getValueAt(i, 2).toString();
                String Price = def.getValueAt(i, 3).toString();
                receipt.setText(receipt.getText() + "  " + Name + "\t\t" + QTY + "\t" + Price + "\n");
                
            }
            
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------\n");
            receipt.setText(receipt.getText() + "Sub Total   : " + totalText.getText() + "\n");
            receipt.setText(receipt.getText() + "Paid Amount : " + payText.getText() + "\n");
            receipt.setText(receipt.getText() + "Balance     : " + balanceText.getText() + "\n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------\n");
            receipt.setText(receipt.getText() + "                          Thank You for Shopping with us!" + "\n");
            receipt.setText(receipt.getText() + "----------------------------------------------------------------------------------\n");
            
            
            receipt.print();
            
        }catch(Exception e){
            
            System.out.println(e);
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnOnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOnionActionPerformed

        int i = Integer.valueOf(onionText.getText());
        ++i;
        onionText.setText(String.valueOf(i));
        addTable(1, "Onions 1kg", i, 600.00);

        Calculate();
    }//GEN-LAST:event_btnOnionActionPerformed

    private void btnLeeksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeeksActionPerformed

        int i = Integer.valueOf(leeksText.getText());
        ++i;
        leeksText.setText(String.valueOf(i));
        addTable(2, "Leeks 500g", i, 320.00);

        Calculate();
    }//GEN-LAST:event_btnLeeksActionPerformed

    private void btnTomatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTomatoActionPerformed

        int i = Integer.valueOf(tomatoText.getText());
        ++i;
        tomatoText.setText(String.valueOf(i));
        addTable(3, "Tomato 500g", i, 2500.00);

        Calculate();
    }//GEN-LAST:event_btnTomatoActionPerformed

    private void btnPorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPorkActionPerformed

        int i = Integer.valueOf(porkText.getText());
        ++i;
        porkText.setText(String.valueOf(i));
        addTable(6, "Pork 1kg", i, 2600.00);

        Calculate();
    }//GEN-LAST:event_btnPorkActionPerformed

    private void btnBeefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeefActionPerformed

        int i = Integer.valueOf(beefText.getText());
        ++i;
        beefText.setText(String.valueOf(i));
        addTable(5, "Beef 1kg", i, 3200.00);

        Calculate();
    }//GEN-LAST:event_btnBeefActionPerformed

    private void btnChickenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChickenActionPerformed

        int i = Integer.valueOf(chickenText.getText());
        ++i;
        chickenText.setText(String.valueOf(i));
        addTable(4, "Chicken 1kg", i, 1530.00);

        Calculate();
    }//GEN-LAST:event_btnChickenActionPerformed

    private void btnSalmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalmonActionPerformed

        int i = Integer.valueOf(salmonText.getText());
        ++i;
        salmonText.setText(String.valueOf(i));
        addTable(7, "Salmon 1kg", i, 1900.00);

        Calculate();
    }//GEN-LAST:event_btnSalmonActionPerformed

    private void btnBananaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBananaActionPerformed

        int i = Integer.valueOf(bananaText.getText());
        ++i;
        bananaText.setText(String.valueOf(i));
        addTable(8, "Banana 500g", i, 220.00);

        Calculate();
    }//GEN-LAST:event_btnBananaActionPerformed

    private void btnCoffee1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoffee1ActionPerformed

        int i = Integer.valueOf(coffeeText.getText());
        ++i;
        coffeeText.setText(String.valueOf(i));
        addTable(9, "Nescafe", i, 2000.00);

        Calculate();
    }//GEN-LAST:event_btnCoffee1ActionPerformed

    private void btnRiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRiceActionPerformed

        int i = Integer.valueOf(riceText.getText());
        ++i;
        riceText.setText(String.valueOf(i));
        addTable(12, "Rice 1kg", i, 630.00);

        Calculate();
    }//GEN-LAST:event_btnRiceActionPerformed

    private void btnLysolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLysolActionPerformed

        int i = Integer.valueOf(lysolText.getText());
        ++i;
        lysolText.setText(String.valueOf(i));
        addTable(11, "Lysol", i, 500.00);

        Calculate();
    }//GEN-LAST:event_btnLysolActionPerformed

    private void btnMilkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMilkActionPerformed

        int i = Integer.valueOf(milkText.getText());
        ++i;
        milkText.setText(String.valueOf(i));
        addTable(10, "Kotmale Milk", i, 570.00);

        Calculate();
    }//GEN-LAST:event_btnMilkActionPerformed

    private void btnCeleryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeleryActionPerformed
        
        int i = Integer.valueOf(celeryText.getText());
        ++i;
        celeryText.setText(String.valueOf(i));
        addTable(13, "Celery 100g", i, 150.00);

        Calculate();
    }//GEN-LAST:event_btnCeleryActionPerformed

    private void btnLeeks1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeeks1ActionPerformed
        
        int i = Integer.valueOf(cucumberText.getText());
        ++i;
        cucumberText.setText(String.valueOf(i));
        addTable(14, "Cucumber 150g", i, 340.00);

        Calculate();
    }//GEN-LAST:event_btnLeeks1ActionPerformed

    private void btnRaddishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaddishActionPerformed
       
        int i = Integer.valueOf(raddishText.getText());
        ++i;
        raddishText.setText(String.valueOf(i));
        addTable(15, "Raddish 250g", i, 240.00);

        Calculate();
    }//GEN-LAST:event_btnRaddishActionPerformed

    private void btnBeansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeansActionPerformed
        
        int i = Integer.valueOf(beansText.getText());
        ++i;
        beansText.setText(String.valueOf(i));
        addTable(16, "Beans 150g", i, 170.00);

        Calculate();
    }//GEN-LAST:event_btnBeansActionPerformed

    private void btnCarrotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarrotsActionPerformed
         
        int i = Integer.valueOf(carrotsText.getText());
        ++i;
        carrotsText.setText(String.valueOf(i));
        addTable(17, "Carrots 150g", i, 90.00);

        Calculate();
    }//GEN-LAST:event_btnCarrotsActionPerformed

    private void btnBroccoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBroccoliActionPerformed
        
        int i = Integer.valueOf(broccoliText.getText());
        ++i;
        broccoliText.setText(String.valueOf(i));
        addTable(18, "Brocoli 100g", i, 200.00);

        Calculate();
    }//GEN-LAST:event_btnBroccoliActionPerformed

    private void btnPineappleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPineappleActionPerformed
        
        int i = Integer.valueOf(pineappleText.getText());
        ++i;
        pineappleText.setText(String.valueOf(i));
        addTable(19, "Pineapple", i, 640.00);

        Calculate();
    }//GEN-LAST:event_btnPineappleActionPerformed

    private void btnMangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMangoActionPerformed
        
        int i = Integer.valueOf(mangoText.getText());
        ++i;
        mangoText.setText(String.valueOf(i));
        addTable(20, "Mango 100g", i, 56.00);

        Calculate();
    }//GEN-LAST:event_btnMangoActionPerformed

    private void btnWatermelonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWatermelonActionPerformed
        
        int i = Integer.valueOf(watermelonText.getText());
        ++i;
        watermelonText.setText(String.valueOf(i));
        addTable(21, "Watermelon", i, 264.00);

        Calculate();
    }//GEN-LAST:event_btnWatermelonActionPerformed

    private void btnAppleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppleActionPerformed
        
        int i = Integer.valueOf(appleText.getText());
        ++i;
        appleText.setText(String.valueOf(i));
        addTable(22, "Apples 300g", i, 528.00);

        Calculate();
    }//GEN-LAST:event_btnAppleActionPerformed

    private void btnOrangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrangeActionPerformed
        
        int i = Integer.valueOf(orangeText.getText());
        ++i;
        orangeText.setText(String.valueOf(i));
        addTable(23, "Orange 300g", i, 567.00);

        Calculate();
    }//GEN-LAST:event_btnOrangeActionPerformed

    private void btnGrapesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrapesActionPerformed
        
        int i = Integer.valueOf(grapesText.getText());
        ++i;
        grapesText.setText(String.valueOf(i));
        addTable(24, "Grapes 100g", i, 300.00);

        Calculate();
    }//GEN-LAST:event_btnGrapesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        dashboard();
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(POSsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(POSsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(POSsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(POSsystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new POSsystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appleText;
    private javax.swing.JLabel balanceText;
    private javax.swing.JLabel bananaText;
    private javax.swing.JLabel beansText;
    private javax.swing.JLabel beefText;
    private javax.swing.JLabel broccoliText;
    private javax.swing.JButton btnApple;
    private javax.swing.JButton btnBanana;
    private javax.swing.JButton btnBeans;
    private javax.swing.JButton btnBeef;
    private javax.swing.JButton btnBroccoli;
    private javax.swing.JButton btnCarrots;
    private javax.swing.JButton btnCelery;
    private javax.swing.JButton btnChicken;
    private javax.swing.JButton btnCoffee1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGrapes;
    private javax.swing.JButton btnLeeks;
    private javax.swing.JButton btnLeeks1;
    private javax.swing.JButton btnLysol;
    private javax.swing.JButton btnMango;
    private javax.swing.JButton btnMilk;
    private javax.swing.JButton btnOnion;
    private javax.swing.JButton btnOrange;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPineapple;
    private javax.swing.JButton btnPork;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRaddish;
    private javax.swing.JButton btnRice;
    private javax.swing.JButton btnSalmon;
    private javax.swing.JButton btnTomato;
    private javax.swing.JButton btnWatermelon;
    private javax.swing.JLabel carrotsText;
    private javax.swing.JLabel celeryText;
    private javax.swing.JLabel chickenText;
    private javax.swing.JLabel coffeeText;
    private javax.swing.JLabel cucumberText;
    private javax.swing.JLabel grapesText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel leeksText;
    private javax.swing.JLabel lysolText;
    private javax.swing.JLabel mangoText;
    private javax.swing.JLabel milkText;
    private javax.swing.JLabel onionText;
    private javax.swing.JLabel onionText1;
    private javax.swing.JLabel orangeText;
    private javax.swing.JTextField payText;
    private javax.swing.JLabel pineappleText;
    private javax.swing.JLabel porkText;
    private javax.swing.JLabel raddishText;
    private javax.swing.JTextArea receipt;
    private javax.swing.JLabel riceText;
    private javax.swing.JLabel salmonText;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    private javax.swing.JLabel text3;
    private javax.swing.JLabel text4;
    private javax.swing.JLabel tomatoText;
    private javax.swing.JLabel totalText;
    private javax.swing.JLabel watermelonText;
    // End of variables declaration//GEN-END:variables
}
