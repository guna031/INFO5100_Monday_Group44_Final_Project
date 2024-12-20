/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HealthCare.User;

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
public class HospitalDeliveryConfirmationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalDeliveryConfirmationJPanel
     */
    private UserAccount userAccount;
    private Organization organization;
    private JPanel container;
    
    public HospitalDeliveryConfirmationJPanel(JPanel container, UserAccount account, 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDeliveries = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDeliveries.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Trail ID", "Blood Type", "Quantity", "Delivery Time", "Sender"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveries);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 125, -1, 239));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jButton1.setText("Confirm Delivery");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 255, 255), java.awt.Color.white));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hospital");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delivery Confirmation");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui/images/Untitled design (2).jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDeliveries.getSelectedRow();
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a delivery");
            return;
        }

        TransportOrganizationRequest request = (TransportOrganizationRequest)
        tblDeliveries.getValueAt(selectedRow, 0);

        request.setStatus("Received");
        request.setDateOfResolving(new Date());

        populateTable();
        JOptionPane.showMessageDialog(null, "Delivery receipt confirmed");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDeliveries;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblDeliveries.getModel();
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkRequestList().getWorkRequests()) {
            if(request instanceof TransportOrganizationRequest) {
                TransportOrganizationRequest tr = (TransportOrganizationRequest) request;
                if(tr.getStatus().equals("Delivered")) {
                    Object[] row = new Object[5];
                    row[0] = tr;
                    row[1] = tr.getItemType();
                    row[2] = tr.getQuantity();
                    row[3] = tr.getDeliveryTime();
                    row[4] = tr.getSender().getEmployee().getName();
                    model.addRow(row);
                }
            }
        }
    }}
