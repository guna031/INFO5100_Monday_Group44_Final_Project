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
public class PatientDataRequest extends WorkRequest{
    
     
    private String trialId;
    private ArrayList<String> requiredDataFields;
    private String purposeOfStudy;
    private int numberOfPatients;
    private String patientCriteria;
    private Date dataCollectionStartDate;
    private Date dataCollectionEndDate;
    private boolean isAnonymized;
    private HashMap<String, String> dataPrivacyRequirements;
    private String ethicsApprovalNumber;
    
    public PatientDataRequest(String message, UserAccount sender, UserAccount receiver,
            String trialId, ArrayList<String> requiredDataFields, String purposeOfStudy) {
        super(message, sender, receiver);
        this.trialId = trialId;
        this.requiredDataFields = new ArrayList<>(requiredDataFields);
        this.purposeOfStudy = purposeOfStudy;
        this.isAnonymized = true;
        this.dataPrivacyRequirements = new HashMap<>();
    }
    
    // Getters and Setters
    public String getTrialId() {
        return trialId;
    }

    public void setTrialId(String trialId) {
        this.trialId = trialId;
    }

    public ArrayList<String> getRequiredDataFields() {
        return requiredDataFields;
    }

    public void addRequiredDataField(String field) {
        this.requiredDataFields.add(field);
    }

    public String getPurposeOfStudy() {
        return purposeOfStudy;
    }

    public void setPurposeOfStudy(String purposeOfStudy) {
        this.purposeOfStudy = purposeOfStudy;
    }

    public int getNumberOfPatients() {
        return numberOfPatients;
    }

    public void setNumberOfPatients(int numberOfPatients) {
        this.numberOfPatients = numberOfPatients;
    }

    public String getPatientCriteria() {
        return patientCriteria;
    }

    public void setPatientCriteria(String patientCriteria) {
        this.patientCriteria = patientCriteria;
    }

    public Date getDataCollectionStartDate() {
        return dataCollectionStartDate;
    }

    public void setDataCollectionStartDate(Date dataCollectionStartDate) {
        this.dataCollectionStartDate = dataCollectionStartDate;
    }

    public Date getDataCollectionEndDate() {
        return dataCollectionEndDate;
    }

    public void setDataCollectionEndDate(Date dataCollectionEndDate) {
        this.dataCollectionEndDate = dataCollectionEndDate;
    }

    public boolean isIsAnonymized() {
        return isAnonymized;
    }

    public void setIsAnonymized(boolean isAnonymized) {
        this.isAnonymized = isAnonymized;
    }

    public HashMap<String, String> getDataPrivacyRequirements() {
        return dataPrivacyRequirements;
    }

    public void addPrivacyRequirement(String key, String requirement) {
        this.dataPrivacyRequirements.put(key, requirement);
    }

    public String getEthicsApprovalNumber() {
        return ethicsApprovalNumber;
    }

    public void setEthicsApprovalNumber(String ethicsApprovalNumber) {
        this.ethicsApprovalNumber = ethicsApprovalNumber;
    }
    
    // Utility Methods
    public boolean isValidRequest() {
        return trialId != null && !trialId.trim().isEmpty() &&
               !requiredDataFields.isEmpty() &&
               purposeOfStudy != null && !purposeOfStudy.trim().isEmpty() &&
               ethicsApprovalNumber != null && !ethicsApprovalNumber.trim().isEmpty();
    }
    
    public boolean isDateRangeValid() {
        if (dataCollectionStartDate == null || dataCollectionEndDate == null) {
            return false;
        }
        return !dataCollectionEndDate.before(dataCollectionStartDate);
    }
    
    @Override
    public String toString() {
        return "PatientDataRequest{" +
                "requestId='" + getId() + '\'' +
                ", trialId='" + trialId + '\'' +
                ", numberOfFields=" + requiredDataFields.size() +
                ", numberOfPatients=" + numberOfPatients +
                ", isAnonymized=" + isAnonymized +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
}
