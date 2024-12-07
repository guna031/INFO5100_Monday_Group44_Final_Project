/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.Role.HospitalAdministratorRole;
import ecosystemworkflow.Role.LogisticsCoordinatorRole;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.Transport.TransportationDirectory;
import java.util.HashSet;

/**
 *
 * @author hotragn
 */
public class TransportOrganization extends Organization{
    
    TransportationDirectory transportDirectory;
    
    public TransportOrganization(){
        super(Organization.OrganizationType.TransportOrganization.getValue());
        transportDirectory = new TransportationDirectory();
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new LogisticsCoordinatorRole());
        return role; 
    }
    
}
