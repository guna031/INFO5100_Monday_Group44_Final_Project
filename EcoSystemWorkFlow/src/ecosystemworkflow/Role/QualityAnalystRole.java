/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import UserInterface.Pharmaceutical.QualityAnalystWorkAreaJPanel;
import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Organization.QualityControlAndAssuranceOrganization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author varun
 */
public class QualityAnalystRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new QualityAnalystWorkAreaJPanel(workArea, account, (QualityControlAndAssuranceOrganization) organization, enterprise, system);
    }

    @Override
    public String toString() {
        return Role.RoleType.QualityAnalystRole.getValue();
    }
    
}
