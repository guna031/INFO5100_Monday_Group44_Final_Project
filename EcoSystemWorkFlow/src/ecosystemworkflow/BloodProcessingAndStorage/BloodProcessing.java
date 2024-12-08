/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.BloodProcessingAndStorage;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author hotragn
 */
public class BloodProcessing {
    
     private String bloodProcessingId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public BloodProcessing() {
        bloodProcessingId = "BLP" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
