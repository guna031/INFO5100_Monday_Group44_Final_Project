/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.BloodCollection;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class BloodCollectionDirectory {
    
    private ArrayList<BloodCollection> bloodCollectionDirectory;
    
    public BloodCollection createBloodCollectorAdmin() {
        BloodCollection bC = new BloodCollection();
        bloodCollectionDirectory.add(bC);
        return bC;
    }
}
