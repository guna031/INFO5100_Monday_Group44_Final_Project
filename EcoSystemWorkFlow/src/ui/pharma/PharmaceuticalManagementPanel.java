/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.pharma;

import ui.logistics.*;
import ui.bloodSupply.*;
import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public class PharmaceuticalManagementPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankOrganizationManagementPanel
     */
    private JPanel workArea;
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    
    /**
     * Creates new form CareerServiceAdminUI
     */
    public PharmaceuticalManagementPanel(JPanel workArea, EcoSystem ecosystem,Enterprise enterprise) {
        initComponents();
        this.workArea = workArea;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUserAcc = new javax.swing.JButton();
        btnManageOrg = new javax.swing.JButton();
        btnEmploye = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUserAcc.setBackground(new java.awt.Color(255, 255, 255));
        btnUserAcc.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnUserAcc.setText("Manage Organization Employees User Accounts");
        btnUserAcc.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnUserAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAccActionPerformed(evt);
            }
        });
        add(btnUserAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 292, 320, 58));

        btnManageOrg.setBackground(new java.awt.Color(255, 255, 255));
        btnManageOrg.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnManageOrg.setText("Manage Organization");
        btnManageOrg.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnManageOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgActionPerformed(evt);
            }
        });
        add(btnManageOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 140, 317, 58));

        btnEmploye.setBackground(new java.awt.Color(255, 255, 255));
        btnEmploye.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnEmploye.setText("Manage Organization Employees");
        btnEmploye.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnEmploye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeActionPerformed(evt);
            }
        });
        add(btnEmploye, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 216, 317, 58));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pharmaceutical");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Management");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Untitled design (3).jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 720));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUserAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAccActionPerformed
        // TODO add your handling code here:
        ManagePharmaUserAccounts mHCU = new ManagePharmaUserAccounts(workArea, enterprise);
        workArea.add("ManagePharmaUserAccounts", mHCU);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnUserAccActionPerformed

    private void btnManageOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgActionPerformed
        // TODO add your handling code here:
        ManagePharmaOrganization mHCO = new ManagePharmaOrganization(workArea, enterprise.getOrganizationDirectory());
        workArea.add("ManagePharmaOrganization", mHCO);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnManageOrgActionPerformed

    private void btnEmployeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeActionPerformed
        // TODO add your handling code here:
        ManagePharmaEmployee mHCE = new ManagePharmaEmployee(workArea, enterprise.getOrganizationDirectory());
        workArea.add("ManagePharmaEmployee", mHCE);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnEmployeActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton btnEmploye;
    private javax.swing.JButton btnManageOrg;
    private javax.swing.JButton btnUserAcc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
