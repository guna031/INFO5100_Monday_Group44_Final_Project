/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import ecosystemworkflow.UserAccount.UserAccount;

/**
 *
 * @author gunav
 */
public class DrugProductionRequest extends WorkRequest{
    
    private String drugName;
    private int quantity;
    private String productionStatus; 
    private String priority;

   
    
    public String getUrgency() {
        return priority;
    }
    
    public void setUrgency(String priority) {
        this.priority = priority;
    }
    
    public DrugProductionRequest(){
        super();
        this.productionStatus = "Requested";  // Initialize production status

    }

//    public DrugProductionRequest(String message, UserAccount sender, UserAccount receiver, String drugName, int quantity) {
//        super(message, sender, receiver);
//        this.drugName = drugName;
//        this.quantity = quantity;
//        this.productionStatus = "Requested"; 
//    }

    // Getters and setters
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

    public String getProductionStatus() {
        return productionStatus;
    }

    public void setProductionStatus(String productionStatus) {
        this.productionStatus = productionStatus;
    }

    @Override
    public String toString() {
        return "DrugProductionRequest{" +
                "requestId='" + getId() + '\'' +
                ", message='" + getMessage() + '\'' +
                ", sender=" + getSender().getUserName() +
//                ", receiver=" + getReciever().getUserName() +
                ", status='" + getStatus() + '\'' +
                ", requestDate=" + getDateOfRequest() + 
                ", resolveDate=" + getDateOfResolving() +
                ", drugName='" + drugName + '\'' +
                ", quantity=" + quantity +
                ", productionStatus='" + productionStatus + '\'' +
                '}';
    }
    
    
    
}
