/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.DrugProduction;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author gunav
 */
public class DrugProduction {
    
    private String drugProductionId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public DrugProduction() {
        drugProductionId = "DRG" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
