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
public class UrgentBloodDeliveryRequest extends WorkRequest{
    
     private String bloodType;
    private int unitsRequired;
    private String patientCondition;
    private String hospitalDepartment;
    private Date requiredByTime; // Specific time needed, not just date
    private String surgeryType;
    private boolean isCritical;
    private ArrayList<String> alternativeBloodTypes;
    private String deliveryLocation;
    private String contactPerson;
    private String contactPhone;
    
    public UrgentBloodDeliveryRequest(String message, UserAccount sender, UserAccount receiver,
            String bloodType, int unitsRequired, String patientCondition, Date requiredByTime) {
        super(message, sender, receiver);
        this.bloodType = bloodType;
        this.unitsRequired = unitsRequired;
        this.patientCondition = patientCondition;
        this.requiredByTime = requiredByTime;
        this.isCritical = true;
        this.alternativeBloodTypes = new ArrayList<>();
        setStatus("URGENT");
    }
    
    // Getters and Setters
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public int getUnitsRequired() {
        return unitsRequired;
    }

    public void setUnitsRequired(int unitsRequired) {
        this.unitsRequired = unitsRequired;
    }

    public String getPatientCondition() {
        return patientCondition;
    }

    public void setPatientCondition(String patientCondition) {
        this.patientCondition = patientCondition;
    }

    public String getHospitalDepartment() {
        return hospitalDepartment;
    }

    public void setHospitalDepartment(String hospitalDepartment) {
        this.hospitalDepartment = hospitalDepartment;
    }

    public Date getRequiredByTime() {
        return requiredByTime;
    }

    public void setRequiredByTime(Date requiredByTime) {
        this.requiredByTime = requiredByTime;
    }

    public String getSurgeryType() {
        return surgeryType;
    }

    public void setSurgeryType(String surgeryType) {
        this.surgeryType = surgeryType;
    }

    public boolean isIsCritical() {
        return isCritical;
    }

    public void setIsCritical(boolean isCritical) {
        this.isCritical = isCritical;
    }

    public ArrayList<String> getAlternativeBloodTypes() {
        return alternativeBloodTypes;
    }

    public void addAlternativeBloodType(String bloodType) {
        if (!this.alternativeBloodTypes.contains(bloodType)) {
            this.alternativeBloodTypes.add(bloodType);
        }
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }
    
    // Utility Methods
    public boolean isImmediate() {
        // Check if required within next hour
        long diff = requiredByTime.getTime() - new Date().getTime();
        return diff <= (60 * 60 * 1000);
    }
    
    public String getUrgencyLevel() {
        if (isImmediate()) return "IMMEDIATE";
        if (isCritical) return "CRITICAL";
        return "URGENT";
    }
    
    public long getTimeRemainingInMinutes() {
        long diff = requiredByTime.getTime() - new Date().getTime();
        return diff / (60 * 1000);
    }
    
    public boolean hasAlternatives() {
        return !alternativeBloodTypes.isEmpty();
    }
    
    @Override
    public String toString() {
        return "UrgentBloodDeliveryRequest{" +
                "requestId='" + getId() + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", unitsRequired=" + unitsRequired +
                ", urgencyLevel='" + getUrgencyLevel() + '\'' +
                ", timeRemaining=" + getTimeRemainingInMinutes() + " minutes" +
                ", department='" + hospitalDepartment + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
    // Validation method
    public boolean validateRequest() {
        if (bloodType == null || bloodType.trim().isEmpty()) {
            return false;
        }
        if (unitsRequired <= 0) {
            return false;
        }
        if (requiredByTime == null || requiredByTime.before(new Date())) {
            return false;
        }
        if (deliveryLocation == null || deliveryLocation.trim().isEmpty()) {
            return false;
        }
        if (contactPerson == null || contactPerson.trim().isEmpty()) {
            return false;
        }
        if (contactPhone == null || contactPhone.trim().isEmpty()) {
            return false;
        }
        return true;
    }
    
}
