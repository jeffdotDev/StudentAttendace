
package Fernandez;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class StudentList extends javax.swing.JFrame {

    static LocalDate date = LocalDate.now();
    public StudentList() {
        initComponents();
        connectFromDB();
        rowTable();
        rowTable2();
        rowTable3();
        rowTable4();
        rowTable5();
    }
    Connection con = null;
    PreparedStatement ps;
    ResultSet rs;
    
    String drive = "com.mysql.cj.jdbc.Driver";
    
    public void connectFromDB(){
        try {
            Class.forName(drive);
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jeffersondb?useSSL=false","root","jeffersonbsit123");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public class ListStudent{
        private String firstName,middleName,lastName,course;
        
        public ListStudent(String firstName, String middleName, String lastName,String course){
            this.firstName = firstName;
            this.middleName = middleName;
            this.lastName = lastName;
            this.course = course;
        }
    }
    public ArrayList listS(){
        
        ArrayList<ListStudent> list = new ArrayList<ListStudent>();
        ListStudent student1 = new ListStudent("Joemarie","Ayroso","Usita","BSIT 2-E");
        ListStudent student2 = new ListStudent("Eric","Seballos","Cala-or","BSIT 2-E");
        
        list.add(student1);
        list.add(student2);
        return list;
    
   }
    public void rowTable(){
        DefaultTableModel table = (DefaultTableModel) table1.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    public void rowTable2(){
        DefaultTableModel table = (DefaultTableModel) table2.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    public void rowTable3(){
        DefaultTableModel table = (DefaultTableModel) table3.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    public void rowTable4(){
        DefaultTableModel table = (DefaultTableModel) table4.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    public void rowTable5(){
        DefaultTableModel table = (DefaultTableModel) table5.getModel();
        ArrayList<ListStudent> list = listS();
        Object data[] = new Object[4];
        for(int i = 0; i<list.size() ; i++){
            
            data[0] = list.get(i).firstName;
            data[1] = list.get(i).middleName;
            data[2] = list.get(i).lastName;
            data[3] = list.get(i).course;
            
            table.addRow(data);
            
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        firstNameFld = new javax.swing.JTextField();
        presentBtn = new javax.swing.JButton();
        middleNameFld = new javax.swing.JTextField();
        lastNameFld = new javax.swing.JTextField();
        courseFld = new javax.swing.JTextField();
        absentFld = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        fTuesdayFld = new javax.swing.JTextField();
        lTuesdayFld = new javax.swing.JTextField();
        cTuesdayFld = new javax.swing.JTextField();
        pTuesdayBtn = new javax.swing.JButton();
        aTuesdayBtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        fWeFld = new javax.swing.JTextField();
        lWeFld = new javax.swing.JTextField();
        cWeFld = new javax.swing.JTextField();
        pwedBtn = new javax.swing.JButton();
        pabBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table4 = new javax.swing.JTable();
        fThursdayFld = new javax.swing.JTextField();
        lThursdayFld = new javax.swing.JTextField();
        cThursdayFld = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        fFridayFld = new javax.swing.JTextField();
        lFridayFld = new javax.swing.JTextField();
        cFridayFld = new javax.swing.JTextField();
        pfridayBtn = new javax.swing.JButton();
        afridayBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Monday");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tuesday");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Wednesday");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Thursday");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Friday");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton8.setText("ShowRecord");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addGap(33, 33, 33)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton4)
                .addGap(34, 34, 34)
                .addComponent(jButton5)
                .addGap(37, 37, 37)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 460));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        presentBtn.setText("Present");
        presentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                presentBtnActionPerformed(evt);
            }
        });

        absentFld.setText("Absent");
        absentFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absentFldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lastNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                            .addComponent(firstNameFld))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(middleNameFld, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                            .addComponent(courseFld)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(presentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(absentFld, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(middleNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameFld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(courseFld, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(presentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(absentFld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(166, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel2);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        pTuesdayBtn.setText("Present");
        pTuesdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pTuesdayBtnActionPerformed(evt);
            }
        });

        aTuesdayBtn.setText("Absent");
        aTuesdayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aTuesdayBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fTuesdayFld)
                    .addComponent(cTuesdayFld)
                    .addComponent(pTuesdayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lTuesdayFld)
                    .addComponent(aTuesdayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fTuesdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTuesdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cTuesdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(aTuesdayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pTuesdayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table3);

        pwedBtn.setText("Present");
        pwedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwedBtnActionPerformed(evt);
            }
        });

        pabBtn.setText("Absent");
        pabBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pabBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fWeFld)
                            .addComponent(cWeFld, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(lWeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(pwedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(pabBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fWeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lWeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(cWeFld, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwedBtn)
                    .addComponent(pabBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", jPanel4);

        table4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(table4);

        jButton6.setText("Present");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Absent");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(fThursdayFld)
                        .addComponent(cThursdayFld, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(cThursdayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", jPanel5);

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Firstname", "Middlename", "Lastname", "Course"
            }
        ));
        table5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table5MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(table5);

        pfridayBtn.setText("Present");
        pfridayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfridayBtnActionPerformed(evt);
            }
        });

        afridayBtn.setText("Absent");
        afridayBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                afridayBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fFridayFld)
                    .addComponent(cFridayFld)
                    .addComponent(pfridayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lFridayFld)
                    .addComponent(afridayBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lFridayFld, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(fFridayFld))
                .addGap(18, 18, 18)
                .addComponent(cFridayFld, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pfridayBtn)
                    .addComponent(afridayBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab5", jPanel6);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 790, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        DefaultTableModel table = (DefaultTableModel) table1.getModel();
        
        String fname = table.getValueAt(table1.getSelectedRow(),0).toString();
        String mname = table.getValueAt(table1.getSelectedRow(),1).toString();
        String lname = table.getValueAt(table1.getSelectedRow(),2).toString();
        String course = table.getValueAt(table1.getSelectedRow(),3).toString();
        
        firstNameFld.setText(fname);
        middleNameFld.setText(mname);
        lastNameFld.setText(lname);
        courseFld.setText(course);
        
        
        
    }//GEN-LAST:event_table1MouseClicked

    private void presentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_presentBtnActionPerformed
        String first = firstNameFld.getText();
        String middle = middleNameFld.getText();
        String last = lastNameFld.getText();
        String course = courseFld.getText();
        try
        {
            ps = con.prepareStatement("Insert into mondaydate (Monday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_presentBtnActionPerformed

    private void absentFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absentFldActionPerformed
        String first = firstNameFld.getText();
        String middle = middleNameFld.getText();
        String last = lastNameFld.getText();
        String course = courseFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into mondaydate (Monday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_absentFldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
       DefaultTableModel table = (DefaultTableModel) table2.getModel();
        
        String fname = table.getValueAt(table2.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table2.getSelectedRow(),2).toString();
        String course = table.getValueAt(table2.getSelectedRow(),3).toString();
        
        fTuesdayFld.setText(fname);
        lTuesdayFld.setText(lname);
        cTuesdayFld.setText(course);
    }//GEN-LAST:event_table2MouseClicked

    private void pTuesdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pTuesdayBtnActionPerformed
        String first = fTuesdayFld.getText();
        String last = lTuesdayFld.getText();
        String course = cTuesdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into tuesdaydate (Tuesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pTuesdayBtnActionPerformed

    private void aTuesdayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aTuesdayBtnActionPerformed
        String first = fTuesdayFld.getText();
        String middle = middleNameFld.getText();
        String last = lTuesdayFld.getText();
        String course = cTuesdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into tuesdaydate (Tuesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_aTuesdayBtnActionPerformed

    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
        DefaultTableModel table = (DefaultTableModel) table3.getModel();
        
        String fname = table.getValueAt(table3.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table3.getSelectedRow(),2).toString();
        String course = table.getValueAt(table3.getSelectedRow(),3).toString();
        
        fWeFld.setText(fname);
        lWeFld.setText(lname);
        cWeFld.setText(course);
    }//GEN-LAST:event_table3MouseClicked

    private void pwedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwedBtnActionPerformed
        String first = fWeFld.getText();
        String last = lWeFld.getText();
        String course = cWeFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into wednesdaydate (Wednesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pwedBtnActionPerformed

    private void pabBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pabBtnActionPerformed
        String first = fWeFld.getText();
        String last = lWeFld.getText();
        String course = cWeFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into wednesdaydate (Wednesday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pabBtnActionPerformed

    private void table4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table4MouseClicked
        DefaultTableModel table = (DefaultTableModel) table4.getModel();
        
        String fname = table.getValueAt(table4.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table4.getSelectedRow(),2).toString();
        String course = table.getValueAt(table4.getSelectedRow(),3).toString();
        
        fThursdayFld.setText(fname);
        lThursdayFld.setText(lname);
        cThursdayFld.setText(course);
    }//GEN-LAST:event_table4MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String first = fThursdayFld.getText();
        String last = lThursdayFld.getText();
        String course = cThursdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into thursdaydate (Thursday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String first = fThursdayFld.getText();
        String last = lThursdayFld.getText();
        String course = cThursdayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into thursdaydate (Thursday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void table5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table5MouseClicked
        DefaultTableModel table = (DefaultTableModel) table5.getModel();
        
        String fname = table.getValueAt(table5.getSelectedRow(),0).toString();
        String lname = table.getValueAt(table5.getSelectedRow(),2).toString();
        String course = table.getValueAt(table5.getSelectedRow(),3).toString();
        
        fFridayFld.setText(fname);
        lFridayFld.setText(lname);
        cFridayFld.setText(course);
    }//GEN-LAST:event_table5MouseClicked

    private void pfridayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfridayBtnActionPerformed
        String first = fFridayFld.getText();
        String last = lFridayFld.getText();
        String course = cFridayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into fridaydate (Friday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Present " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_pfridayBtnActionPerformed

    private void afridayBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_afridayBtnActionPerformed
        String first = fFridayFld.getText();
        String last = lFridayFld.getText();
        String course = cFridayFld.getText();
         try
        {
            ps = con.prepareStatement("Insert into fridaydate (Friday) Values(?)");
            ps.setString(1,first +" "+ last +" "+ course +" Absent " + date);
            
            int check = ps.executeUpdate();
            
            if(check == 1){
                JOptionPane.showMessageDialog(null,"Successfully Submit the Attendance!!");
            }
            else{
                JOptionPane.showMessageDialog(null,"Not Submited!!","Message",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e)
        {
            System.out.println("Error Occured!!" + e.getMessage());
        }
    }//GEN-LAST:event_afridayBtnActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.dispose();
        showR show = new showR();
        show.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aTuesdayBtn;
    private javax.swing.JButton absentFld;
    private javax.swing.JButton afridayBtn;
    private javax.swing.JTextField cFridayFld;
    private javax.swing.JTextField cThursdayFld;
    private javax.swing.JTextField cTuesdayFld;
    private javax.swing.JTextField cWeFld;
    private javax.swing.JTextField courseFld;
    private javax.swing.JTextField fFridayFld;
    private javax.swing.JTextField fThursdayFld;
    private javax.swing.JTextField fTuesdayFld;
    private javax.swing.JTextField fWeFld;
    private javax.swing.JTextField firstNameFld;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lFridayFld;
    private javax.swing.JTextField lThursdayFld;
    private javax.swing.JTextField lTuesdayFld;
    private javax.swing.JTextField lWeFld;
    private javax.swing.JTextField lastNameFld;
    private javax.swing.JTextField middleNameFld;
    private javax.swing.JButton pTuesdayBtn;
    private javax.swing.JButton pabBtn;
    private javax.swing.JButton pfridayBtn;
    private javax.swing.JButton presentBtn;
    private javax.swing.JButton pwedBtn;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTable table3;
    private javax.swing.JTable table4;
    private javax.swing.JTable table5;
    // End of variables declaration//GEN-END:variables
}
