/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.pharma.QA;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Network.Network;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Organization.TransportOrganization;
import ecosystemworkflow.UserAccount.UserAccount;
import ecosystemworkflow.WorkFlow.QualityControlAndAssuranceRequest;
import ecosystemworkflow.WorkFlow.TransportOrganizationRequest;
import java.awt.CardLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public class ProcessQARequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProcessQARequestJPanel
     */
    private UserAccount userAccount;
    private Organization organization;
    private JPanel container;
    private QualityControlAndAssuranceRequest request;
    private EcoSystem system;
    
    public ProcessQARequestJPanel(JPanel container, UserAccount account, 
            Organization organization, QualityControlAndAssuranceRequest request, EcoSystem system) {
        initComponents();
        this.container = container;
        this.userAccount = account;
        this.organization = organization;
        this.request = request;
        this.system = system;
        
        
        populateRequestDetails();
        setupGradeComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtManufacturer = new javax.swing.JTextField();
        lblManufacturer = new javax.swing.JLabel();
        lblComments = new javax.swing.JLabel();
        txtBatchNum = new javax.swing.JTextField();
        cmbQuality = new javax.swing.JComboBox<>();
        lblStatus = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCommentsArea = new javax.swing.JTextArea();
        labelDrugName = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        txtStatus = new javax.swing.JTextField();
        lblQualityGrade = new javax.swing.JLabel();
        labelQuantity = new javax.swing.JLabel();
        chkPassed = new javax.swing.JCheckBox();
        lblBatchNum = new javax.swing.JLabel();
        btnUpdateStatus = new javax.swing.JButton();
        txtBatchSize = new javax.swing.JTextField();

        lblManufacturer.setText("Manufacturer:");

        lblComments.setText("Comments:");

        txtBatchNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchNumActionPerformed(evt);
            }
        });

        cmbQuality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblStatus.setText("Status");

        txtCommentsArea.setColumns(20);
        txtCommentsArea.setRows(5);
        jScrollPane1.setViewportView(txtCommentsArea);

        jScrollPane2.setViewportView(jScrollPane1);

        labelDrugName.setText("Drug Name:");

        txtDrugName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugNameActionPerformed(evt);
            }
        });

        lblQualityGrade.setText("Quality Grade:");

        labelQuantity.setText("Batch Size:");

        chkPassed.setText("pass");
        chkPassed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkPassedActionPerformed(evt);
            }
        });

        lblBatchNum.setText("Batch Number:");

        btnUpdateStatus.setText("update");
        btnUpdateStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateStatusActionPerformed(evt);
            }
        });

        txtBatchSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBatchSizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblManufacturer)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDrugName)
                                .addGap(18, 18, 18)
                                .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBatchNum)
                                .addGap(18, 18, 18)
                                .addComponent(txtBatchNum, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelQuantity)
                                .addGap(18, 18, 18)
                                .addComponent(txtBatchSize, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addGap(18, 18, 18)
                                .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQualityGrade)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbQuality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(chkPassed)
                                .addGap(8, 8, 8))
                            .addComponent(btnUpdateStatus)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblComments, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(164, 164, 164)))
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBatchNum)
                    .addComponent(txtBatchNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbQuality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQualityGrade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDrugName)
                    .addComponent(txtDrugName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantity)
                    .addComponent(txtBatchSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkPassed))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdateStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacturer)
                    .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblComments)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBatchNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchNumActionPerformed

    private void txtDrugNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugNameActionPerformed

    private void chkPassedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkPassedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkPassedActionPerformed

    private void btnUpdateStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateStatusActionPerformed
        // TODO add your handling code here:
         if(txtCommentsArea.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please add inspection comments");
            return;
        }
        
        try {
            request.setInspectorComments(txtCommentsArea.getText().trim());
            request.setQualityGrade(cmbQuality.getSelectedItem().toString());
            request.setPassedQualityCheck(chkPassed.isSelected());
            
            if(request.isPassedQualityCheck()) {
                TransportOrganizationRequest transportRequest = new TransportOrganizationRequest();
                transportRequest.setMessage("Transport for " + request.getBatchNumber());
                transportRequest.setSender(userAccount);
                transportRequest.setItemType(request.getDrugName());
                transportRequest.setQuantity(request.getBatchSize());
                transportRequest.setStatus("Pending Pickup");
                
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
            } else {
                request.setStatus("Failed QA Check");
                JOptionPane.showMessageDialog(null, "QA Failed - Drug production needs revision");
            }
            
            container.remove(this);
            CardLayout layout = (CardLayout) container.getLayout();
            layout.previous(container);
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error updating status: " + e.getMessage());
        }
       
    }//GEN-LAST:event_btnUpdateStatusActionPerformed

    private void txtBatchSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBatchSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBatchSizeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateStatus;
    private javax.swing.JCheckBox chkPassed;
    private javax.swing.JComboBox<String> cmbQuality;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelDrugName;
    private javax.swing.JLabel labelQuantity;
    private javax.swing.JLabel lblBatchNum;
    private javax.swing.JLabel lblComments;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblQualityGrade;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField txtBatchNum;
    private javax.swing.JTextField txtBatchSize;
    private javax.swing.JTextArea txtCommentsArea;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void setupGradeComboBox() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("A");
        model.addElement("B");
        model.addElement("C");
        model.addElement("D");
        model.addElement("F");
        cmbQuality.setModel(model);
    }
    
    private void populateRequestDetails() {
        txtBatchNum.setText(request.getBatchNumber());
        txtDrugName.setText(request.getDrugName());
        txtBatchSize.setText(String.valueOf(request.getBatchSize()));
        txtManufacturer.setText(request.getSender().getEmployee().getName());
    }
}