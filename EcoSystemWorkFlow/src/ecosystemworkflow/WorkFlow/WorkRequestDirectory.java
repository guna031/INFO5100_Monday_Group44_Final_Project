
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.WorkFlow;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class WorkRequestDirectory {
    
        private ArrayList<WorkRequest> workRequests;
         private static final int MAX_QUEUE_SIZE = 100;

    public ArrayList<WorkRequest> getWorkRequests() {
        return workRequests;
    }

    public void setWorkRequests(ArrayList<WorkRequest> workRequests) {
        this.workRequests = workRequests;
    }
    
    public WorkRequestDirectory() {
        workRequests = new ArrayList<>();
    }
    
    public void addWorkRequest(WorkRequest request) {
        if(request != null) {
            workRequests.add(request);
        }
    }
    
    public boolean isQueueFull() {
        return workRequests.size() >= MAX_QUEUE_SIZE;
    }
        

    
}
