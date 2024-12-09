/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.ClinicalOrganization;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.HealthCare.ClinicalOrganizationReviewPanel;

/**
 *
 * @author gunav
 */
public class ClinicalOrganizationRole extends Role{
    
     @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new ClinicalOrganizationReviewPanel(workArea, account, (ClinicalOrganization) organization, enterprise, system);
    }

    @Override
    public String toString() {
        return Role.RoleType.ClinicalOrganizationRole.getValue();
    }
    
}
