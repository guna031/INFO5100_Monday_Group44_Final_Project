/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;
import ui.admin.SystemAdminWorkAreaJPanel;

/**
 *
 * @author gunav
 */
public class SystemAdminRole extends Role {
    
    
     @Override
    public JPanel createWorkArea(JPanel container, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(container, system);
    }
    
    @Override
    public String toString() {
        return "System Admin Role";
    }
    
    
}
