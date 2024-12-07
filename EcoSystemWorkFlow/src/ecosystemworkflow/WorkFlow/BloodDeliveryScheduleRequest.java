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
public class BloodDeliveryScheduleRequest extends WorkRequest{
    
    private String scheduleId;
    private String bloodType;
    private int quantity;
    private String sourceLocation;
    private String destinationLocation;
    private Date scheduledPickupTime;
    private Date scheduledDeliveryTime;
    private boolean requiresSpecialHandling;
    private double temperature;
    private ArrayList<String> specialInstructions;
    private String transportPriority; // Normal, Priority, Emergency
    
    public BloodDeliveryScheduleRequest(String message, UserAccount sender, UserAccount receiver,
            String bloodType, int quantity, String sourceLocation, String destinationLocation) {
        super(message, sender, receiver);
        this.scheduleId = "BDS-" + System.currentTimeMillis();
        this.bloodType = bloodType;
        this.quantity = quantity;
        this.sourceLocation = sourceLocation;
        this.destinationLocation = destinationLocation;
        this.temperature = 4.0; // Default blood storage temperature
        this.specialInstructions = new ArrayList<>();
        this.transportPriority = "Normal";
    }
    
    // Getters and Setters
    public String getScheduleId() {
        return scheduleId;
    }

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

    public String getSourceLocation() {
        return sourceLocation;
    }

    public void setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Date getScheduledPickupTime() {
        return scheduledPickupTime;
    }

    public void setScheduledPickupTime(Date scheduledPickupTime) {
        this.scheduledPickupTime = scheduledPickupTime;
    }

    public Date getScheduledDeliveryTime() {
        return scheduledDeliveryTime;
    }

    public void setScheduledDeliveryTime(Date scheduledDeliveryTime) {
        this.scheduledDeliveryTime = scheduledDeliveryTime;
    }

    public boolean isRequiresSpecialHandling() {
        return requiresSpecialHandling;
    }

    public void setRequiresSpecialHandling(boolean requiresSpecialHandling) {
        this.requiresSpecialHandling = requiresSpecialHandling;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public ArrayList<String> getSpecialInstructions() {
        return specialInstructions;
    }

    public void addSpecialInstruction(String instruction) {
        this.specialInstructions.add(instruction);
    }

    public String getTransportPriority() {
        return transportPriority;
    }

    public void setTransportPriority(String transportPriority) {
        this.transportPriority = transportPriority;
    }
    
    // Utility Methods
    public int getEstimatedTransitTime() {
        if (scheduledDeliveryTime == null || scheduledPickupTime == null) {
            return 0;
        }
        long diff = scheduledDeliveryTime.getTime() - scheduledPickupTime.getTime();
        return (int) (diff / (60 * 60 * 1000)); // Returns hours
    }
    
    public boolean isValidSchedule() {
        if (scheduledPickupTime == null || scheduledDeliveryTime == null) {
            return false;
        }
        return scheduledDeliveryTime.after(scheduledPickupTime);
    }
    
    public boolean isUrgentDelivery() {
        return "Emergency".equals(transportPriority);
    }
    
    @Override
    public String toString() {
        return "BloodDeliveryScheduleRequest{" +
                "scheduleId='" + scheduleId + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", quantity=" + quantity +
                ", priority='" + transportPriority + '\'' +
                ", source='" + sourceLocation + '\'' +
                ", destination='" + destinationLocation + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
}
