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
public class DrugShipmentUpdateRequest extends WorkRequest{
    
    private String shipmentId;
    private String drugName;
    private int quantity;
    private String currentLocation;
    private String destination;
    private String transportMode; // Air, Ground, or Special
    private String shipmentStatus; // In Transit, Delivered, Delayed
    private ArrayList<String> transitPoints;
    private Date estimatedDeliveryDate;
    private boolean requiresRefrigeration;
    private double temperature;
    
    public DrugShipmentUpdateRequest(String message, UserAccount sender, UserAccount receiver,
            String shipmentId, String drugName, int quantity, String destination) {
        super(message, sender, receiver);
        this.shipmentId = "SHIP-" + System.currentTimeMillis();
        this.drugName = drugName;
        this.quantity = quantity;
        this.destination = destination;
        this.shipmentStatus = "Preparing";
        this.transitPoints = new ArrayList<>();
        this.temperature = 20.0; // Default room temperature
    }
    
    // Getters and Setters
    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
        this.transitPoints.add(currentLocation);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTransportMode() {
        return transportMode;
    }

    public void setTransportMode(String transportMode) {
        this.transportMode = transportMode;
    }

    public String getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
        if (shipmentStatus.equals("Delivered")) {
            this.setDateOfResolving(new Date());
        }
    }

    public ArrayList<String> getTransitPoints() {
        return transitPoints;
    }

    public Date getEstimatedDeliveryDate() {
        return estimatedDeliveryDate;
    }

    public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
        this.estimatedDeliveryDate = estimatedDeliveryDate;
    }

    public boolean isRequiresRefrigeration() {
        return requiresRefrigeration;
    }

    public void setRequiresRefrigeration(boolean requiresRefrigeration) {
        this.requiresRefrigeration = requiresRefrigeration;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    
    // Utility Methods
    public boolean isDelayed() {
        if (estimatedDeliveryDate == null) return false;
        return new Date().after(estimatedDeliveryDate) && 
               !shipmentStatus.equals("Delivered");
    }
    
    public int getTransitTime() {
        if (getDateOfResolving()== null) {
            return (int)((new Date().getTime() - getDateOfRequest().getTime()) 
                    / (1000 * 60 * 60 * 24));
        }
        return (int)((getDateOfResolving().getTime() - getDateOfRequest().getTime()) 
                / (1000 * 60 * 60 * 24));
    }
    
    public boolean isTemperatureControlled() {
        return requiresRefrigeration || temperature != 20.0;
    }
    
    @Override
    public String toString() {
        return "DrugShipmentUpdateRequest{" +
                "shipmentId='" + shipmentId + '\'' +
                ", drugName='" + drugName + '\'' +
                ", status='" + shipmentStatus + '\'' +
                ", currentLocation='" + currentLocation + '\'' +
                ", destination='" + destination + '\'' +
                ", estimatedDelivery=" + estimatedDeliveryDate +
                ", isDelayed=" + isDelayed() +
                '}';
    }
    
}
