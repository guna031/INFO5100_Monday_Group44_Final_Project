/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow;

import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Network.Network;
import ecosystemworkflow.Network.NetworkCatalog;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;

    String ecosyatemName;
    ArrayList<Network> networks;
    
     public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }
    
     
     public EcoSystem(){
          super(null);
        networks = new ArrayList<Network>();
     }
    
     private static void initialise() {
        for (Network network : business.getNetworks()) {
            for (Enterprise enterprize : network.getEnterprises().getEnterpriseList()) {
                for (UserAccount ua : enterprize.getUserAccountDirectory().getUserAccountList()) {
                    ua.init_new();
                }

                for (Organization o : enterprize.getOrganizationDirectory().getOrganizations()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        ua.init_new();
                    }
                }
            }
        }
    }
     
     
         public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }

    public String getEcosyatemName() {
        return ecosyatemName;
    }

    public void setEcosyatemName(String ecosyatemName) {
        this.ecosyatemName = ecosyatemName;
    }

    public ArrayList<Network> getNetworks() {
        return networks;
    }

    public void setNetworks(ArrayList<Network> networks) {
        this.networks = networks;
    }
     
    
}
