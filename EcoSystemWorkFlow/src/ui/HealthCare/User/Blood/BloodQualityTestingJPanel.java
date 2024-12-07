/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthCare.User.Blood;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Network.Network;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Organization.TransportOrganization;
import ecosystemworkflow.UserAccount.UserAccount;
import ecosystemworkflow.WorkFlow.BloodSupplyRequest;
import ecosystemworkflow.WorkFlow.TransportOrganizationRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public class BloodQualityTestingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BloodQualityTestingJPanel
     */
    private UserAccount userAccount;
    private Organization organization;
    private JPanel container;
    private BloodSupplyRequest request;
    private EcoSystem system;
    
    public BloodQualityTestingJPanel(JPanel container, UserAccount account, 
            Organization organization, BloodSupplyRequest request, EcoSystem system) {
        initComponents();
        this.container = container;
        this.userAccount = account;
        this.organization = organization;
        this.request = request;
        this.system = system;
        populateRequestDetails();
    }
    
      
    private void populateRequestDetails() {
        txtBloodType.setText(request.getBloodType());
        txtQuantity.setText(String.valueOf(request.getQuantity()));
        txtTemperature.setText(String.valueOf(request.getTemperature()));
        txtStorageReq.setText(request.getStorageRequirements());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBloodType = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity1 = new javax.swing.JLabel();
        txtTemperature = new javax.swing.JTextField();
        lblStorageReq = new javax.swing.JLabel();
        txtStorageReq = new javax.swing.JTextField();
        btnProcess = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        chkPassed = new javax.swing.JCheckBox();

        jLabel1.setText("Blood Type:");

        lblQuantity.setText("Quantity: ");

        lblQuantity1.setText("Temperature:");

        lblStorageReq.setText("Storage Requirement: ");

        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        txtComments.setColumns(20);
        txtComments.setRows(5);
        jScrollPane1.setViewportView(txtComments);

        jLabel2.setText("Comments:");

        chkPassed.setText("QA Passed");
        chkPassed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPassedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantity1)
                                .addGap(24, 24, 24)
                                .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblQuantity)
                                    .addGap(24, 24, 24)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStorageReq)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtStorageReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProcess)
                            .addComponent(chkPassed)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chkPassed))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuantity1)
                            .addComponent(txtTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnProcess)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStorageReq)
                    .addComponent(txtStorageReq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        if(txtComments.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add testing comments");
            return;
        }
        
        try {
            request.setPatientCondition(txtComments.getText().trim());
            request.setTemperature(Double.parseDouble(txtTemperature.getText()));
            request.setStorageRequirements(txtStorageReq.getText());
            request.setStatus(chkPassed.isSelected() ? "QA Passed" : "Failed");
            
            if(chkPassed.isSelected()) {
                TransportOrganizationRequest transportRequest = new TransportOrganizationRequest();
                transportRequest.setMessage("Transport for Blood Type: " + request.getBloodType());
                transportRequest.setSender(userAccount);
                transportRequest.setItemType("Blood");
                transportRequest.setQuantity(request.getQuantity());
                transportRequest.setStatus("Pending Pickup");
                transportRequest.setRequiresRefrigeration(true);
                
                  Organization transportOrg = null;
                for(Network network : system.getNetworks()) {
                    for(Enterprise ent : network.getEnterprises().getEnterpriseList()) {
                        for(Organization org : ent.getOrganizationDirectory().getOrganizations()) {
                            if(org instanceof TransportOrganization) {
                                transportOrg = org;
                                break;
                            }
                        }
                    }
                }

                
                if(transportOrg != null) {
                    transportOrg.getWorkRequestList().addWorkRequest(transportRequest);
                    request.setStatus("Awaiting Transport");
                    JOptionPane.showMessageDialog(null, "QA Passed - Transport request created");
                }
            }
            
            container.remove(this);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.previous(container);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error processing request: " + e.getMessage());
        }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void chkPassedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPassedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPassedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JCheckBox chkPassed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblQuantity1;
    private javax.swing.JLabel lblStorageReq;
    private javax.swing.JTextField txtBloodType;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStorageReq;
    private javax.swing.JTextField txtTemperature;
    // End of variables declaration//GEN-END:variables
}
