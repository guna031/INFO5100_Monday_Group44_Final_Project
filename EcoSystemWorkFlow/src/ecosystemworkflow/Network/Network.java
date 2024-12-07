/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Network;

import ecosystemworkflow.Enterprise.EnterpriseDirectory;

/**
 *
 * @author gunav
 */
public class Network {

   
    
    private String name;
    private EnterpriseDirectory enterprises;
    
    public Network(){
        enterprises = new EnterpriseDirectory();
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterprises() {
        return enterprises;
    }

   @Override
   public String toString(){
       return name;
   }
    
    
}
