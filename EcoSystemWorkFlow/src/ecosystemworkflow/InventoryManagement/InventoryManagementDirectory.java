/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.InventoryManagement;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class InventoryManagementDirectory {
    
    private ArrayList<InventoryManagement> inventoryManagementList;
    
    public InventoryManagement createInventoryManagement() {
        InventoryManagement iM = new InventoryManagement();
        inventoryManagementList.add(iM);
        return iM;
    }
    
}
