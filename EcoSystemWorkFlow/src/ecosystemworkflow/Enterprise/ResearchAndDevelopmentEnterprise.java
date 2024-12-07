/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Enterprise;

import ecosystemworkflow.Role.ChemicalCompoundResearcherRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class ResearchAndDevelopmentEnterprise extends Enterprise{
    
    public ResearchAndDevelopmentEnterprise(String name){
        super (name, Enterprise.EnterpriseType.ResearchAndDevelopment);
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ChemicalCompoundResearcherRole());
        return role; 
    }
    
}
