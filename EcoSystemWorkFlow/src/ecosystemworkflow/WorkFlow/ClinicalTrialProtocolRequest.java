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
public class ClinicalTrialProtocolRequest extends WorkRequest {

    private String protocolId;
    private String trialName;
    private String description;
    private int requiredPatients;
    private ArrayList<String> inclusionCriteria;
    private ArrayList<String> exclusionCriteria;
    private Date trialStartDate;
    private Date trialEndDate;
    private String phase; 
    private String drugName;
    private String studyType; 

//    public ClinicalTrialProtocolRequest(String message, UserAccount sender, UserAccount receiver,
//            String trialName, String description, int requiredPatients, Date startDate, Date endDate) {
//        super(message, sender, receiver);
//        this.protocolId = "TRIAL-" + System.currentTimeMillis();
//        this.trialName = trialName;
//        this.description = description;
//        this.requiredPatients = requiredPatients;
//        this.trialStartDate = startDate;
//        this.trialEndDate = endDate;
//        this.inclusionCriteria = new ArrayList<>();
//        this.exclusionCriteria = new ArrayList<>();
//    }

    public String getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(String protocolId) {
        this.protocolId = protocolId;
    }

    public String getTrialName() {
        return trialName;
    }

    public void setTrialName(String trialName) {
        this.trialName = trialName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRequiredPatients() {
        return requiredPatients;
    }

    public void setRequiredPatients(int requiredPatients) {
        this.requiredPatients = requiredPatients;
    }

    public ArrayList<String> getInclusionCriteria() {
        return inclusionCriteria;
    }

    public void addInclusionCriteria(String criteria) {
        this.inclusionCriteria.add(criteria);
    }

    public ArrayList<String> getExclusionCriteria() {
        return exclusionCriteria;
    }

    public void addExclusionCriteria(String criteria) {
        this.exclusionCriteria.add(criteria);
    }

    public Date getTrialStartDate() {
        return trialStartDate;
    }

    public void setTrialStartDate(Date trialStartDate) {
        this.trialStartDate = trialStartDate;
    }

    public Date getTrialEndDate() {
        return trialEndDate;
    }

    public void setTrialEndDate(Date trialEndDate) {
        this.trialEndDate = trialEndDate;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    // Validation method
    public boolean validateProtocol() {
        if (trialName == null || trialName.trim().isEmpty()) {
            return false;
        }
        if (requiredPatients <= 0) {
            return false;
        }
        if (trialStartDate == null || trialEndDate == null) {
            return false;
        }
        if (trialStartDate.after(trialEndDate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ClinicalTrialProtocolRequest{"
                + "protocolId='" + protocolId + '\''
                + ", trialName='" + trialName + '\''
                + ", requiredPatients=" + requiredPatients
                + ", phase='" + phase + '\''
                + ", status='" + getStatus() + '\''
                + '}';
    }

}
