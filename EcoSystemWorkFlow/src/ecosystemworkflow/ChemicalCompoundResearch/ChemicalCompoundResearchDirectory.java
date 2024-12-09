/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.ChemicalCompoundResearch;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class ChemicalCompoundResearchDirectory {
    
     private ArrayList<ChemicalCompoundResearch> researchLabList;
    
    public ChemicalCompoundResearch createResearchLab() {
        ChemicalCompoundResearch lab = new ChemicalCompoundResearch();
        researchLabList.add(lab);
        return lab;
    }
    
}
