/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author kobinath
 */
public class pos extends javax.swing.JFrame {

    /**
     * Creates new form category
     */
   
    
    String lname;
    public pos() {
        
        initComponents();
        
        
       //load();

    }
     public pos(String name) {
        
        initComponents();
       //load();
       this.lname = name;
       txtname.setText(lname);

    }
    
    
    
    
    
  Connection con1;
  PreparedStatement insert;
  ResultSet rs1;
 DefaultTableModel model = new DefaultTableModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        rSLabelImage3 = new rojerusan.RSLabelImage();
        rSLabelImage4 = new rojerusan.RSLabelImage();
        rSLabelImage5 = new rojerusan.RSLabelImage();
        rSLabelImage6 = new rojerusan.RSLabelImage();
        rSLabelImage7 = new rojerusan.RSLabelImage();
        rSLabelImage8 = new rojerusan.RSLabelImage();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        procode = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtproduct = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtqty = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtsub = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbal = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Exit");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 60, -1));

        jLabel21.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Logout");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 100, -1));

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel1.setText("Super Market");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/abstract (3).png"))); // NOI18N
        jPanel4.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Product");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, -1));

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pos");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cashier");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, -1, -1));

        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/exit.png"))); // NOI18N
        rSLabelImage2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage2MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 20, 30));

        rSLabelImage3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/list.png"))); // NOI18N
        rSLabelImage3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage3MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 20, 30));

        rSLabelImage4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/brand.png"))); // NOI18N
        rSLabelImage4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage4MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 20, 30));

        rSLabelImage5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/order.png"))); // NOI18N
        rSLabelImage5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage5MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 20, 30));

        rSLabelImage6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/pos-terminal.png"))); // NOI18N
        rSLabelImage6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage6MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 20, 20));

        rSLabelImage7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/money.png"))); // NOI18N
        rSLabelImage7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage7MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 20, 20));

        rSLabelImage8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/logout.png"))); // NOI18N
        rSLabelImage8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSLabelImage8MouseClicked(evt);
            }
        });
        jPanel4.add(rSLabelImage8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 20, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 500));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel14.setText("POS ");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Product Code");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 54, -1, -1));

        procode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                procodeActionPerformed(evt);
            }
        });
        procode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                procodeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                procodeKeyTyped(evt);
            }
        });
        jPanel3.add(procode, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 51, 124, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 90, 50));

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product code", "Product Name", "Price", "Qty", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 172, 666, 250));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Product Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 54, -1, -1));
        jPanel3.add(txtproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 51, 122, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Price");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 54, -1, -1));
        jPanel3.add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 51, 123, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Qty");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 54, -1, -1));
        jPanel3.add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 51, 45, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(732, 35, 99, 53));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Sub Total");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));
        jPanel3.add(txtsub, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 116, -1));
        jPanel3.add(txtpay, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 156, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Pay");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Balance");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, -1, -1));

        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });
        jPanel3.add(txtbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 140, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Pay Invoice");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, 49));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Add Products");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, -1, -1));

        txtname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtname.setForeground(new java.awt.Color(0, 51, 255));
        jPanel3.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 130, 30));

        jLabel16.setText("Logged as:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 850, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 970, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    

    
    
    
    
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   

    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        model.removeRow(jTable1.getSelectedRow());
        int sum = 0;
        for(int i = 0; i < jTable1.getRowCount(); i++)
        {
            sum = sum + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
        }   
        txtsub.setText(Integer.toString(sum));  

    }//GEN-LAST:event_jButton2ActionPerformed

    private void procodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procodeKeyTyped
        // TODO add your handling code here:       
    }//GEN-LAST:event_procodeKeyTyped

    public void pos()
    {
        String procod =procode.getText();     
            try {
                Class.forName("com.mysql.jdbc.Driver");       
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
                insert = con1.prepareStatement("SELECT * FROM product where barcode = ? ");
                insert.setString(1,procod);
                ResultSet Rs = insert.executeQuery();               
                while(Rs.next())
                   { 
                    int qty;
                    qty = Rs.getInt("qty");  
                    int price =  Integer.parseInt(txtprice.getText());
                    int qty1 =  Integer.parseInt(txtqty.getText());      
                    int tot = price * qty1;                   
                   if(qty1 >= qty)
                    {
                       JOptionPane.showMessageDialog(null,"Available Product" + " = " + qty);
                       JOptionPane.showMessageDialog(null, "Qty is not Enough");
                    }      
                    else
                   {  
                     model = (DefaultTableModel) jTable1.getModel();      
                     DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                     centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                     jTable1.setDefaultRenderer(String.class, centerRenderer);
                      model.addRow(new Object[]
                   {         
                      procode.getText(),
                      txtproduct.getText(),
                      txtprice.getText(),
                      txtqty.getText(),
                      tot,
                  });       
                    int sum = 0;
                    for(int i = 0; i < jTable1.getRowCount(); i++)
                    {
                        sum = sum + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                    }   
                    txtsub.setText(Integer.toString(sum)); 
                    txtsub.setText(Integer.toString(sum)); 
                 procode.setText("");
                txtproduct.setText("");
                txtprice.setText("");
                txtqty.setText("");                  
            }
    }
     } catch (ClassNotFoundException ex) {
                Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void pos1()
    {
        
      
            if(txtproduct.getText().isEmpty() && txtprice.getText().isEmpty() && txtqty.getText().isEmpty())           
        {       
             JOptionPane.showMessageDialog(this, "Fill all Fields");         
        }              
        else
        {           
      
                
                int price =  Integer.parseInt(txtprice.getText());
                int qty1 =  Integer.parseInt(txtqty.getText());
                 int tot = price * qty1;  
                 model = (DefaultTableModel) jTable1.getModel();      
                 DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
                 centerRenderer.setHorizontalAlignment( JLabel.CENTER );
                 jTable1.setDefaultRenderer(String.class, centerRenderer);
                  model.addRow(new Object[]
                {         
                  procode.getText(),
                  txtproduct.getText(),
                  txtprice.getText(),
                  txtqty.getText(),
                  tot,
                });                     
                int sum = 0;
                for(int i = 0; i < jTable1.getRowCount(); i++)
                {
                    sum = sum + Integer.parseInt(jTable1.getValueAt(i, 4).toString());
                }   
                txtsub.setText(Integer.toString(sum)); 
                 procode.setText("");
                txtproduct.setText("");
                txtprice.setText("");
                txtqty.setText("");             
        
        
      }
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void procodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_procodeKeyPressed
        // TODO add your handling code here:
        
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
      
            try {
                
                System.out.println("hi");
                String procod =procode.getText();
                
                
                Class.forName("com.mysql.jdbc.Driver");
                con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
                insert = con1.prepareStatement("select * from product where barcode = ? ");
                insert.setString(1,procod);
                rs1 = insert.executeQuery();
                
              
                
                if(rs1.next()==false)
                {
                    
                    
                    JOptionPane.showMessageDialog(null, "Barcode not Found");
                }
                else
                {
                    String productname = rs1.getString("productname");
                    String price = rs1.getString("retailprice");
                    
                    txtproduct.setText(productname.trim());
                    txtprice.setText(price);
                }
                
                
                
                
                
                
                
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(brand.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(brand.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_procodeKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            pos();

           
    }//GEN-LAST:event_jButton3ActionPerformed

    


     public void makeConnection() 
 {
     
    try{ 
     
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
     LocalDateTime now = LocalDateTime.now();  
     String date = dtf.format(now);
     
     String subtot =  txtsub.getText();
     String name =  txtname.getText();
     String pay =  txtpay.getText();
     String bal =  txtbal.getText();
    
    
     String product_id = "";
     String price = "";
     String qty1 = "";
     int total = 0;
     int lastinsertid=0;
        
     Class.forName("com.mysql.jdbc.Driver");   
     con1=DriverManager.getConnection("jdbc:mysql://localhost/javapos","root",""); 
    
    String query1 = "insert into sales (date,subtotal,cashier,pay,balance)values(?,?,?,?,?)";
    insert = con1.prepareStatement(query1,Statement.RETURN_GENERATED_KEYS);
  
   insert.setString(1, date);    
   insert.setString (2, subtot);
    insert.setString (3, name);
   insert.setString(4, pay);   
   insert.setString (5, bal); 
   insert.executeUpdate(); 
   ResultSet generatedKeyResult = insert.getGeneratedKeys();

       if (generatedKeyResult.next()) 
       {
          lastinsertid = generatedKeyResult.getInt(1);
      }    
    System.out.println("Inserted record's ID: " + lastinsertid);   
  
  
  int rows=jTable1.getRowCount();
  String queryco1 = "Insert into sales_product(sales_id,product_id,sell_price,qty,total)values(?,?,?,?,?)";    
  PreparedStatement preparedStmt1 = con1.prepareStatement(queryco1);

  for (int i = 0; i < jTable1.getRowCount(); i++)      
  {        
    product_id = (String)jTable1.getValueAt(i, 0);
    price = (String)jTable1.getValueAt(i, 2);  
    qty1 = (String)jTable1.getValueAt(i, 3); 
    total = (Integer)jTable1.getValueAt(i, 4); 

    preparedStmt1.setInt(1, lastinsertid);
    preparedStmt1.setString(2, product_id);
    preparedStmt1.setString(3, price);
    preparedStmt1.setString(4, qty1);
    preparedStmt1.setInt(5, total);
    preparedStmt1.executeUpdate();      
      
  }
  
     String sqlupdate= "update product set qty= qty-? where barcode=? ";
     preparedStmt1=con1.prepareStatement(sqlupdate);
      
   for (int i = 0; i < jTable1.getRowCount(); i++)      
  {        
    product_id = (String)jTable1.getValueAt(i, 0);
    qty1 = (String)jTable1.getValueAt(i, 3); 
     
    preparedStmt1.setString(1, qty1);
    preparedStmt1.setString(2, product_id);    
    preparedStmt1.execute();
  
  }
   
  preparedStmt1.addBatch();
  JOptionPane.showMessageDialog(null, "Successfully Save");    
      
}
catch(ClassNotFoundException | SQLException | HeadlessException e){
  JOptionPane.showMessageDialog(this,e.getMessage());

}
     
 }

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        int pay = Integer.parseInt(txtpay.getText());
        int total = Integer.parseInt(txtsub.getText());
        
        int bal = pay - total;
        
        txtbal.setText(String.valueOf(bal));
        
         print();
       makeConnection();
         
         model.setRowCount(0);
         txtsub.setText("");
         txtpay.setText("");
        txtbal.setText("");
        procode.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void procodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_procodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_procodeActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        category b = new category();
        b.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        brand b = new brand();
        b.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        product p = new product();
        p.setVisible(true);
        this.hide();;
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        // TODO add your handling code here:
           pos p = new pos();
           p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        
         cashier p = new cashier();
          p.setVisible(true);
          this.hide();
        
        
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:

        System.exit(0);
    }//GEN-LAST:event_jLabel20MouseClicked
private JFrame frame1;
    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","MainMenu",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new login().setVisible(true);
        };
    }//GEN-LAST:event_jLabel21MouseClicked

    private void rSLabelImage3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage3MouseClicked
        // TODO add your handling code here:
        category b = new category();
        b.setVisible(true);
        this.hide();
    }//GEN-LAST:event_rSLabelImage3MouseClicked

    private void rSLabelImage4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage4MouseClicked
        // TODO add your handling code here:
        brand b = new brand();
        b.setVisible(true);
        this.hide();
    }//GEN-LAST:event_rSLabelImage4MouseClicked

    private void rSLabelImage5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage5MouseClicked
        // TODO add your handling code here:
        product p = new product();
        p.setVisible(true);
        this.hide();;
    }//GEN-LAST:event_rSLabelImage5MouseClicked

    private void rSLabelImage6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage6MouseClicked
        // TODO add your handling code here:
        pos p = new pos();
           p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_rSLabelImage6MouseClicked

    private void rSLabelImage7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage7MouseClicked
        // TODO add your handling code here:
        cashier p = new cashier();
          p.setVisible(true);
          this.hide();
    }//GEN-LAST:event_rSLabelImage7MouseClicked

    private void rSLabelImage8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage8MouseClicked
        // TODO add your handling code here:
        frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","MainMenu",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
        new login().setVisible(true);
        };
    }//GEN-LAST:event_rSLabelImage8MouseClicked

    private void rSLabelImage2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSLabelImage2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSLabelImage2MouseClicked

    
 public void print()
 {
     
         String sub = txtsub.getText();
         String pay1 = txtpay.getText();
         String bal1 = txtbal.getText();
        
        try {
            new print1(sub,pay1,bal1,jTable1.getModel()).setVisible(true);
            
            
            
            
        } catch (PrinterException ex) {
            Logger.getLogger(pos.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
 }
    
    
    
    
    


    
    
    
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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField procode;
    private rojerusan.RSLabelImage rSLabelImage1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private rojerusan.RSLabelImage rSLabelImage3;
    private rojerusan.RSLabelImage rSLabelImage4;
    private rojerusan.RSLabelImage rSLabelImage5;
    private rojerusan.RSLabelImage rSLabelImage6;
    private rojerusan.RSLabelImage rSLabelImage7;
    private rojerusan.RSLabelImage rSLabelImage8;
    private javax.swing.JTextField txtbal;
    private javax.swing.JLabel txtname;
    private javax.swing.JTextField txtpay;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproduct;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtsub;
    // End of variables declaration//GEN-END:variables

    private void publish(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}