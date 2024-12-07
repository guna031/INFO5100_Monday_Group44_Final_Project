/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterprises;
    
     public EnterpriseDirectory()
    {
        enterprises = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterprises;
    }
    
     public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.PharmaceuticalManufacturer){
           enterprise = new PharmaceuticalEnterprise(name);
           enterprises.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.BloodDonation){
            enterprise= new BloodDonationEnterprise(name);
            enterprises.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.HealthcareService){
          enterprise= new HealthCareEnterprise(name);
            enterprises.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.LogisticsService){
            enterprise= new LogisticEnterprise(name);
            enterprises.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.ResearchAndDevelopment){
            enterprise= new ResearchAndDevelopmentEnterprise(name);
            enterprises.add(enterprise);
        }
        
         
        return enterprise;
        
    }
    
}
