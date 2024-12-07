/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import ecosystemworkflow.UserAccount.UserAccount;
import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author gunav
 */
public class AdditionalSupplyRequest extends WorkRequest{
    
      private String drugName;
    private int requestedQuantity;
    private String reasonForRequest;
    private String currentStockLevel;
    private Date requiredByDate;
    private boolean isEmergencyRequest;
    private String departmentName;
    private HashMap<String, String> previousOrderHistory;
    private String prescribingDoctor;
    
    public AdditionalSupplyRequest(String message, UserAccount sender, UserAccount receiver,
            String drugName, int requestedQuantity, Date requiredByDate) {
        super(message, sender, receiver);
        this.drugName = drugName;
        this.requestedQuantity = requestedQuantity;
        this.requiredByDate = requiredByDate;
        this.isEmergencyRequest = false;
        this.previousOrderHistory = new HashMap<>();
    }
    
    // Getters and Setters
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getRequestedQuantity() {
        return requestedQuantity;
    }

    public void setRequestedQuantity(int requestedQuantity) {
        this.requestedQuantity = requestedQuantity;
    }

    public String getReasonForRequest() {
        return reasonForRequest;
    }

    public void setReasonForRequest(String reasonForRequest) {
        this.reasonForRequest = reasonForRequest;
    }

    public String getCurrentStockLevel() {
        return currentStockLevel;
    }

    public void setCurrentStockLevel(String currentStockLevel) {
        this.currentStockLevel = currentStockLevel;
    }

    public Date getRequiredByDate() {
        return requiredByDate;
    }

    public void setRequiredByDate(Date requiredByDate) {
        this.requiredByDate = requiredByDate;
    }

    public boolean isIsEmergencyRequest() {
        return isEmergencyRequest;
    }

    public void setIsEmergencyRequest(boolean isEmergencyRequest) {
        this.isEmergencyRequest = isEmergencyRequest;
        if(isEmergencyRequest) {
            setStatus("URGENT");
        }
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public HashMap<String, String> getPreviousOrderHistory() {
        return previousOrderHistory;
    }

    public void addPreviousOrder(String orderDate, String quantity) {
        this.previousOrderHistory.put(orderDate, quantity);
    }

    public String getPrescribingDoctor() {
        return prescribingDoctor;
    }

    public void setPrescribingDoctor(String prescribingDoctor) {
        this.prescribingDoctor = prescribingDoctor;
    }
    
    // Utility Methods
    public boolean isUrgentDelivery() {
        if(isEmergencyRequest) return true;
        if(requiredByDate == null) return false;
        
        long diff = requiredByDate.getTime() - new Date().getTime();
        long days = diff / (1000 * 60 * 60 * 24);
        return days <= 2;
    }
    
    public boolean validateRequest() {
        return drugName != null && !drugName.trim().isEmpty() &&
               requestedQuantity > 0 &&
               requiredByDate != null &&
               !requiredByDate.before(new Date());
    }
    
    @Override
    public String toString() {
        return "AdditionalSupplyRequest{" +
                "requestId='" + getId() + '\'' +
                ", drugName='" + drugName + '\'' +
                ", quantity=" + requestedQuantity +
                ", requiredBy=" + requiredByDate +
                ", isEmergency=" + isEmergencyRequest +
                ", status='" + getStatus() + '\'' +
                '}';
    }
        
    
}
