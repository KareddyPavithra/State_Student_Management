/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package state_student_management.Library;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Books;
import Business.Organization.BooksDirectory;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LibraryRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhaveshraja
 */
public class BooksManagerDashboard extends javax.swing.JPanel {

    /**
     * Creates new form ITSEmployeeDashboard1
     */
    
    EcoSystem ecosystem;
    Organization organization;
    UserAccount userAccount;
    JPanel userProcessContainer;
   // Books books;
    //BooksDirectory booksDirectory;
    private Enterprise enterprise;
    private OrganizationDirectory organizationDirectory;
    //ArrayList<Books> booksList = new ArrayList<>();
    DefaultTableModel book,request;
    int row, col;
    private DB4OUtil dB4OUtil; 
    
    public BooksManagerDashboard(JPanel userProcessContainer, EcoSystem ecosystem, Organization organization,UserAccount userAccount ) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.organization = organization;
        this.userAccount = userAccount;
        
        book = (DefaultTableModel) tblBooks.getModel();  
        request = (DefaultTableModel)tblRequests.getModel();
        
        dB4OUtil = DB4OUtil.getInstance();
        
        populateBooksTable();
        populateRequestTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProfessorDirectoryPane = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBooks = new javax.swing.JTable();
        btnDeleteBook = new javax.swing.JButton();
        btnViewBook = new javax.swing.JButton();
        btnAddBook = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtBookName = new javax.swing.JTextField();
        btnUpdateBook = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        comboBookStock = new javax.swing.JComboBox();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        txtRole = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ProfessorDirectoryPane.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel8.setText("Books");

        tblBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Name", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBooksMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblBooks);

