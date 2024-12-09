/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.DrugProduction;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class DrugProductionDirectory {
    
    private ArrayList<DrugProduction> drugProductionList;
    
    public DrugProduction createDrugProduction() {
        DrugProduction prod = new DrugProduction();
        drugProductionList.add(prod);
        return prod;
    }
    
}
