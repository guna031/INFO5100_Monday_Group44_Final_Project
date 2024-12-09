/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.rAndD;


import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Employee.Employee;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.ChemicalCompoundResearchOrganization;
import ecosystemworkflow.Organization.ClinicalTrialsManagementOrganization;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Role.ChemicalCompoundResearcherRole;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.Role.TrailCoordinatorRole;
import ecosystemworkflow.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gunav
 */
public class ManageRAndDUserAccounts extends javax.swing.JPanel {

    /**
     * Creates new form ManageHealthCareUserAccounts
     */
    private JPanel workArea;
    private Enterprise enterprise;
    
    public ManageRAndDUserAccounts(JPanel workArea, Enterprise enterprise) {
        initComponents();
        
        this.workArea = workArea;
        this.enterprise = enterprise;
        populateOrganizationJComboBox();
        populateData();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        employeeJComboBox = new javax.swing.JComboBox();
        EmployeeRoleJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usernameTxtField = new javax.swing.JTextField();
        passwordTxtField = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        addBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Role", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 112, 482, 170));

        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 300, 209, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Organization : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 305, 100, 20));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Employee  Name :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 348, 427, 20));

        add(employeeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 343, 209, -1));

        add(EmployeeRoleJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 386, 209, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Employee Role :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 391, -1, 20));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Username :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(372, 433, -1, 22));
        add(usernameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 429, 209, 24));

        passwordTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtFieldActionPerformed(evt);
            }
        });
        add(passwordTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 473, 209, 24));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Password :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 466, 68, 20));

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 515, 90, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Research and Outcomes");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Account");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Untitled design (2).jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            populateEmployeeJComboBox(organization);
            populateRoleComboBox(enterprise);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void passwordTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTxtFieldActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if(usernameTxtField.getText().isEmpty()|| passwordTxtField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Any of the above field(s) can't be empty");
        }else{ String userName = usernameTxtField.getText();
            String password = passwordTxtField.getText();
            if (!(EcoSystem.validatePassword(password))) {
                JOptionPane.showMessageDialog(this, "Invalid password, Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.");
                return;
            }
            if(EcoSystem.checkIfUsernameIsUnique(userName)){
                Organization organization = (Organization) organizationJComboBox.getSelectedItem();
                Employee employee = (Employee) employeeJComboBox.getSelectedItem();
                Role role = (Role) EmployeeRoleJComboBox.getSelectedItem();

                organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

                populateData();
                usernameTxtField.setText("");
                passwordTxtField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,  "Enter unique username", "Warning", JOptionPane.WARNING_MESSAGE);
            }}
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox EmployeeRoleJComboBox;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JPasswordField passwordTxtField;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameTxtField;
    // End of variables declaration//GEN-END:variables

     private void populateOrganizationJComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
            organizationJComboBox.addItem(organization);
        }
    }

    private void populateData() {
        DefaultTableModel model = (DefaultTableModel) userTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                row[0] = ua;
                row[2] = ua.getPassword();
                row[1] = ua.getRole();
                ((DefaultTableModel) userTable.getModel()).addRow(row);
            }
        }
    }
    
    public void populateEmployeeJComboBox(Organization organization) {
        employeeJComboBox.removeAllItems();

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            employeeJComboBox.addItem(employee);
        }
    }

    private void populateRoleComboBox(Enterprise e) {
        EmployeeRoleJComboBox.removeAllItems();

        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization instanceof ChemicalCompoundResearchOrganization) {
            EmployeeRoleJComboBox.addItem(new ChemicalCompoundResearcherRole());
        } 
        else if (organization instanceof ClinicalTrialsManagementOrganization) {
            EmployeeRoleJComboBox.addItem(new TrailCoordinatorRole());
        } 
       

    }
}
