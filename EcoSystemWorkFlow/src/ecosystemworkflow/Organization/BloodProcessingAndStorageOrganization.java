/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.BloodProcessingAndStorage.BloodProcessingDirectory;
import ecosystemworkflow.Role.DistributionManagerRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author hotragn
 */
public class BloodProcessingAndStorageOrganization extends Organization {
    
     BloodProcessingDirectory bloodProcessingDirectory;
     
     public BloodProcessingAndStorageOrganization(){
         
        super(Organization.OrganizationType.BloodProcessingAndStorageOrganization.getValue());
        bloodProcessingDirectory = new BloodProcessingDirectory();
         
     }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DistributionManagerRole());
        return role; 
    }
    
}