        btnDeleteBook.setBackground(new java.awt.Color(245, 1, 1));
        btnDeleteBook.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteBook.setText("Delete");
        btnDeleteBook.setBorder(null);
        btnDeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBookActionPerformed(evt);
            }
        });

        btnViewBook.setBackground(new java.awt.Color(52, 51, 242));
        btnViewBook.setForeground(new java.awt.Color(255, 255, 255));
        btnViewBook.setText("View");
        btnViewBook.setBorder(null);
        btnViewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookActionPerformed(evt);
            }
        });

        btnAddBook.setBackground(new java.awt.Color(201, 3, 3));
        btnAddBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBook.setText("Add Book");
        btnAddBook.setBorder(null);
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });

        jLabel6.setText("Book Name");

        btnUpdateBook.setBackground(new java.awt.Color(52, 51, 242));
        btnUpdateBook.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateBook.setText("Update");
        btnUpdateBook.setBorder(null);
        btnUpdateBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateBookActionPerformed(evt);
            }
        });

        jLabel7.setText("Availability");

        comboBookStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "In Stock", "Out of Stock" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(591, 591, 591)
                        .addComponent(btnViewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(txtBookName, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(jLabel7)
                                    .addComponent(comboBookStock, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(btnViewBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdateBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboBookStock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        ProfessorDirectoryPane.addTab("Books", jPanel5);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 20)); // NOI18N
        jLabel9.setText("Requests");

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Student Name", "Student Email", "Request Type", "Request Name", "From Date", "To Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequests.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRequestsMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblRequests);

        btnAccept.setBackground(new java.awt.Color(0, 153, 0));
        btnAccept.setForeground(new java.awt.Color(255, 255, 255));
        btnAccept.setText("Accept");
        btnAccept.setBorder(null);
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(255, 51, 51));
        btnReject.setForeground(new java.awt.Color(255, 255, 255));
        btnReject.setText("Reject");
        btnReject.setBorder(null);
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 964, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(btnAccept, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReject, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        ProfessorDirectoryPane.addTab("Requests", jPanel7);

        jPanel2.setBackground(new java.awt.Color(201, 3, 3));

        jLabel1.setText("jLabel1");

        btnLogout.setForeground(new java.awt.Color(138, 138, 138));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addComponent(txtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ProfessorDirectoryPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProfessorDirectoryPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1061, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.remove(this);
        layout.next(userProcessContainer);
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        row = tblRequests.getSelectedRow();
        String currentStatus = request.getValueAt(row, 3).toString();
        if(currentStatus.equalsIgnoreCase("Request raised"))
        {
            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Request Rejected");
            JOptionPane.showMessageDialog(this, "Request is Rejected", " Request Rejected", 1);    
        }
         else if(currentStatus.equalsIgnoreCase("Request Declined")){
            
            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Request declined", 1);
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Request is already accepted", " Request Accepted", 1);
            
        }
        populateRequestTable();
        
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnUpdateBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateBookActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblBooks.getModel();
        
        if(tblBooks.getSelectedRowCount() == 1){
            
        String name =  model.getValueAt(tblBooks.getSelectedRow(), 0).toString();       
        String bookStock = model.getValueAt(tblBooks.getSelectedRow(), 1).toString();
        
        txtBookName.setText(name);
        comboBookStock.setSelectedItem(bookStock);
        
        model.setValueAt(name, tblBooks.getSelectedRow(), 0);
        model.setValueAt(bookStock,tblBooks.getSelectedRow() ,1 );
       

        
        
        JOptionPane.showMessageDialog(this, "Details updated");
        }
        else{
            if(tblBooks.getRowCount() ==0){
                JOptionPane.showMessageDialog(this, "Table is empty");
            }else{
                JOptionPane.showMessageDialog(this, "Select a row to update");
            }
              
        }
        
        
    }//GEN-LAST:event_btnUpdateBookActionPerformed

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        // TODO add your handling code here:
        String bookName = txtBookName.getText().trim();
        String bookStock = comboBookStock.getSelectedItem().toString();
        
        Books books = new Books(bookName, bookStock);
        
        organization.booksDirectory.addBook(books);
        populateBooksTable();
        
       // Object[] data = {bookName};
       // book.addRow(data);
        
        txtBookName.setText("");
        comboBookStock.setSelectedIndex(-1);
        
        dB4OUtil.storeSystem(ecosystem);
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void btnViewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewBookActionPerformed

    private void btnDeleteBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBookActionPerformed
        // TODO add your handling code here:
        int row = tblBooks.getSelectedRow();
        
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!!");
            return;
        }
        
        String bookName = tblBooks.getValueAt(row,0 ).toString();
        
        for(Books books : organization.getBooksDirectory().getBooksList()){
            
        }

        book.removeRow(row);

        txtBookName.setText("");
        
        dB4OUtil.storeSystem(ecosystem);

    }//GEN-LAST:event_btnDeleteBookActionPerformed

    private void tblBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBooksMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblBooks.getModel();

        String bookName = model.getValueAt(tblBooks.getSelectedRow(), 0).toString();

        txtBookName.setText(bookName);
    }//GEN-LAST:event_tblBooksMouseClicked

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        
        String currentStatus = request.getValueAt(row, 3).toString();
        
        if(currentStatus.equalsIgnoreCase("Request raised"))
        {
            organization.getWorkQueue().getListOfWorkQueues().get(row).setStatus("Request Accepted");          
            JOptionPane.showMessageDialog(this, "Request is Accepted", " Request Accepted", 1);
           
        }
        
        else if(currentStatus.equalsIgnoreCase("Request Declined")){
            
            JOptionPane.showMessageDialog(this, "This request is Already declined earlier", " Request declined", 1);
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Request is already accepted", " Request Accepted", 1);
            
        }
        
        populateRequestTable();
       
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void tblRequestsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRequestsMouseClicked
        // TODO add your handling code here:
        
        row = tblRequests.getSelectedRow();
        col = tblRequests.getSelectedColumn();
    }//GEN-LAST:event_tblRequestsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane ProfessorDirectoryPane;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnDeleteBook;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReject;
    private javax.swing.JButton btnUpdateBook;
    private javax.swing.JButton btnViewBook;
    private javax.swing.JComboBox comboBookStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblBooks;
    private javax.swing.JTable tblRequests;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtRole;
    // End of variables declaration//GEN-END:variables

private void populateBooksTable() {
       
        book.setRowCount(0);
      
        for (Books books : this.organization.getBooksDirectory().getBooksList()) {
            
               Object[] objs = {books.getBookName(), books.getBookStock()};                       
               book.addRow(objs);
           }
}

private void populateRequestTable() {
      request.setRowCount(0);
        
        WorkQueue workQueue = organization.getWorkQueue();
        
        for(WorkRequest workRequest  : workQueue.getListOfWorkQueues() ){
            LibraryRequest req = (LibraryRequest) workRequest;
              
            
            Date date = null;
            if(req.getStatus().equalsIgnoreCase("Request Accepted")) {
                  date = req.getResolveDate();
            }

            Object[] objs = {req.getSender().getStudent().getName(),req.getPriority(), req.getMessage(), req.getStatus(),req.getRequestDate(),date};
            request.addRow(objs);
            
        }
    }

 
}
