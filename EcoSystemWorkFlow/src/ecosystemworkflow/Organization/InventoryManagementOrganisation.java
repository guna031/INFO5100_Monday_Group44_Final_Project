/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.InventoryManagement.InventoryManagementDirectory;
import ecosystemworkflow.Role.HospitalAdministratorRole;
import ecosystemworkflow.Role.InventoryAnalystManagementRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author hotragn
 */
public class InventoryManagementOrganisation extends Organization{
    
    InventoryManagementDirectory inventoryManagementDirectory;
    
    public InventoryManagementOrganisation(){
    super(Organization.OrganizationType.InventoryManagementOrganisation.getValue());
    inventoryManagementDirectory = new InventoryManagementDirectory();
    
            }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new InventoryAnalystManagementRole());
        return role; 
    }
    
}
