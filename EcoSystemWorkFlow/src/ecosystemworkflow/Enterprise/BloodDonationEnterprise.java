/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Enterprise;

import ecosystemworkflow.Role.DistributionManagerRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class BloodDonationEnterprise extends Enterprise {
    
    public BloodDonationEnterprise(String name){
        super (name, Enterprise.EnterpriseType.BloodDonation);
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new DistributionManagerRole());
        return role; 
    }
    
    
}
