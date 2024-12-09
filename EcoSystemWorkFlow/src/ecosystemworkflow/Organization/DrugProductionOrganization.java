/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.DrugProduction.DrugProductionDirectory;
import ecosystemworkflow.Role.HospitalAdministratorRole;
import ecosystemworkflow.Role.ProductionManagerRole;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.WorkFlow.DrugProductionRequest;
import ecosystemworkflow.WorkFlow.QualityControlAndAssuranceRequest;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class DrugProductionOrganization extends Organization {
    
    DrugProductionDirectory drugProductionList;
    
  
    
    public DrugProductionOrganization()
    {
        super(Organization.OrganizationType.DrugProductionOrganization.getValue());
        drugProductionList = new DrugProductionDirectory();
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ProductionManagerRole());
        return role; 
    }
    
    
    
}
