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
public class DrugAvailabilityNotificationRequest extends WorkRequest{
    
    private String drugName;
    private int availableQuantity;
    private double unitPrice;
    private Date availabilityDate;
    private String manufacturerLocation;
    private String batchNumber;
    private Date expiryDate;
    private String storageRequirements;
    private boolean isUrgentSupply;
    
    public DrugAvailabilityNotificationRequest(String message, UserAccount sender, UserAccount receiver,
            String drugName, int availableQuantity, Date availabilityDate) {
        super(message, sender, receiver);
        this.drugName = drugName;
        this.availableQuantity = availableQuantity;
        this.availabilityDate = availabilityDate;
        this.batchNumber = "BATCH-" + System.currentTimeMillis();
        this.isUrgentSupply = false;
    }
    
    // Getters and Setters
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Date getAvailabilityDate() {
        return availabilityDate;
    }

    public void setAvailabilityDate(Date availabilityDate) {
        this.availabilityDate = availabilityDate;
    }

    public String getManufacturerLocation() {
        return manufacturerLocation;
    }

    public void setManufacturerLocation(String manufacturerLocation) {
        this.manufacturerLocation = manufacturerLocation;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getStorageRequirements() {
        return storageRequirements;
    }

    public void setStorageRequirements(String storageRequirements) {
        this.storageRequirements = storageRequirements;
    }

    public boolean isIsUrgentSupply() {
        return isUrgentSupply;
    }

    public void setIsUrgentSupply(boolean isUrgentSupply) {
        this.isUrgentSupply = isUrgentSupply;
        if(isUrgentSupply) {
            setStatus("URGENT");
        }
    }
    
    // Utility Methods
    public double getTotalValue() {
        return availableQuantity * unitPrice;
    }
    
    public boolean isExpiringSoon() {
        if(expiryDate == null) return false;
        long diff = expiryDate.getTime() - new Date().getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        return days <= 90; // Consider expiring soon if within 90 days
    }
    
    @Override
    public String toString() {
        return "DrugAvailabilityNotificationRequest{" +
                "requestId='" + getId() + '\'' +
                ", drugName='" + drugName + '\'' +
                ", quantity=" + availableQuantity +
                ", batchNumber='" + batchNumber + '\'' +
                ", availabilityDate=" + availabilityDate +
                ", isUrgent=" + isUrgentSupply +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
}
