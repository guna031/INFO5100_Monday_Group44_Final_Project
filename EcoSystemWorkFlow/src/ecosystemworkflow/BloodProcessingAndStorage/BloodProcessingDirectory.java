/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.BloodProcessingAndStorage;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class BloodProcessingDirectory {
    
    private ArrayList<BloodProcessing> bloodProcessingDirectory;
    
    public BloodProcessing createHospitalAdmin() {
        BloodProcessing bP = new BloodProcessing();
        bloodProcessingDirectory.add(bP);
        return bP;
    }
    
}
