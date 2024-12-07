/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Enterprise;

import ecosystemworkflow.Role.InventoryAnalystManagementRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class LogisticEnterprise extends Enterprise {
  
    public LogisticEnterprise(String name){
    super (name, Enterprise.EnterpriseType.LogisticsService);
}
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new InventoryAnalystManagementRole());
        return role; 
    }
}
