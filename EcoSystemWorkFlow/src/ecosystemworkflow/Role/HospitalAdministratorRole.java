/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.HospitalAdministrationOrganization;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.HealthCare.HospitalAdminWorkAreaJPanel;

/**
 *
 * @author gunav
 */
public class HospitalAdministratorRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new HospitalAdminWorkAreaJPanel(account, (HospitalAdministrationOrganization) organization, enterprise, system, workArea);
    }

    @Override
    public String toString() {
        return Role.RoleType.HospitalAdministratorRole.getValue();
    }
    
    
    
}
