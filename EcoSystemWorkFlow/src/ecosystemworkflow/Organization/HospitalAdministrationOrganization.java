/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.HospitalAdmin.HospitalAdminDirectory;
import ecosystemworkflow.Role.HospitalAdministratorRole;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.UserAccount.UserAccount;
import ecosystemworkflow.WorkFlow.DrugProductionRequest;
import ecosystemworkflow.WorkFlow.WorkRequest;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author gunav
 */
public class HospitalAdministrationOrganization extends Organization{
    
    HospitalAdminDirectory hospitalAdminDirectory;
    
    public HospitalAdministrationOrganization(){
        
        super (Organization.OrganizationType.HospitalAdministrationOrganization.getValue());
        hospitalAdminDirectory = new HospitalAdminDirectory();
        
    }
    

    public HospitalAdminDirectory getHospitalAdminDirectory() {
        return hospitalAdminDirectory;
    }

    public void setHospitalAdminDirectory(HospitalAdminDirectory hospitalAdminDirectory) {
        this.hospitalAdminDirectory = hospitalAdminDirectory;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new HospitalAdministratorRole());
        return role; 
    }
    
}

    
    
    

