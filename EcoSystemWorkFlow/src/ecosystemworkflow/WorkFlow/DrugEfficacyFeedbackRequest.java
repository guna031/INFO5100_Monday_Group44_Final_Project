/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import ecosystemworkflow.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author gunav
 */
public class DrugEfficacyFeedbackRequest extends WorkRequest{
    
     private String drugName;
    private String batchNumber;
    private int efficacyRating; // Scale of 1-5
    private ArrayList<String> observedSideEffects;
    private HashMap<String, Integer> symptomImprovementRatings; // Symptom -> Rating (1-5)
    private int patientsSurveyed;
    private String prescribingDepartment;
    private String treatmentDuration;
    private boolean recommendedForContinuation;
    private String clinicalObservations;
    
    public DrugEfficacyFeedbackRequest(String message, UserAccount sender, UserAccount receiver, 
            String drugName, String batchNumber, int efficacyRating, int patientsSurveyed) {
        super(message, sender, receiver);
        this.drugName = drugName;
        this.batchNumber = batchNumber;
        this.efficacyRating = validateRating(efficacyRating);
        this.patientsSurveyed = patientsSurveyed;
        this.observedSideEffects = new ArrayList<>();
        this.symptomImprovementRatings = new HashMap<>();
        this.recommendedForContinuation = true; // Default value
    }
    
    // Validation helper method
    private int validateRating(int rating) {
        if (rating < 1) return 1;
        if (rating > 5) return 5;
        return rating;
    }
    
    // Getters and Setters
    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public int getEfficacyRating() {
        return efficacyRating;
    }

    public void setEfficacyRating(int efficacyRating) {
        this.efficacyRating = validateRating(efficacyRating);
    }

    public ArrayList<String> getObservedSideEffects() {
        return observedSideEffects;
    }

    public void addSideEffect(String sideEffect) {
        if (sideEffect != null && !sideEffect.trim().isEmpty()) {
            this.observedSideEffects.add(sideEffect);
        }
    }

    public HashMap<String, Integer> getSymptomImprovementRatings() {
        return symptomImprovementRatings;
    }

    public void addSymptomRating(String symptom, int rating) {
        this.symptomImprovementRatings.put(symptom, validateRating(rating));
    }

    public int getPatientsSurveyed() {
        return patientsSurveyed;
    }

    public void setPatientsSurveyed(int patientsSurveyed) {
        this.patientsSurveyed = patientsSurveyed;
    }

    public String getPrescribingDepartment() {
        return prescribingDepartment;
    }

    public void setPrescribingDepartment(String prescribingDepartment) {
        this.prescribingDepartment = prescribingDepartment;
    }

    public String getTreatmentDuration() {
        return treatmentDuration;
    }

    public void setTreatmentDuration(String treatmentDuration) {
        this.treatmentDuration = treatmentDuration;
    }

    public boolean isRecommendedForContinuation() {
        return recommendedForContinuation;
    }

    public void setRecommendedForContinuation(boolean recommendedForContinuation) {
        this.recommendedForContinuation = recommendedForContinuation;
    }

    public String getClinicalObservations() {
        return clinicalObservations;
    }

    public void setClinicalObservations(String clinicalObservations) {
        this.clinicalObservations = clinicalObservations;
    }
    
    // Utility Methods
    public double getAverageSymptomImprovement() {
        if (symptomImprovementRatings.isEmpty()) {
            return 0.0;
        }
        int sum = symptomImprovementRatings.values().stream()
                .mapToInt(Integer::intValue)
                .sum();
        return (double) sum / symptomImprovementRatings.size();
    }
    
    public String getEfficacyCategory() {
        if (efficacyRating >= 4) return "Highly Effective";
        if (efficacyRating >= 3) return "Moderately Effective";
        if (efficacyRating >= 2) return "Marginally Effective";
        return "Low Effectiveness";
    }
    
    public boolean hasSeriousSideEffects() {
        // List of serious side effects to check against
        String[] seriousSideEffects = {"severe", "critical", "life-threatening", "fatal"};
        return observedSideEffects.stream()
                .anyMatch(effect -> {
                    String lowercaseEffect = effect.toLowerCase();
                    for (String serious : seriousSideEffects) {
                        if (lowercaseEffect.contains(serious)) return true;
                    }
                    return false;
                });
    }
    
    // Validation method
    public boolean validateFeedback() {
        if (drugName == null || drugName.trim().isEmpty()) {
            return false;
        }
        if (batchNumber == null || batchNumber.trim().isEmpty()) {
            return false;
        }
        if (patientsSurveyed <= 0) {
            return false;
        }
        if (efficacyRating < 1 || efficacyRating > 5) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DrugEfficacyFeedbackRequest{")
          .append("requestId='").append(getId()).append('\'')
          .append(", drugName='").append(drugName).append('\'')
          .append(", batchNumber='").append(batchNumber).append('\'')
          .append(", efficacyRating=").append(efficacyRating)
          .append(", efficacyCategory='").append(getEfficacyCategory()).append('\'')
          .append(", patientsSurveyed=").append(patientsSurveyed)
          .append(", recommendedForContinuation=").append(recommendedForContinuation)
          .append(", averageSymptomImprovement=").append(String.format("%.2f", getAverageSymptomImprovement()))
          .append(", sideEffectsCount=").append(observedSideEffects.size())
          .append(", hasSeriousSideEffects=").append(hasSeriousSideEffects())
          .append('}');
        return sb.toString();
    }
    
}
