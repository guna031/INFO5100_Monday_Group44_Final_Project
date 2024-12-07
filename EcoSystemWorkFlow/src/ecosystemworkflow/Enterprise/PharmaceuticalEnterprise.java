/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Enterprise;

import ecosystemworkflow.Role.ProductionManagerRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class PharmaceuticalEnterprise extends Enterprise {
    
    public PharmaceuticalEnterprise(String name){
        super (name, Enterprise.EnterpriseType.PharmaceuticalManufacturer);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ProductionManagerRole());
        return role; 
    }
    
}
