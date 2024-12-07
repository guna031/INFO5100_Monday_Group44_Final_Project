package ecosystemworkflow;

import ecosystemworkflow.Employee.Employee;
import ecosystemworkflow.Enterprise.BloodDonationEnterprise;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Enterprise.HealthCareEnterprise;
import ecosystemworkflow.Enterprise.LogisticEnterprise;
import ecosystemworkflow.Enterprise.PharmaceuticalEnterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Role.SystemAdminRole;
import ecosystemworkflow.UserAccount.UserAccount;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gunav
 */
public class ConfigureASystem {
    
     public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();
        
        // Create admin
        Employee employee = system.getEmployeeDirectory().createEmployee("Admin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        
        // Create Hospital Enterprise
        HealthCareEnterprise hospital = (HealthCareEnterprise) system.getNetworks().get(0).getEnterprises()
                .createAndAddEnterprise("Hospital", Enterprise.EnterpriseType.HealthcareService);
                
        // Create Hospital Organizations
        Organization hospitalOrg = hospital.getOrganizationDirectory()
                .createOrganization(Organization.OrganizationType.HospitalAdministrationOrganization, "HospitalAdministrationOrganization");
                
        // Create Pharmaceutical Enterprise
        PharmaceuticalEnterprise pharma = (PharmaceuticalEnterprise) system.getNetworks().get(0).getEnterprises()
                .createAndAddEnterprise("Pharmaceutical", Enterprise.EnterpriseType.PharmaceuticalManufacturer);
                
        // Create Pharmaceutical Organizations
        Organization drugProductionOrg = pharma.getOrganizationDirectory()
                .createOrganization(Organization.OrganizationType.DrugProductionOrganization, "DrugProductionOrganization");
        Organization qaOrg = pharma.getOrganizationDirectory()
                .createOrganization(Organization.OrganizationType.QualityControlAndAssuranceOrganization, "QualityControlAndAssuranceOrganization");
                
        // Create Blood Bank Enterprise
        BloodDonationEnterprise bloodBank = (BloodDonationEnterprise) system.getNetworks().get(0).getEnterprises()
                .createAndAddEnterprise("BloodBank", Enterprise.EnterpriseType.BloodDonation);
                
        // Create Blood Bank Organizations
        Organization bloodBankOrg = bloodBank.getOrganizationDirectory().createOrganization(Organization.OrganizationType.BloodProcessingAndStorageOrganization, "Blood Processing");
                
        // Create Transport Enterprise
        LogisticEnterprise transport = (LogisticEnterprise) system.getNetworks().get(0).getEnterprises()
                .createAndAddEnterprise("Transport", Enterprise.EnterpriseType.LogisticsService);
                
        // Create Transport Organizations
        Organization transportOrg = transport.getOrganizationDirectory()
                .createOrganization(Organization.OrganizationType.TransportOrganization, "TransportOrganization");
        
        return system;
    }
    
}
