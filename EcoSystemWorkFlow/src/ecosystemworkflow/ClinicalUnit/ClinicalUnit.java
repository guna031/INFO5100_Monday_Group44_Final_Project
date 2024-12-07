/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.ClinicalUnit;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author hotragn
 */
public class ClinicalUnit {
    
    private String clinicalId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public ClinicalUnit() {
        clinicalId = "CLN" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
