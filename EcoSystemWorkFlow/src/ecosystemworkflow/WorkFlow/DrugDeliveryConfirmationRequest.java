/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import ecosystemworkflow.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class DrugDeliveryConfirmationRequest extends WorkRequest {
    
    private int quantity;
    private String drugName;
    private String deliveryLocation;
    private Date deliveryDate;
    
    public DrugDeliveryConfirmationRequest(String message, UserAccount sender, 
            UserAccount receiver, int quantity, String drugName) {
        super(message, sender, receiver);
        this.quantity = quantity;
        this.drugName = drugName;
        this.deliveryDate = new Date();
    }
    
    // Getters and Setters
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getDrugName() {
        return drugName;
    }
    
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    
    public Date getDeliveryDate() {
        return deliveryDate;
    }
    
    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    public String getDeliveryLocation() {
        return deliveryLocation;
    }
    
    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
    
    @Override
    public String toString() {
        return "Delivery Confirmation - " + drugName + " (" + quantity + " units)";
    }
    
}
