/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import ecosystemworkflow.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author gunav
 */
public class TransportOrganizationRequest extends WorkRequest{
    
     private String transportRequestId;
    private String itemType; // "Drug", "Blood", "Equipment"
    private int quantity;
    private String pickupLocation;
    private String deliveryLocation;
    private Date pickupTime;
    private Date deliveryTime;
    private String vehicleType;
    private boolean requiresRefrigeration;
    private ArrayList<String> specialHandlingInstructions;
    private String priority; // "Normal", "Urgent", "Emergency"
//    
//    public TransportOrganizationRequest(String message, UserAccount sender, UserAccount receiver,
//            String itemType, int quantity, String pickupLocation, String deliveryLocation) {
//        super(message, sender, receiver);
//        this.transportRequestId = "TR-" + System.currentTimeMillis();
//        this.itemType = itemType;
//        this.quantity = quantity;
//        this.pickupLocation = pickupLocation;
//        this.deliveryLocation = deliveryLocation;
//        this.specialHandlingInstructions = new ArrayList<>();
//        this.priority = "Normal";
//    }
    
    // Getters and Setters
    public String getTransportRequestId() {
        return transportRequestId;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public Date getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(Date pickupTime) {
        this.pickupTime = pickupTime;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isRequiresRefrigeration() {
        return requiresRefrigeration;
    }

    public void setRequiresRefrigeration(boolean requiresRefrigeration) {
        this.requiresRefrigeration = requiresRefrigeration;
    }

    public ArrayList<String> getSpecialHandlingInstructions() {
        return specialHandlingInstructions;
    }

    public void addSpecialHandlingInstruction(String instruction) {
        this.specialHandlingInstructions.add(instruction);
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
        if(priority.equals("Emergency")) {
            setStatus("URGENT");
        }
    }
    
    // Utility Methods
    public boolean isUrgentDelivery() {
        return "Emergency".equals(priority) || "Urgent".equals(priority);
    }
    
    public boolean validateRequest() {
        return itemType != null && !itemType.trim().isEmpty() &&
               quantity > 0 &&
               pickupLocation != null && !pickupLocation.trim().isEmpty() &&
               deliveryLocation != null && !deliveryLocation.trim().isEmpty();
    }
    
    @Override
    public String toString() {
        return "TransportOrganizationRequest{" +
                "requestId='" + getId() + '\'' +
                ", transportRequestId='" + transportRequestId + '\'' +
                ", itemType='" + itemType + '\'' +
                ", quantity=" + quantity +
                ", priority='" + priority + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
}
