/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import UserInterface.logistics.LogisticsCoordinatorWorkAreaJPanel;
import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Organization.TransportOrganization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public class LogisticsCoordinatorRole extends Role {
    
     @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new LogisticsCoordinatorWorkAreaJPanel(workArea, account, (TransportOrganization) organization, enterprise, system);
    }

    @Override
    public String toString() {
        return Role.RoleType.LogisticsCoordinatorRole.getValue();
    }
    
}
