/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.BloodCollection.BloodCollectionDirectory;
import ecosystemworkflow.Role.PhlebotomistRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author hotragn
 */
public class BloodCollectionOrganization extends Organization{
    
    BloodCollectionDirectory bloodCollectionDirectory;
    
    public BloodCollectionOrganization()
    {
        super(Organization.OrganizationType.BloodCollectionOrganization.getValue());
        bloodCollectionDirectory = new BloodCollectionDirectory();
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new PhlebotomistRole());
        return role; 
    }
    
    
}
