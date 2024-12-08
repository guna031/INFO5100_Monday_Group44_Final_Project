/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.ChemicalCompoundResearch;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author varun
 */
public class ChemicalCompoundResearch {
    
    private String researchId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
     public ChemicalCompoundResearch() {
        researchId = "CCR" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
