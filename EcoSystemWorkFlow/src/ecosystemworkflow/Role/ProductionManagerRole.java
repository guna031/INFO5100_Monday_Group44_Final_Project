/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.DrugProductionOrganization;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.pharma.PharmaceuticalWorkAreaJPanel;
import ui.pharma.User.DrugProductionManagerWorkAreaJPanel;

/**
 *
 * @author gunav
 */
public class ProductionManagerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel workArea, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new PharmaceuticalWorkAreaJPanel(workArea, account, (DrugProductionOrganization) organization, enterprise, system);
    }

    @Override
    public String toString() {
        return Role.RoleType.ProductionManagerRole.getValue();
    }
    
}
