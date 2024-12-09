/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.ClinicalUnit;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class ClinicalUnitDirectory {
    
    private ArrayList<ClinicalUnit> clinicalUnitList;
    
    public ClinicalUnit createClinicalUnit() {
        ClinicalUnit unit = new ClinicalUnit();
        clinicalUnitList.add(unit);
        return unit;
    }
    
}
