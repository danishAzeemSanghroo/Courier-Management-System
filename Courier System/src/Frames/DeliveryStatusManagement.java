/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;


import Frames.*;
import java.io.*;
import static java.util.Locale.*;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Danish
 */
public class DeliveryStatusManagement extends javax.swing.JFrame {

    /**
     * Creates new form OrderManagement
     */
    public DeliveryStatusManagement() throws FileNotFoundException {
        initComponents();
        refresh();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        customerNameTextField = new javax.swing.JTextField();
        phoneNoTextField = new javax.swing.JTextField();
        AddressTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        totalPriceTextField = new javax.swing.JTextField();
        timeAndDateTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sizeTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        orderIdTextField = new javax.swing.JTextField();
        statusTextField = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        oderTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1324, 762));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 29, 120, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Customer Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 140, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Order ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 90, 30));

        customerNameTextField.setEditable(false);
        customerNameTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(customerNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 230, 30));

        phoneNoTextField.setEditable(false);
        phoneNoTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(phoneNoTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 230, 30));

        AddressTextField.setEditable(false);
        AddressTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(AddressTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 230, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Status");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 70, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Total Price (RM)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 150, 30));

        totalPriceTextField.setEditable(false);
        totalPriceTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(totalPriceTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 230, 30));

        timeAndDateTextField.setEditable(false);
        timeAndDateTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(timeAndDateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 230, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Date & Time");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 110, -1));

        sizeTextField.setEditable(false);
        sizeTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(sizeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 230, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Size (kg)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 90, -1));

        orderIdTextField.setEditable(false);
        orderIdTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(orderIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 230, 30));

        statusTextField.setEditable(false);
        statusTextField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        getContentPane().add(statusTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, 230, 30));

        statusComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Delivered", "Pending" }));
        getContentPane().add(statusComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 130, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 510, 450));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oderTable.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        oderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customer  Name", "Phone Number", "Address", "Order ID", "Size", "Date & Time", "Total Price", "Status"
            }
        ));
        oderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oderTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(oderTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 430));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, 740, 450));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateButton.setText("Save");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel3.add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 60));

        refreshButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        refreshButton.setText("REFRESH");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        jPanel3.add(refreshButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 130, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 390, 80));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel1.setText("Delivery Status Management");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, 620, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        new DeliveryHome().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed

        try {
            refresh();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeliveryStatusManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void oderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oderTableMouseClicked
        int i=oderTable.getSelectedRow();
        TableModel model=oderTable.getModel();
        customerNameTextField.setText(model.getValueAt(i, 0).toString());
        phoneNoTextField.setText(model.getValueAt(i, 1).toString());
        AddressTextField.setText(model.getValueAt(i, 2).toString());
        orderIdTextField.setText(model.getValueAt(i, 3).toString());
        sizeTextField.setText(model.getValueAt(i, 4).toString());
        timeAndDateTextField.setText(model.getValueAt(i, 5).toString());
        totalPriceTextField.setText(model.getValueAt(i, 6).toString());
        statusTextField.setText(model.getValueAt(i, 7).toString());        
     
//File inputFile = new File("D:\\Courier System\\Courier System\\src\\TextFiles\\userManagement.txt");
//File tempFile = new File("D:\\Courier System\\Courier System\\src\\TextFiles\\tempFile.txt");
//try{
//BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//
//int lineToRemove = userJTable.getSelectedRow();
//String currentLine;
//
//while((currentLine = reader.readLine()) != null) {
//    // trim newline when comparing with lineToRemove
//    String trimmedLine = currentLine.trim();
//    if(trimmedLine.equals(lineToRemove)) continue;
//    writer.write(currentLine + System.getProperty("line.separator"));
//}
//writer.close(); 
//reader.close(); 
//boolean successful = tempFile.renameTo(inputFile);
//}catch(Exception e){}
    }//GEN-LAST:event_oderTableMouseClicked

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
       DefaultTableModel model =(DefaultTableModel)oderTable.getModel();
       if(oderTable.getSelectedRowCount()==1){
           
       String customerName=customerNameTextField.getText();
       String phoneNo=phoneNoTextField.getText();
       String address=AddressTextField.getText();
       String orderId=orderIdTextField.getText();
       String size=sizeTextField.getText();
       String dateAndTime=timeAndDateTextField.getText();
       String totalPrice=totalPriceTextField.getText();
       String status=(String)statusComboBox.getSelectedItem(); 
              
              
              model.setValueAt(customerName, oderTable.getSelectedRow(), 0);
              model.setValueAt(phoneNo, oderTable.getSelectedRow(), 1);
              model.setValueAt(address, oderTable.getSelectedRow(), 2);
              model.setValueAt(orderId, oderTable.getSelectedRow(), 3);
              model.setValueAt(size, oderTable.getSelectedRow(), 4);
              model.setValueAt(dateAndTime, oderTable.getSelectedRow(), 5);
              model.setValueAt(totalPrice, oderTable.getSelectedRow(), 6);
              model.setValueAt(status, oderTable.getSelectedRow(), 7);              
              
 
              
              JOptionPane.showMessageDialog(null, "Updated Successfully");    
       }
       else
       {
           if(oderTable.getSelectedRowCount()==0){
           JOptionPane.showMessageDialog(null, "Table is empty");
           }
           else{
           JOptionPane.showMessageDialog(null, "Please select single row for update");
           }
       }
       
    }//GEN-LAST:event_updateButtonActionPerformed
private void refresh() throws FileNotFoundException{
  DefaultTableModel model =(DefaultTableModel)oderTable.getModel();
  model.setNumRows(0);        
    String filePath="D:\\Courier System\\Courier System\\src\\TextFiles\\orderManagement.txt";
    File file=new File(filePath);
    
              FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
           
            Object[] lines = br.lines().toArray();
            
            for(int i = 0; i < lines.length; i++){
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }    
    }
    private void addorderManagement() {
       
       String customerName=customerNameTextField.getText();
       String phoneNo=phoneNoTextField.getText();
       String address=AddressTextField.getText();
       String orderId=orderIdTextField.getText();
       String size=sizeTextField.getText();
       String dateAndTime=timeAndDateTextField.getText();
       String totalPrice=totalPriceTextField.getText();
       String status=statusTextField.getText();       
       
       try{
           FileWriter Writer=new FileWriter("D:\\Courier System\\Courier System\\src\\TextFiles\\orderManagement.txt",true);
           Writer.write(""+customerName+","+phoneNo+","+address+","+orderId+","+size+","+dateAndTime+","+totalPrice+","+status);
           Writer.write(System.getProperty("line.separator"));
           Writer.close();
           JOptionPane.showMessageDialog (null,"Successfully Added");
           setVisible(false);
           new DeliveryStatusManagement().setVisible(true);
           refresh();
       }catch(Exception e){
       e.printStackTrace();
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
            java.util.logging.Logger.getLogger(DeliveryStatusManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliveryStatusManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliveryStatusManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliveryStatusManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DeliveryStatusManagement().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(DeliveryStatusManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable oderTable;
    private javax.swing.JTextField orderIdTextField;
    private javax.swing.JTextField phoneNoTextField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField sizeTextField;
    private javax.swing.JComboBox statusComboBox;
    private javax.swing.JTextField statusTextField;
    private javax.swing.JTextField timeAndDateTextField;
    private javax.swing.JTextField totalPriceTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables


}
