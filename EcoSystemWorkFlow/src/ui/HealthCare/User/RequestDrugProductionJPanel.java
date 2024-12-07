/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthCare.User;

import UserInterface.HeathCare.User.ViewDrugRequestsJPanel;
import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.DrugProductionOrganization;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import ecosystemworkflow.WorkFlow.DrugProductionRequest;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public class RequestDrugProductionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestDrugProductionJPanel
     */
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private JPanel container;

    /**
     * Creates new form RequestDrugProductionJPanel
     */
    public RequestDrugProductionJPanel(JPanel container, UserAccount account,
            Organization organization, Enterprise enterprise, EcoSystem system) {

        initComponents();
        this.container = container;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("Normal");
        model.addElement("Urgent");
        model.addElement("Emergency");
        cmbPriority.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonSubmit = new javax.swing.JButton();
        labelDrugName = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        labelQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        cmbPriority = new javax.swing.JComboBox<>();
        buttonViewReq = new javax.swing.JButton();

        buttonSubmit.setText("Submit Request");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        labelDrugName.setText("Drug Name");

        txtDrugName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugNameActionPerformed(evt);
            }
        });

        labelQuantity.setText("Quantity");

        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        lblStatus.setText("Priority");

        cmbPriority.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        buttonViewReq.setText("View Requests");
        buttonViewReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonViewReqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(357, 357, 357)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelQuantity)
                        .addGap(18, 18, 18)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDrugName)
                        .addGap(18, 18, 18)
                        .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addGap(18, 18, 18)
                        .addComponent(cmbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(buttonViewReq)
                        .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDrugName)
                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbPriority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addGap(41, 41, 41)
                .addComponent(buttonSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonViewReq)
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        if(txtDrugName.getText().isEmpty() || txtQuantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill out all details");
            return;
        }
        
        try {
            String drugName = txtDrugName.getText().trim();
            String priority = (String) cmbPriority.getSelectedItem();
            int quantity = Integer.parseInt(txtQuantity.getText());
            
            if(quantity <= 0) {
                JOptionPane.showMessageDialog(null, "Quantity must be greater than 0");
                return;
            }
            
            DrugProductionRequest request = new DrugProductionRequest();
            request.setMessage("Request for " + quantity + " units of " + drugName);
            request.setSender(userAccount);
            request.setDrugName(drugName);
            request.setQuantity(quantity);
            request.setUrgency(priority);
            request.setStatus("Pending");
            request.setDateOfRequest(new Date());
            
            Organization org = null;
            for(Organization organization : enterprise.getOrganizationDirectory().getOrganizations()) {
                if(organization instanceof DrugProductionOrganization) {
                    org = organization;
                    break;
                }
            }
            
            if(org != null) {
                org.getWorkRequestList().addWorkRequest(request);
                userAccount.getWorkQueue().addWorkRequest(request);
                JOptionPane.showMessageDialog(null, "Request sent to Production Team");
                clearForm();
            }
            
        } catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter quantity in correct format");
        }
        
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void txtDrugNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugNameActionPerformed

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void buttonViewReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonViewReqActionPerformed
        ViewDrugRequestsJPanel viewPanel = new ViewDrugRequestsJPanel(container, userAccount,
            organization, enterprise, system);
        container.add("ViewDrugRequests", viewPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_buttonViewReqActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JButton buttonViewReq;
    private javax.swing.JComboBox<String> cmbPriority;
    private javax.swing.JLabel labelDrugName;
    private javax.swing.JLabel labelQuantity;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables


       private void clearForm() {
        txtDrugName.setText("");
        txtQuantity.setText("");
        cmbPriority.setSelectedIndex(0);
    }
}
