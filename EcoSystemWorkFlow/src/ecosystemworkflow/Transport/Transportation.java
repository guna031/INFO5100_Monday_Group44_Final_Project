/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Transport;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author gunav
 */
public class Transportation {
    
    private String transportId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public Transportation() {
        transportId = "TRN" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
