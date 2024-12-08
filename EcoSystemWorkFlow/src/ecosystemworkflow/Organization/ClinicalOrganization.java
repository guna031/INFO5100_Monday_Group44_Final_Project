/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.ClinicalUnit.ClinicalUnit;
import ecosystemworkflow.Role.ClinicalOrganizationRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author hotragn
 */
public class ClinicalOrganization extends Organization{
    
    ClinicalUnit clinicalUnit;
    
    public ClinicalOrganization(){
        
        super(Organization.OrganizationType.ClinicalOrganization.getValue());
        clinicalUnit = new ClinicalUnit();
        
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ClinicalOrganizationRole());
        return role; 
    }
    
}
