/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.InventoryManagement;

import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/**
 *
 * @author varun
 */
public class InventoryManagement {
    
    private String inventoryId;
    private String name;
    private WorkRequestDirectory workRequests;
    private static int count;
    
    public InventoryManagement() {
        inventoryId = "INV" + (++count);
        workRequests = new WorkRequestDirectory();
    }
    
}
