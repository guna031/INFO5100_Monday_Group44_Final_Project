/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.HeathCare;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.BloodDonationEnterprise;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Network.Network;
import ecosystemworkflow.Organization.BloodCollectionOrganization;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import ecosystemworkflow.WorkFlow.BloodSupplyRequest;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author gunav
 */
public class BloodRequestJPanel extends javax.swing.JPanel {
    
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private JPanel container;

    /**
     * Creates new form BloodRequestJPanel
     */
    public BloodRequestJPanel(JPanel container, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.container = container;
        this.userAccount = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        
        // Initialize blood type combo box
        DefaultComboBoxModel<String> bloodTypeModel = new DefaultComboBoxModel<>();
        bloodTypeModel.addElement("A+");
        bloodTypeModel.addElement("A-");
        bloodTypeModel.addElement("B+");
        bloodTypeModel.addElement("B-");
        bloodTypeModel.addElement("AB+");
        bloodTypeModel.addElement("AB-");
        bloodTypeModel.addElement("O+");
        bloodTypeModel.addElement("O-");
//        cmbBloodType.setModel(bloodTypeModel);
        
        // Initialize priority combo box
        DefaultComboBoxModel<String> priorityModel = new DefaultComboBoxModel<>();
        priorityModel.addElement("Normal");
        priorityModel.addElement("Urgent");
        priorityModel.addElement("Emergency");
//        cmbPriority.setModel(priorityModel);
        
        // Initialize quantity spinner
        SpinnerNumberModel spinnerModel = new SpinnerNumberModel(
            1,     
            1,      
            1000,   
            1       
        );
//        spinQuantity.setModel(spinnerModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 932, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


    private Enterprise findBloodDonationEnterprise() {
        for(Network network : system.getNetworks()) {
            for(Enterprise ent : network.getEnterprises().getEnterpriseList()) {
                if(ent instanceof BloodDonationEnterprise) {
                    return ent;
                }
            }
        }
        return null;
    }
    
    private UserAccount findBloodBankReceiver(Enterprise bloodBank) {
        for(Organization org : bloodBank.getOrganizationDirectory().getOrganizations()) {
            if(org instanceof BloodCollectionOrganization) {
                if(!org.getUserAccountDirectory().getUserAccountList().isEmpty()) {
                    return org.getUserAccountDirectory().getUserAccountList().get(0);
                }
            }
        }
        return null;
    }
    
//    private void clearForm() {
//        spinQuantity.setValue(1);
//        txtLocation.setText("");
//        cmbBloodType.setSelectedIndex(0);
//        cmbPriority.setSelectedIndex(0);
//    }
    
}
