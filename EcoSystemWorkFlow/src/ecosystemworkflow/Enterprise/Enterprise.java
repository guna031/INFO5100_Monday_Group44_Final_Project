/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Enterprise;

import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Organization.OrganizationDirectory;

/**
 *
 * @author gunav
 */
public abstract class Enterprise extends Organization{
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    
    public Enterprise(String name, EnterpriseType type)
    {
      super(name);
      this.enterpriseType= type;
      this.organizationDirectory = new OrganizationDirectory();
      
    }
    
     public enum EnterpriseType 
     {
        PharmaceuticalManufacturer("Pharmaceutical Manufacturer"),
        LogisticsService("Logistics Service"),
        HealthcareService("Healthcare Service"),
        BloodDonation("Blood Donation"),
        ResearchAndDevelopment("Research and Development");
        
        
        private String value;
        
        private EnterpriseType(String value)
        {
            this.value = value;
        }

        public String getValue() 
        {
            return value;
        }
        
        @Override
        public String toString()
        {
            return value;
        }
     }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
}
