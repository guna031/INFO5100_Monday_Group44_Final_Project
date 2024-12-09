/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Role;

import ecosystemworkflow.EcoSystem;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author gunav
 */
public abstract class Role {
    
     public enum RoleType{
        ProductionManagerRole("Production Manager Role"),
        QualityAnalystRole("Quality Analyst Role"),
        LogisticsCoordinatorRole("Logistics Coordinator Role"),
        InventoryAnalystRole("Inventory Analyst Role"),
        HospitalAdministratorRole("Hospital Administrator Role"),
        ClinicalOrganizationRole("Clinical Organization Role"),
        PhlebotomistRole("Phlebotomist Role"),
        DistributionManagerRole("Distribution Manager Role"),
        ChemicalCompoundResearcherRole("Chemical Compound Researcher Role"),
        TrialCoordinatorRole("Trial Coordinator Role"),
        SystemAdministratorRole("System Administrator Role"),
        AdminOrganizationRole("Admin Organization Role");

        
        
        
        private String value;
        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
         public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system);

    
}
