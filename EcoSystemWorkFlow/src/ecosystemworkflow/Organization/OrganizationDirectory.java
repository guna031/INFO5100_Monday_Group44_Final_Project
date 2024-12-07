/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import java.util.ArrayList;

/**
 *
 * @author hotragn
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizations;

    public ArrayList<Organization> getOrganizations() {
        return organizations;
    }

    public Organization createOrganization(Organization.OrganizationType type,String name)
     {
         Organization organization = null;
         if (type.getValue().equals(Organization.OrganizationType.DrugProductionOrganization.getValue())){

             organization = new DrugProductionOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization); 
         }
         else if (type.getValue().equals(Organization.OrganizationType.BloodCollectionOrganization.getValue())){
             organization = new BloodCollectionOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }

         else if (type.getValue().equals(Organization.OrganizationType.BloodProcessingAndStorageOrganization.getValue())){
             organization = new BloodProcessingAndStorageOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }

         else if (type.getValue().equals(Organization.OrganizationType.ChemicalCompoundResearchOrganization.getValue())){
             organization = new ChemicalCompoundResearchOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }
         else if (type.getValue().equals(Organization.OrganizationType.ClinicalOrganization.getValue())){
             organization = new ClinicalOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }
         else if (type.getValue().equals(Organization.OrganizationType.ClinicalTrialsManagementOrganization.getValue())){
             organization = new ClinicalTrialsManagementOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }

         else if (type.getValue().equals(Organization.OrganizationType.HospitalAdministrationOrganization.getValue())){
             organization = new HospitalAdministrationOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }

         else if (type.getValue().equals(Organization.OrganizationType.InventoryManagementOrganisation.getValue())){
             organization = new InventoryManagementOrganisation();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }

         else if (type.getValue().equals(Organization.OrganizationType.QualityControlAndAssuranceOrganization.getValue())){
             organization = new QualityControlAndAssuranceOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }

         else if (type.getValue().equals(Organization.OrganizationType.TransportOrganization.getValue())){
             organization = new TransportOrganization();
             organization.setOrganizationName(name);
             organizations.add(organization);
         }


         return organization;
     }
    
    
    
}
