/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.UserAccount;

import ecosystemworkflow.Employee.Employee;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.WorkFlow.WorkRequestDirectory;
import java.util.ArrayList;
import org.mindrot.jbcrypt.BCrypt;
//import org.mindrot.jbcrypt.BCrypt

/**
 *
 * @author gunav
 */
    public class UserAccount {

    private String userName;
    private String password;
    private Employee employee;
    private Role role;
    private WorkRequestDirectory workQueue;
    private ArrayList<String> passwordHashes = new ArrayList<>();
    private ArrayList<String> passwordUnHashed = new ArrayList<>();
    private boolean enabled = true; 
    private Organization organization; 

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }


    public void init_new() {
        this.passwordHashes = new ArrayList<>();
        this.passwordUnHashed = new ArrayList<>();
        if (this.password != null) {
//            this.setPassword(this.password);
        }
    }

    public UserAccount() {
        workQueue = new WorkRequestDirectory();
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return this.password;
    }

        public void setPassword(String newPassword) {
        //System.out.println("Set Pass: "+ newPassword);
        if (newPassword != null) {
            // Hash the new password using BCrypt
            String hashedPassword = BCrypt.hashpw(newPassword, BCrypt.gensalt());

            // Check if the new hashed password is not the same as any of the existing hashes
            for (String storedPasswordHash : passwordHashes) {
                if (BCrypt.checkpw(newPassword, storedPasswordHash)) {
                    return;
                }
            }
            
            // Add the new hashed password at the beginning of the list (index 0)
            passwordHashes.add(0, hashedPassword);
            passwordUnHashed.add(0, newPassword);
            this.password = newPassword;
        }
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

     public boolean isEnabled() {
        return enabled;
    }
    
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    
     public boolean checkPassword(String password) {
        if(passwordHashes==null || passwordUnHashed == null){
            init_new();
        }
        if (!passwordHashes.isEmpty()) {
            String latestPasswordHash = passwordHashes.get(0);
            return BCrypt.checkpw(password, latestPasswordHash);
        }
        return this.getPassword().equals(password);
    }
//    
    
    public WorkRequestDirectory getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkRequestDirectory workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return userName;
    }
}
