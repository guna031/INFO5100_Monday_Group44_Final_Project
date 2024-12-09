/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import UserInterface.BloodDonation.BloodDistributionManagerWorkAreaJPanel;
import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.bloodSupply.BloodBankMainJPanel;

/**
 *
 * @author gunav
 */
public class DistributionManagerRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem system) {
        return new BloodBankMainJPanel(
                account, 
                organization, 
                enterprise,
                system, userProcessContainer);
    }
    
    @Override
    public String toString() {
        return Role.RoleType.DistributionManagerRole.getValue();
    }
    
    
}
