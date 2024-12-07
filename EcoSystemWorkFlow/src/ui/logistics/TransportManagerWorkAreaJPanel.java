/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.logistics;

import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import ecosystemworkflow.WorkFlow.TransportOrganizationRequest;
import ecosystemworkflow.WorkFlow.WorkRequest;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gunav
 */
public class TransportManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransportManagerWorkAreaJPanel
     */
     private UserAccount userAccount;
    private Organization organization;
    private JPanel container;
    
    public TransportManagerWorkAreaJPanel(JPanel container, UserAccount account, 
            Organization organization) {
        initComponents();
        this.container = container;
        this.userAccount = account;
        this.organization = organization;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProcess = new javax.swing.JButton();
        btnProcess1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransportRequests = new javax.swing.JTable();

        btnProcess.setText("Delivery");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        btnProcess1.setText("ProcessRequest");
        btnProcess1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcess1ActionPerformed(evt);
            }
        });

        tblTransportRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tblTransportRequests);

        jScrollPane2.setViewportView(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(471, Short.MAX_VALUE)
                .addComponent(btnProcess1)
                .addGap(18, 18, 18)
                .addComponent(btnProcess)
                .addGap(246, 246, 246))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(230, 230, 230)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(230, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(312, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProcess)
                    .addComponent(btnProcess1))
                .addGap(165, 165, 165))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(165, 165, 165)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(207, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblTransportRequests.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        
        TransportOrganizationRequest request = (TransportOrganizationRequest)
            tblTransportRequests.getValueAt(selectedRow, 0);
            
        request.setStatus("Delivered");
        request.setDateOfResolving(new Date());
        
        populateTable();
        JOptionPane.showMessageDialog(null, "Delivery completed");
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnProcess1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcess1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblTransportRequests.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a request");
            return;
        }
        
        TransportOrganizationRequest request = (TransportOrganizationRequest)
            tblTransportRequests.getValueAt(selectedRow, 0);
            
        request.setStatus("In Transit");
        request.setPickupTime(new Date());
        
        // Set delivery time based on priority
        if(request.getPriority().equals("Emergency")) {
            request.setDeliveryTime(new Date(System.currentTimeMillis() + (4 * 60 * 60 * 1000))); // 4 hours
        } else if(request.getPriority().equals("Urgent")) {
            request.setDeliveryTime(new Date(System.currentTimeMillis() + (12 * 60 * 60 * 1000))); // 12 hours
        } else {
            request.setDeliveryTime(new Date(System.currentTimeMillis() + (24 * 60 * 60 * 1000))); // 24 hours
        }
        
        populateTable();
        JOptionPane.showMessageDialog(null, "Delivery scheduled");
    }//GEN-LAST:event_btnProcess1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnProcess1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblTransportRequests;
    // End of variables declaration//GEN-END:variables


    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblTransportRequests.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkRequestList().getWorkRequests()) {
            if(request instanceof TransportOrganizationRequest) {
                TransportOrganizationRequest tr = (TransportOrganizationRequest) request;
                Object[] row = new Object[6];
                row[0] = tr;
                row[1] = tr.getItemType();
                row[2] = tr.getQuantity();
                row[3] = tr.getPriority();
                row[4] = tr.getStatus();
                row[5] = tr.getPickupLocation();
                model.addRow(row);
            }
        }
    }
}
