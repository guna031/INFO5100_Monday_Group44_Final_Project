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
public abstract class WorkRequest {

    private String id;
    private String subject;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date dateOfRequest;
    private Date dateOfResolving;

    public WorkRequest() {
        this.id = generateUniqueId();
        this.dateOfRequest = new Date();
        this.status = "Pending";
    }

    public WorkRequest(String message, UserAccount sender, UserAccount receiver) {
        this();
        this.message = message;
        this.sender = sender;
        this.receiver = receiver;
    }

    private String generateUniqueId() {
        return "WR" + System.currentTimeMillis();
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return receiver;
    }

    public void setReciever(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDateOfRequest() {
        return dateOfRequest;
    }

    public void setDateOfRequest(Date dateOfRequest) {
        this.dateOfRequest = dateOfRequest;
    }

    public Date getDateOfResolving() {
        return dateOfResolving;
    }

    public void setDateOfResolving(Date dateOfResolving) {
        this.dateOfResolving = dateOfResolving;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return status;
    }

}
