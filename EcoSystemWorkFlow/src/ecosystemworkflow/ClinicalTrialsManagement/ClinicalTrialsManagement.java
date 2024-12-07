/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.ClinicalTrialsManagement;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author varun
 */
public class ClinicalTrialsManagement {
    
    private String trialsId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public ClinicalTrialsManagement() {
        trialsId = "CTM" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
