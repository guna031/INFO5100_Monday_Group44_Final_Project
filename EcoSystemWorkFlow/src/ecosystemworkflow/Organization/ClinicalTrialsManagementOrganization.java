/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.ClinicalTrialsManagement.ClinicalTrialsManagementDirectory;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.Role.TrailCoordinatorRole;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class ClinicalTrialsManagementOrganization extends Organization {
    
    ClinicalTrialsManagementDirectory clinicalTrialsManagementDirectory;
    
    public ClinicalTrialsManagementOrganization(){
        
        super(Organization.OrganizationType.ClinicalTrialsManagementOrganization.getValue());
        clinicalTrialsManagementDirectory = new ClinicalTrialsManagementDirectory();
        
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new TrailCoordinatorRole());
        return role; 
    }
}
