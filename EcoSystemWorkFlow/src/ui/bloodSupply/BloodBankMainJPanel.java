/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.bloodSupply;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public class BloodBankMainJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodBankMainJPanel
     */
     private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private JPanel container;
    public BloodBankMainJPanel(UserAccount userAccount,
     Organization organization,
     Enterprise enterprise,
     EcoSystem system,
     JPanel container) {
        initComponents();
        this.container = container;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewReq = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnViewReq.setBackground(new java.awt.Color(255, 255, 255));
        btnViewReq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnViewReq.setText("VIEW REQUESTS");
        btnViewReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReqActionPerformed(evt);
            }
        });
        add(btnViewReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 151, 211, 59));

        btnManage.setBackground(new java.awt.Color(255, 255, 255));
        btnManage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnManage.setText("MANAGE MANUFACTURE");
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        add(btnManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(333, 245, -1, 59));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Blood Bank");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Main");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Untitled design (4).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReqActionPerformed
        BloodBankManagerWorkAreaJPanel dMW = new BloodBankManagerWorkAreaJPanel(container, userAccount,organization, enterprise, system );
        container.add("DrugProductionManagerWorkAreaJPanel", dMW);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);

    }//GEN-LAST:event_btnViewReqActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        BloodBankOrganizationManagementPanel dMW = new BloodBankOrganizationManagementPanel(container,system, enterprise );
        container.add("PharmaceuticalManagementPanel", dMW);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnManageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnViewReq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
