/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow;

import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Network.Network;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.Role.SystemAdminRole;
import ecosystemworkflow.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;

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
    
      public Network createAndAddNetwork() {
        Network network = new Network();
        networks.add(network);
        return network;
    }
      
       public static void setInstance(EcoSystem system) {
        business = system;
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
     
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SystemAdminRole());
        return role; 
    }
    
     public static boolean validatePassword(String password) {
        // Password must be at least 8 characters long and contain at least one uppercase letter, one lowercase letter, and one digit.
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s)[a-zA-Z\\d@#$%^&+=!]{8,}$");
    }

    public static boolean checkIfUsernameIsUnique(String username) {
        for (Network network : business.getNetworks()) {
            for (Enterprise enterprize : network.getEnterprises().getEnterpriseList()) {
                for (UserAccount ua : enterprize.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUserName().equals(username)) {
                        return false;
                    }
                }

                for (Organization o : enterprize.getOrganizationDirectory().getOrganizations()) {
                    for (UserAccount ua : o.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUserName().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}
