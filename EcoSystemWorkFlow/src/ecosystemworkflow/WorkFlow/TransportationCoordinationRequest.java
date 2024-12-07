/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import ecosystemworkflow.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author gunav
 */
public class TransportationCoordinationRequest extends WorkRequest {
    
    private String transportId;
    private String origin;
    private String destination;
    private Date pickupDate;
    private Date deliveryDate;
    private String transportMode; // Air, Ground, Maritime
    private ArrayList<String> routePoints;
    private HashMap<String, String> specialInstructions;
    private boolean temperatureControlled;
    private double requiredTemperature;
    private boolean hazardousMaterial;
    private double totalWeight;
    private String vehicleType;
    private boolean requiresSpecialHandling;
    
    public TransportationCoordinationRequest(String message, UserAccount sender, UserAccount receiver,
            String origin, String destination, Date pickupDate) {
        super(message, sender, receiver);
        this.transportId = "TRANS-" + System.currentTimeMillis();
        this.origin = origin;
        this.destination = destination;
        this.pickupDate = pickupDate;
        this.routePoints = new ArrayList<>();
        this.specialInstructions = new HashMap<>();
        this.temperatureControlled = false;
        this.hazardousMaterial = false;
        this.requiresSpecialHandling = false;
    }
    
    // Getters and Setters
    public String getTransportId() {
        return transportId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public ArrayList<String> getRoutePoints() {
        return routePoints;
    }

    public void addRoutePoint(String point) {
        this.routePoints.add(point);
    }

    public HashMap<String, String> getSpecialInstructions() {
        return specialInstructions;
    }

    public void addSpecialInstruction(String key, String instruction) {
        this.specialInstructions.put(key, instruction);
    }

    public boolean isTemperatureControlled() {
        return temperatureControlled;
    }

    public void setTemperatureControlled(boolean temperatureControlled) {
        this.temperatureControlled = temperatureControlled;
    }

    public double getRequiredTemperature() {
        return requiredTemperature;
    }

    public void setRequiredTemperature(double requiredTemperature) {
        this.requiredTemperature = requiredTemperature;
        this.temperatureControlled = true;
    }

    public boolean isHazardousMaterial() {
        return hazardousMaterial;
    }

    public void setHazardousMaterial(boolean hazardousMaterial) {
        this.hazardousMaterial = hazardousMaterial;
        if(hazardousMaterial) {
            this.requiresSpecialHandling = true;
        }
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isRequiresSpecialHandling() {
        return requiresSpecialHandling;
    }

    public void setRequiresSpecialHandling(boolean requiresSpecialHandling) {
        this.requiresSpecialHandling = requiresSpecialHandling;
    }
    
    // Utility Methods
    public int getEstimatedTransitDays() {
        if(deliveryDate == null || pickupDate == null) return 0;
        long diff = deliveryDate.getTime() - pickupDate.getTime();
        return (int) (diff / (1000 * 60 * 60 * 24));
    }
    
    public boolean isUrgentTransport() {
        return getEstimatedTransitDays() <= 2;
    }
    
    public boolean requiresSpecialVehicle() {
        return temperatureControlled || hazardousMaterial || requiresSpecialHandling;
    }
    
    public String getTransportCategory() {
        if(hazardousMaterial) return "HAZMAT";
        if(temperatureControlled) return "TEMPERATURE_CONTROLLED";
        if(requiresSpecialHandling) return "SPECIAL_HANDLING";
        return "STANDARD";
    }
    
    // Validation method
    public boolean validateRequest() {
        if(origin == null || origin.trim().isEmpty()) {
            return false;
        }
        if(destination == null || destination.trim().isEmpty()) {
            return false;
        }
        if(pickupDate == null || pickupDate.before(new Date())) {
            return false;
        }
        if(deliveryDate != null && deliveryDate.before(pickupDate)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "TransportationCoordinationRequest{" +
                "transportId='" + transportId + '\'' +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", category='" + getTransportCategory() + '\'' +
                ", transitDays=" + getEstimatedTransitDays() +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
}
