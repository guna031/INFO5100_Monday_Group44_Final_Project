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
public class QualityControlAndAssuranceRequest extends WorkRequest{
    
    private String batchNumber;
    private String drugName;
    private int batchSize;
    private Date manufacturingDate;
    private Date expiryDate;
    private ArrayList<String> testParameters;
    private HashMap<String, String> testResults;
    private boolean passedQualityCheck;
    private String qualityGrade;
    private String inspectorComments;
    
//    public QualityControlAndAssuranceRequest(String message, UserAccount sender, UserAccount receiver,
//            String batchNumber, String drugName, int batchSize) {
//        super(message, sender, receiver);
//        this.batchNumber = batchNumber;
//        this.drugName = drugName;
//        this.batchSize = batchSize;
//        this.testParameters = new ArrayList<>();
//        this.testResults = new HashMap<>();
//        this.passedQualityCheck = false;
//    }
    
    // Getters and Setters
    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(int batchSize) {
        this.batchSize = batchSize;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Date manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public ArrayList<String> getTestParameters() {
        return testParameters;
    }

    public void addTestParameter(String parameter) {
        this.testParameters.add(parameter);
    }

    public HashMap<String, String> getTestResults() {
        return testResults;
    }

    public void addTestResult(String parameter, String result) {
        this.testResults.put(parameter, result);
    }

    public boolean isPassedQualityCheck() {
        return passedQualityCheck;
    }

    public void setPassedQualityCheck(boolean passedQualityCheck) {
        this.passedQualityCheck = passedQualityCheck;
        setStatus(passedQualityCheck ? "APPROVED" : "REJECTED");
    }

    public String getQualityGrade() {
        return qualityGrade;
    }

    public void setQualityGrade(String qualityGrade) {
        this.qualityGrade = qualityGrade;
    }

    public String getInspectorComments() {
        return inspectorComments;
    }

    public void setInspectorComments(String inspectorComments) {
        this.inspectorComments = inspectorComments;
    }
    
    // Utility Methods
    public boolean isTestingComplete() {
        return testParameters.size() == testResults.size();
    }
    
    public boolean hasExpired() {
        if(expiryDate == null) return false;
        return new Date().after(expiryDate);
    }
    
    @Override
    public String toString() {
        return "QualityControlRequest{" +
                "requestId='" + getId() + '\'' +
                ", batchNumber='" + batchNumber + '\'' +
                ", drugName='" + drugName + '\'' +
                ", passedQC=" + passedQualityCheck +
                ", grade='" + qualityGrade + '\'' +
                ", status='" + getStatus() + '\'' +
                '}';
    }
    
}
