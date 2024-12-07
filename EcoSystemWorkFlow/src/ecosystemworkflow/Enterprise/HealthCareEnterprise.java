/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Enterprise;

import ecosystemworkflow.Role.HospitalAdministratorRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class HealthCareEnterprise extends Enterprise{
    
    public HealthCareEnterprise(String name){
        super (name, Enterprise.EnterpriseType.HealthcareService);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new HospitalAdministratorRole());
        return role; 
    }
    
}
