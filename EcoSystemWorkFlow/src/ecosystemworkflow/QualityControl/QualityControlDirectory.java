/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.QualityControl;

import java.util.ArrayList;

/**
 *
 * @author hotragn
 */
public class QualityControlDirectory {
    
    private ArrayList<QualityControl> qualityControlList;
    
    public QualityControl createQualityControl() {
        QualityControl qc = new QualityControl();
        qualityControlList.add(qc);
        return qc;
    }
    
}
