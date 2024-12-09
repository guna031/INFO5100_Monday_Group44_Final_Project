/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.HospitalAdmin;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author gunav
 */
public class HospitalAdmin {
    
    private String hospitalAdminId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public HospitalAdmin() {
        hospitalAdminId = "HADM" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
