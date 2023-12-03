
package KyleProject;

import javax.swing.JOptionPane;


public class Update extends javax.swing.JFrame {

    static Add add;
    public Update() {
        initComponents();
        add = new Add();
        add.connect();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        fnameFld = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        mnameFLd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lnameFld = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        courseFld = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genderFld = new javax.swing.JTextField();
        ageFld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        idFld = new javax.swing.JTextField();
        addressFld = new javax.swing.JTextField();
        contactFld = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        positionFld = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("LastName");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 90, 30));
        getContentPane().add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 120, 30));

        jLabel2.setText("LastName");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 80, 20));
        getContentPane().add(fnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 130, 30));

        jLabel3.setText("Course");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 80, 20));
        getContentPane().add(mnameFLd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 30));

        jLabel4.setText("Co#");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 80, 20));
        getContentPane().add(lnameFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 140, 30));

        jLabel5.setText("FirstName");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 80, 20));

        courseFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseFldActionPerformed(evt);
            }
        });
        getContentPane().add(courseFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 120, 30));

        jLabel6.setText("MiddleName");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 80, 20));

        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, 20));
        getContentPane().add(genderFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 120, 30));
        getContentPane().add(ageFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 140, 30));

        jLabel8.setText("Age");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 80, 20));

        jLabel9.setText("ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 80, 20));

        jLabel10.setText("Address");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 80, 20));
        getContentPane().add(idFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, 30));
        getContentPane().add(addressFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 140, 30));
        getContentPane().add(contactFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 342, 150, 30));

        jLabel11.setText("Position");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 80, -1));
        getContentPane().add(positionFld, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 120, 30));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 140, 30));

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
       String last = lastName.getText();
       try
       {
           add.ps = add.con.prepareStatement("Select * from kylestudentrecord where LastName = ?");
           
           add.ps.setString(1, last);
           
           add.rs = add.ps.executeQuery();
           
           while(add.rs.next()){
               idFld.setText(add.rs.getString(1));
               fnameFld.setText(add.rs.getString(2));
               mnameFLd.setText(add.rs.getString(3));
               lnameFld.setText(add.rs.getString(4));
               courseFld.setText(add.rs.getString(5));
               genderFld.setText(add.rs.getString(6));
               ageFld.setText(add.rs.getString(7));
               addressFld.setText(add.rs.getString(8));
               contactFld.setText(add.rs.getString(9));
               positionFld.setText(add.rs.getString(10));
           }
       }
       catch(Exception e)
       {
           System.out.println("Error Occured!!" + e.getMessage());
       }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void courseFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseFldActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        String fname = fnameFld.getText();
        String mname = mnameFLd.getText();
        String lname = lnameFld.getText();
        String course = courseFld.getText();
        String gender = genderFld.getText();
        int age = Integer.parseInt(ageFld.getText());
        String address = addressFld.getText();
        String id = idFld.getText();
        String contact = contactFld.getText();
        String position = positionFld.getText();
        try
        {
            add.ps = add.con.prepareStatement("Update kylestudentrecord set IdNumber = ?, MiddleName = ?, LastName = ?, CourseAndYr = ?, Gender = ?, Age = ?,Address = ?, ContactNum = ?, Position = ? where FirstName = ?");
            add.ps.setString(1, id);
            add.ps.setString(2, mname);
            add.ps.setString(3, lname);
            add.ps.setString(4, course);
            add.ps.setString(5, gender);
            add.ps.setInt(6, age);
            add.ps.setString(7, address);
            add.ps.setString(8, contact);
            add.ps.setString(9, position);
            add.ps.setString(10, fname);
            
            int check = add.ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Update!!");
            }
            else
            {
               JOptionPane.showMessageDialog(null,"Not Update info!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!1" + e.getMessage());
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        AdminFrame admin = new AdminFrame();
        admin.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressFld;
    private javax.swing.JTextField ageFld;
    private javax.swing.JButton back;
    private javax.swing.JTextField contactFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JTextField fnameFld;
    private javax.swing.JTextField genderFld;
    private javax.swing.JTextField idFld;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField lnameFld;
    private javax.swing.JTextField mnameFLd;
    private javax.swing.JTextField positionFld;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
