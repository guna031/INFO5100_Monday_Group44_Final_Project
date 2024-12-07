/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.BloodProcessingAndStorage.BloodProcessingDirectory;
import ecosystemworkflow.ChemicalCompoundResearch.ChemicalCompoundResearchDirectory;
import ecosystemworkflow.Role.ChemicalCompoundResearcherRole;
import ecosystemworkflow.Role.Role;
import java.util.HashSet;

/**
 *
 * @author hotragn
 */
public class ChemicalCompoundResearchOrganization extends Organization{
    
    ChemicalCompoundResearchDirectory chemicalCompoundResearchDirectory;
    
    public ChemicalCompoundResearchOrganization(){
         
        super(Organization.OrganizationType.ChemicalCompoundResearchOrganization.getValue());
        chemicalCompoundResearchDirectory = new ChemicalCompoundResearchDirectory();
         
     }
    
     @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ChemicalCompoundResearcherRole());
        return role; 
    }
    
}
