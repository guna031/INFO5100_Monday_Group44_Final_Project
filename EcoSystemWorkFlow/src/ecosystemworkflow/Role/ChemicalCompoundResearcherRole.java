/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import UserInterface.research.ChemicalResearchWorkAreaJPanel;
import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author varun
 */
public class ChemicalCompoundResearcherRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem system) {
        return new ChemicalResearchWorkAreaJPanel(userProcessContainer, 
                account, 
                organization, 
                enterprise,
                system);
    }
    
    @Override
    public String toString() {
        return Role.RoleType.ChemicalCompoundResearcherRole.getValue();
    }
    
}