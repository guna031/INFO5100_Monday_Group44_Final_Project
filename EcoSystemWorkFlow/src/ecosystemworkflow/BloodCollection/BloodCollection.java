/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.BloodCollection;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author hotragn
 */
public class BloodCollection {
    
    private String bloodCollectionId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public BloodCollection() {
        bloodCollectionId = "BLC" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
