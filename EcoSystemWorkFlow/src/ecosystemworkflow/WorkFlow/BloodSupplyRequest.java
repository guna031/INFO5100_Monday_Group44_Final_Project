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
public class BloodSupplyRequest extends WorkRequest {

    private String bloodType;
    private int quantity;
    private boolean isUrgent;
    private String deliveryLocation;
    private Date requiredByDate;
    private String patientCondition;
    private String storageRequirements;
    private double temperature;

//    public BloodSupplyRequest(String message, UserAccount sender, UserAccount receiver,
//            String bloodType, int quantity, boolean isUrgent, String deliveryLocation,
//            Date requiredByDate) {
//        super(message, sender, receiver);
//        this.bloodType = bloodType;
//        this.quantity = quantity;
//        this.isUrgent = isUrgent;
//        this.deliveryLocation = deliveryLocation;
//        this.requiredByDate = requiredByDate;
//        this.storageRequirements = "Standard Blood Storage Protocol";
//        this.temperature = 4.0; // Default temperature for blood storage (in Celsius)
//        setStatus(isUrgent ? "URGENT" : "Pending");
//    }

    // Getters and Setters
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean isUrgent) {
        this.isUrgent = isUrgent;
        setStatus(isUrgent ? "URGENT" : getStatus());
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public Date getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(Date requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public String getPatientCondition() {
        return patientCondition;
    }

    public void setPatientCondition(String patientCondition) {
        this.patientCondition = patientCondition;
    }

    public String getStorageRequirements() {
        return storageRequirements;
    }

    public void setStorageRequirements(String storageRequirements) {
        this.storageRequirements = storageRequirements;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isExpedited() {
        return isUrgent || getDaysUntilRequired() <= 1;
    }

    public int getDaysUntilRequired() {
        long diff = requiredByDate.getTime() - new Date().getTime();
        return (int) (diff / (24 * 60 * 60 * 1000));
    }

    public String getPriorityLevel() {
        if (isUrgent) {
            return "CRITICAL";
        }
        if (getDaysUntilRequired() <= 1) {
            return "HIGH";
        }
        if (getDaysUntilRequired() <= 3) {
            return "MEDIUM";
        }
        return "NORMAL";
    }

    // Validation method
    public boolean validateRequest() {
        // Basic validation rules
        if (bloodType == null || bloodType.trim().isEmpty()) {
            return false;
        }
        if (quantity <= 0) {
            return false;
        }
        if (deliveryLocation == null || deliveryLocation.trim().isEmpty()) {
            return false;
        }
        if (requiredByDate == null || requiredByDate.before(new Date())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BloodSupplyRequest{"
                + "requestId='" + getId() + '\''
                + ", bloodType='" + bloodType + '\''
                + ", quantity=" + quantity
                + ", isUrgent=" + isUrgent
                + ", deliveryLocation='" + deliveryLocation + '\''
                + ", requiredByDate=" + requiredByDate
                + ", status='" + getStatus() + '\''
                + ", priority='" + getPriorityLevel() + '\''
//                + ", sender=" + getSender().getUserName()
//                + ", receiver=" + getReciever().getUserName()
                + '}';
    }

    // Helper method to create an urgent request
//    public static BloodSupplyRequest createUrgentRequest(String message, UserAccount sender,
//            UserAccount receiver, String bloodType, int quantity, String deliveryLocation,
//            String patientCondition) {
//        BloodSupplyRequest request = new BloodSupplyRequest(
//                message, sender, receiver, bloodType, quantity, true,
//                deliveryLocation, new Date() // Required immediately
//        );
//        request.setPatientCondition(patientCondition);
//        return request;
//    }

}
