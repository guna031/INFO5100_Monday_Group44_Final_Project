/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthCare.User;

import UserInterface.HeathCare.User.*;
import UserInterface.HeathCare.*;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.WorkFlow.DrugProductionRequest;
import javax.swing.JOptionPane;

/**
 *
 * @author gunav
 */
public class UpdateRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateRequestJPanel
     */
    public UpdateRequestJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdate = new javax.swing.JButton();
        labelDrugName = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        labelQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblRequired = new javax.swing.JLabel();
        txtRequired = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cmbPriority = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnUpdate.setText("Update Request");
        btnUpdate.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 134, -1));

        labelDrugName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labelDrugName.setText("Drug Name");
        add(labelDrugName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 70, 20));

        txtDrugName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugNameActionPerformed(evt);
            }
        });
        add(txtDrugName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 118, -1));

        labelQuantity.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labelQuantity.setText("Quantity");
        add(labelQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 60, 20));

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });
        add(txtQuantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 118, -1));

        lblRequired.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblRequired.setText("Required by");
        add(lblRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 80, 20));

        txtRequired.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequiredActionPerformed(evt);
            }
        });
        add(txtRequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 118, -1));

        lblStatus.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lblStatus.setText("Priority");
        add(lblStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 250, -1, 30));

        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(cmbPriority, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 118, -1));

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 60, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Drug Production");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Request");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Untitled design (6).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        setFieldsEditable(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtDrugNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void txtRequiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequiredActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequiredActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel labelDrugName;
    private javax.swing.JLabel labelQuantity;
    private javax.swing.JLabel lblRequired;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtRequired;
    // End of variables declaration//GEN-END:variables


      private void setFieldsEditable(boolean editable) {
        txtDrugName.setEditable(editable);
        txtQuantity.setEditable(editable);
        cmbPriority.setEnabled(editable);
        btnSave.setEnabled(editable);
    }
}
