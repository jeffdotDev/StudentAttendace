
package KyleProject;

import firstdb.dbFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Add extends javax.swing.JFrame {

    
    public Add() {
        initComponents();
        connect();
    }
    
    Connection con=null;
    PreparedStatement ps;
    ResultSet rs;
    String drive = "com.mysql.cj.jdbc.Driver";
    public void connect(){
        try {
            Class.forName(drive);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeffersondb?useSSL=false","root","jeffersonbsit123");
            
            if(con!=null){
                System.out.println("Connected");
            }
            
           
        }  catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(dbFrame.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lNameFld = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        courseFld = new javax.swing.JTextField();
        idFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fnameFld = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        genderFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        positionFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mNameFld = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ageFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        addressFld = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        contactNumFld = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("LastName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 110, -1));
        getContentPane().add(lNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 150, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Gender");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 70, -1));
        getContentPane().add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 160, -1));
        getContentPane().add(idFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 150, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("MiddleName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 110, -1));
        getContentPane().add(fnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 150, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("FirstName");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 70, -1));
        getContentPane().add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 150, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Address");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 90, -1));
        getContentPane().add(positionFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 170, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Id");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 70, -1));
        getContentPane().add(mNameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 150, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Course&Year");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 90, -1));
        getContentPane().add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 150, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Age");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 90, -1));
        getContentPane().add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 150, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("ContactNumber");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 120, -1));
        getContentPane().add(contactNumFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Regular/Irrig/Returning");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        submitBtn.setText("AddStudent");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(submitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 160, 40));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        try
        {
            String first = fnameFld.getText();
            String middle = mNameFld.getText();
            String last = lNameFld.getText();
            String course = courseFld.getText();
            String id = idFld.getText();
            String gender = genderFld.getText();
            int age = Integer.parseInt(ageFld.getText());
            String address = addressFld.getText();
            String conNum = contactNumFld.getText();
            String regular = positionFld.getText();
            
            ps = con.prepareStatement("INSERT INTO kylestudentrecord (IdNumber,FirstName,MiddleName,LastName,CourseAndYr,Gender,Age,Address,ContactNum,Position) VALUES(?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, id);
            ps.setString(2, first);
            ps.setString(3, middle);
            ps.setString(4, last);
            ps.setString(5, course);
            ps.setString(6, gender);
            ps.setInt(7, age);
            ps.setString(8, address);
            ps.setString(9, conNum);
            ps.setString(10, regular);
            
            int check = ps.executeUpdate();
            
            if(check == 1)
            {
                JOptionPane.showMessageDialog(null,"Successfully added!!");
                
                fnameFld.setText("");
                mNameFld.setText("");
                lNameFld.setText("");
                courseFld.setText("");
                idFld.setText("");
                ageFld.setText("");
                addressFld.setText("");
                contactNumFld.setText("");
                positionFld.setText("");
                genderFld.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Not Added!!","Message",JOptionPane.PLAIN_MESSAGE);
            }
            
            
        }
        catch(Exception e)
        {
          System.out.println("Error occured!1" + e.getMessage()); 
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       AdminFrame ad = new AdminFrame();
       ad.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFld;
    private javax.swing.JTextField ageFld;
    private javax.swing.JTextField contactNumFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JTextField fnameFld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JTextField idFld;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lNameFld;
    private javax.swing.JTextField mNameFld;
    private javax.swing.JTextField positionFld;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
