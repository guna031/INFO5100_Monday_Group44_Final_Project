/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.QualityControl.QualityControlDirectory;
import ecosystemworkflow.Role.HospitalAdministratorRole;
import ecosystemworkflow.Role.QualityAnalystRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class QualityControlAndAssuranceOrganization extends Organization{
    
    QualityControlDirectory qualityControl;
    
    public QualityControlAndAssuranceOrganization(){
        
        super (Organization.OrganizationType.QualityControlAndAssuranceOrganization.getValue());
        qualityControl = new QualityControlDirectory();
        
        
    }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new QualityAnalystRole());
        return role; 
    }
    
}
