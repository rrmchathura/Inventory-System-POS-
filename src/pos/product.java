/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static jdk.nashorn.internal.runtime.Debug.id;


public class product extends javax.swing.JFrame {

    public product() {
        
        initComponents();
      
   table_update();
     
     LoadCategory();
     LoadBrand();
     jButton3.setEnabled(false);
      
    }

 
  public class CategoryItem 
{ 
int id; 
String name; 

public CategoryItem( int id, String name ) 
{ 
this.id = id; 
this.name = name; 
} 

public String toString() 
{ 
return name; 
} 
}
   public class BrandItem
{ 
int id; 
String name; 

public BrandItem( int id, String name ) 
{ 
this.id = id; 
this.name = name; 
} 

public String toString() 
{ 
return name; 
} 
} 
  
  
  
  
  
  
  
  
  
  
    
 
    
  Connection con1;
  PreparedStatement insert;
 DefaultTableModel model = new DefaultTableModel();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        rSButton1 = new rojeru_san.RSButton();
        rSButton2 = new rojeru_san.RSButton();
        rSButton3 = new rojeru_san.RSButton();
        rSButton4 = new rojeru_san.RSButton();
        rSButton5 = new rojeru_san.RSButton();
        rSButton6 = new rojeru_san.RSButton();
        rSButton7 = new rojeru_san.RSButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtproduct = new javax.swing.JTextField();
        txtstatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdec = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtretail = new javax.swing.JTextField();
        txtcost = new javax.swing.JTextField();
        txtqty = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtbarcode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1071, 640));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(204, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel1.setText("Super Market");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/abstract (3).png"))); // NOI18N
        jPanel4.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        rSButton1.setBackground(new java.awt.Color(255, 102, 0));
        rSButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/icons/exit.png"))); // NOI18N
        rSButton1.setText("Exit");
        rSButton1.setColorHover(new java.awt.Color(255, 255, 0));
        rSButton1.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rSButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 320, -1));

        rSButton2.setBackground(new java.awt.Color(255, 102, 0));
        rSButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/icons/list.png"))); // NOI18N
        rSButton2.setText("Category");
        rSButton2.setColorHover(new java.awt.Color(255, 255, 0));
        rSButton2.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rSButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 320, -1));

        rSButton3.setBackground(new java.awt.Color(255, 102, 0));
        rSButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/icons/brand.png"))); // NOI18N
        rSButton3.setText("Brand");
        rSButton3.setColorHover(new java.awt.Color(255, 255, 0));
        rSButton3.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rSButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, -1));

        rSButton4.setBackground(new java.awt.Color(255, 102, 0));
        rSButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/icons/order (1).png"))); // NOI18N
        rSButton4.setText("Product");
        rSButton4.setColorHover(new java.awt.Color(255, 255, 0));
        rSButton4.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rSButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 320, -1));

        rSButton5.setBackground(new java.awt.Color(255, 102, 0));
        rSButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/icons/pos-terminal.png"))); // NOI18N
        rSButton5.setText("POS");
        rSButton5.setColorHover(new java.awt.Color(255, 255, 0));
        rSButton5.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rSButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 320, -1));

        rSButton6.setBackground(new java.awt.Color(255, 102, 0));
        rSButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/icons/cash-register.png"))); // NOI18N
        rSButton6.setText("Cashier");
        rSButton6.setColorHover(new java.awt.Color(255, 255, 0));
        rSButton6.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton6.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rSButton6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 320, -1));

        rSButton7.setBackground(new java.awt.Color(255, 102, 0));
        rSButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pos/images/icons/logout.png"))); // NOI18N
        rSButton7.setText("Logout");
        rSButton7.setColorHover(new java.awt.Color(255, 255, 0));
        rSButton7.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButton7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        rSButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rSButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(rSButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 320, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Product", "Description", "Category", "Brand", "Cost Price", "Retail Price", "Qty", "Barcode", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 680, 250));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("Product");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Product");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 16, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Status");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, 60, 20));
        jPanel3.add(txtproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 186, -1));

        txtstatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactive" }));
        jPanel3.add(txtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Description");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 59, -1, -1));

        txtdec.setColumns(20);
        txtdec.setRows(5);
        jScrollPane2.setViewportView(txtdec);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 186, 69));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 186, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Category");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Brand");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 188, -1, -1));

        jComboBox3.setMinimumSize(new java.awt.Dimension(28, 30));
        jPanel3.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 186, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("cost price");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Retail price");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("qty");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));
        jPanel3.add(txtretail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 162, -1));
        jPanel3.add(txtcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 162, -1));
        jPanel3.add(txtqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 162, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Barcode");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        jPanel3.add(txtbarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 154, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 150, 40));

        jButton2.setBackground(new java.awt.Color(255, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 170, 40));

        jButton3.setBackground(new java.awt.Color(255, 102, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 180, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 600, 290));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 720, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
public void LoadCategory() 
{ 
Connection con1 = null; 
PreparedStatement insert = null; 
ResultSet rs = null; 
try 
{ 
Class.forName("com.mysql.jdbc.Driver" ); 
con1 = DriverManager.getConnection( "jdbc:mysql://localhost/javapos", "root", "" ); 
insert = con1.prepareStatement( "SELECT * FROM category" ); 
rs = insert.executeQuery(); 
jComboBox1.removeAllItems();

while ( rs.next() ) 
{ 
jComboBox1.addItem(new CategoryItem(rs.getInt(1), rs.getString(2) ) ); 


} 
} 
catch ( Exception e ) 
{ 
e.printStackTrace(); 
} 

} 
public void LoadBrand() 
{ 
Connection con1 = null; 
PreparedStatement insert = null; 
ResultSet rs = null; 
try 
{ 
Class.forName("com.mysql.jdbc.Driver" ); 
con1 = DriverManager.getConnection( "jdbc:mysql://localhost/javapos", "root", "" ); 
insert = con1.prepareStatement( "SELECT * FROM brand" ); 
rs = insert.executeQuery(); 
jComboBox3.removeAllItems();

while ( rs.next() ) 
{ 
jComboBox3.addItem(new BrandItem(rs.getInt(1), rs.getString(2) ) ); 


} 
} 
catch ( Exception e ) 
{ 
e.printStackTrace(); 
} 



} 




















public void LoadBrand1()
{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
            insert = con1.prepareStatement("SELECT * FROM brand");
             ResultSet rs = insert.executeQuery();
             jComboBox3.removeAllItems();
             while(rs.next())
             {
                jComboBox3.addItem(rs.getString(2));
              //   jComboBox1.addItem(typeEntry(rs.getInt(1),rs.getString(2)));
          //       jComboBox3.addItem(new product(rs.getString(1),rs.getString(2)));
                 
                 
             }
            
        } 
        catch (Exception e) {
        }
}

  
    
    private void table_update() {
        int CC;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
            insert = con1.prepareStatement("SELECT * FROM product");
             ResultSet Rs = insert.executeQuery();
            
   
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
           
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("id"));
                    v2.add(Rs.getString("productname"));
                    v2.add(Rs.getString("description"));
                    v2.add(Rs.getString("category"));
                    v2.add(Rs.getString("brand"));
                    v2.add(Rs.getString("costprice"));
                    v2.add(Rs.getString("retailprice"));
                    v2.add(Rs.getString("qty"));
                    v2.add(Rs.getString("barcode"));
                    v2.add(Rs.getString("status"));
                    
                }

                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }


    
 public void load()
    {
                              
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
            insert = con1.prepareStatement("SELECT * FROM product");
            ResultSet Rs = insert.executeQuery();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            while(Rs.next()){
                 String id = Rs.getString("id");
                String productname = Rs.getString("productname");
                String description = Rs.getString("description");
                String category = Rs.getString("category");               
                String brand = Rs.getString("brand");
                String costprice = Rs.getString("costprice");               
                String retailprice = Rs.getString("retailprice");
                String qty = Rs.getString("qty");
                
                String status = Rs.getString("status");
                
                
                
                               
               model.addRow(new Object[]{id,productname,description,category,brand,costprice,retailprice,qty,status});  
                
            }
      
            jTable1.setModel(model);
                                  
        } catch (Exception e) {
            
              System.out.println("Failed " + e);
            
        }             
    }



    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {   
            String name =txtproduct.getText();
            String dec =txtdec.getText();
            
           CategoryItem item = (CategoryItem)jComboBox1.getSelectedItem();
            BrandItem britem = (BrandItem)jComboBox3.getSelectedItem();
        
            String cost =txtcost.getText();
           String retail =txtretail.getText();
          String qty =txtqty.getText(); 
          String barcode =txtbarcode.getText();   
          String status = txtstatus.getSelectedItem().toString();
            
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
          insert = con1.prepareStatement("insert into product (productname,description,category,brand,costprice,retailprice,qty,barcode,status)values(?,?,?,?,?,?,?,?,?)");
        //    insert = con1.prepareStatement("insert into products(productname,description,category)values(?,?,?)");
            insert.setString(1,name);
            insert.setString(2,dec);
             insert.setInt(3,item.id);
            insert.setInt(4,britem.id);
            insert.setString(5,cost);
           insert.setString(6,retail);
            insert.setString(7,qty);
            insert.setString(8,barcode);
            insert.setString(9,status);   
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Sucsessfully Saved");         
            txtdec.setText("");
            txtproduct.setText("");
            jComboBox1.setSelectedIndex(-1);
            jComboBox3.setSelectedIndex(-1);
            txtcost.setText("");
            txtretail.setText("");
            txtqty.setText(""); 
            txtbarcode.setText(""); 
           txtstatus.setSelectedIndex(-1);
            model.setRowCount(0);
            table_update();
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
     
          
            
   
      
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        txtproduct.setText(model.getValueAt(selectedIndex, 1).toString());
        txtstatus.setSelectedItem(model.getValueAt(selectedIndex, 2).toString());
        jButton1.setEnabled(false);
        
        
        jButton3.setEnabled(true);
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
            try {   
                
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
            String name =txtproduct.getText();
            String status = txtstatus.getSelectedItem().toString();
            
           
            
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
            insert = con1.prepareStatement("update category set name= ?,status= ? where id= ?");
            insert.setString(1,name);
            insert.setString(2,status);
            insert.setInt(3,id);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated");
            txtproduct.setText("");
            txtstatus.setSelectedIndex(-1);
            jButton3.setEnabled(false);
            jButton1.setEnabled(true);
            table_update();
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
            try {   
                
            int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
      
      int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete the record","Warning",JOptionPane.YES_NO_OPTION);
           if(dialogResult == JOptionPane.YES_OPTION){
  // Saving code here
                      
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/javapos","root","");
            insert = con1.prepareStatement("delete from category where id = ?");
        
            insert.setInt(1,id);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Delete");
            txtproduct.setText("");
            txtstatus.setSelectedIndex(-1);
            jButton3.setEnabled(false);
            
            table_update();
           
           }
            jButton1.setEnabled(true);
            jButton3.setEnabled(false);
            txtproduct.setText("");
            txtstatus.setSelectedIndex(-1);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(product.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
private JFrame frame;
    private void rSButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton1ActionPerformed
        // TODO add your handling code here:
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to Exit","login",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();
       
        };
    }//GEN-LAST:event_rSButton1ActionPerformed

    private void rSButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton2ActionPerformed
        // TODO add your handling code here:
        category b = new category();
        b.setVisible(true);
        this.hide();
        
    }//GEN-LAST:event_rSButton2ActionPerformed

    private void rSButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton3ActionPerformed
        // TODO add your handling code here:
        brand b = new brand();
        b.setVisible(true);
        this.hide();
    }//GEN-LAST:event_rSButton3ActionPerformed

    private void rSButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton4ActionPerformed
        // TODO add your handling code here:
        product p = new product();
        p.setVisible(true);
        this.hide();;
    }//GEN-LAST:event_rSButton4ActionPerformed

    private void rSButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton5ActionPerformed
        // TODO add your handling code here:
         pos p = new pos();
        p.setVisible(true);
        this.hide();
    }//GEN-LAST:event_rSButton5ActionPerformed

    private void rSButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton6ActionPerformed
        // TODO add your handling code here:
        cashier p = new cashier();
        p.setVisible(true);
        this.hide();
  
    }//GEN-LAST:event_rSButton6ActionPerformed
private JFrame frame1;
    private void rSButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButton7ActionPerformed
        // TODO add your handling code here:
        frame1 = new JFrame("Logout");
        if (JOptionPane.showConfirmDialog(frame1,"Confirm if you want to Logout","Home",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
        this.dispose();//to close the current jframe
        new login().setVisible(true);
        };
    }//GEN-LAST:event_rSButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private rojeru_san.RSButton rSButton1;
    private rojeru_san.RSButton rSButton2;
    private rojeru_san.RSButton rSButton3;
    private rojeru_san.RSButton rSButton4;
    private rojeru_san.RSButton rSButton5;
    private rojeru_san.RSButton rSButton6;
    private rojeru_san.RSButton rSButton7;
    private rojerusan.RSLabelImage rSLabelImage1;
    private javax.swing.JTextField txtbarcode;
    private javax.swing.JTextField txtcost;
    private javax.swing.JTextArea txtdec;
    private javax.swing.JTextField txtproduct;
    private javax.swing.JTextField txtqty;
    private javax.swing.JTextField txtretail;
    private javax.swing.JComboBox<String> txtstatus;
    // End of variables declaration//GEN-END:variables

    private void publish(DefaultTableModel model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
