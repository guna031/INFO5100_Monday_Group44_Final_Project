/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.ClinicalTrialsManagement;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class ClinicalTrialsManagementDirectory {
    
    private ArrayList<ClinicalTrialsManagement> clinicalTrialsManagementDirectory;
    
    public ClinicalTrialsManagement createClinicalTrialsManagement() {
        ClinicalTrialsManagement admin = new ClinicalTrialsManagement();
        clinicalTrialsManagementDirectory.add(admin);
        return admin;
    }
    
}
