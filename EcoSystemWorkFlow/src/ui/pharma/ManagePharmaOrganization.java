/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.pharma;

import ui.logistics.*;
import ui.bloodSupply.*;
import ui.HealthCare.*;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Organization.Organization.OrganizationType;
import ecosystemworkflow.Organization.OrganizationDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gunav
 */
public class ManagePharmaOrganization extends javax.swing.JPanel {

    /**
     * Creates new form ManageHealthCareOrganization
     */
    private OrganizationDirectory organizationDirectory;
    private JPanel workArea;
    
    public ManagePharmaOrganization(JPanel workArea, OrganizationDirectory organizationDirectory) {
        initComponents();
        
       this.workArea = workArea;
       this.organizationDirectory = organizationDirectory;
       
       populateJComboBox();
       populateJTable();
        
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
        organizationTable = new javax.swing.JTable();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        organizationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Type of Organization", "ID"
            }
        ));
        jScrollPane1.setViewportView(organizationTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 509, 200));

        organizationJComboBox.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 207, 30));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setText("Type of Organization : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, 30));

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3.setText("Name Of Organization : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, 30));

        nameTextField.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 207, 30));

        addBtn.setBackground(new java.awt.Color(255, 255, 255));
        addBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        addBtn.setText("Add");
        addBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 100, 30));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        backBtn.setText("Back");
        backBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 109, 80, 30));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pharmaceutical");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, 50));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Organization");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Untitled design (3).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        if(nameTextField.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Organization name can't be empty");
        }else{
            OrganizationType type = (OrganizationType) organizationJComboBox.getSelectedItem();
            organizationDirectory.createOrganization(type,nameTextField.getText());
            populateJTable();
            nameTextField.setText("");}
    }//GEN-LAST:event_addBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationTable;
    // End of variables declaration//GEN-END:variables

     private void populateJComboBox() {
        organizationJComboBox.removeAllItems();
      
        organizationJComboBox.addItem(Organization.OrganizationType.DrugProductionOrganization);
        organizationJComboBox.addItem(Organization.OrganizationType.QualityControlAndAssuranceOrganization);
       
    }

    private void populateJTable() {
        DefaultTableModel model = (DefaultTableModel) organizationTable.getModel();
        
        model.setRowCount(0);
        
        for (Organization organization : organizationDirectory.getOrganizations()){
            Object[] row = new Object[3];
            row[2] = organization.getOrganizationCode();
            row[0] = organization.getOrganizationName();
            row[1]=  organization.getName();
            model.addRow(row);
        }
    }
}
