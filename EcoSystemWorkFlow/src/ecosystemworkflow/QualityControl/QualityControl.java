/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.QualityControl;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author gunav
 */
public class QualityControl {
    
    private String qualityControlId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public QualityControl() {
        qualityControlId = "QC" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
