/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Organization;

import ecosystemworkflow.Employee.EmployeeDirectory;
import ecosystemworkflow.Role.Role;
import ecosystemworkflow.UserAccount.UserAccountDirectory;
import ecosystemworkflow.WorkFlow.WorkRequestDirectory;
import java.util.HashSet;

/**
 *
 * @author hotragn
 */
public abstract class Organization {

    private String name;
    private int iD;
    private WorkRequestDirectory workRequests;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private static int count = 0;
    public HashSet<Role> role;
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public enum OrganizationType {
        DrugProductionOrganization("Drug Production Organization"),
        QualityControlAndAssuranceOrganization("Quality Control and assurance Organization"),
        TransportOrganization("Transport Organization"),
        InventoryManagementOrganisation("Inventory Management Organisation"),
        HospitalAdministrationOrganization("Hospital Administration Organization"),
        ClinicalOrganization("Clinical Organization"),
        BloodCollectionOrganization("Blood Collection Organization"),
        BloodProcessingAndStorageOrganization("Blood Processing and storage Organization"),
        ChemicalCompoundResearchOrganization ("Chemical Compound Research Organization"),
        ClinicalTrialsManagementOrganization ("Clinical Trials Management Organization");


        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workRequests = new WorkRequestDirectory();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        iD = count;
      role = new HashSet<>();
        ++count;
    }

   public abstract HashSet<Role> getSupportedRole();
    public String getOrganizationName() {
        return name;
    }

    public void setOrganizationName(String organizationName) {
        this.name = organizationName;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationCode() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkRequestDirectory getWorkRequestList() {
        return workRequests;
    }

    public void setWorkRequestList(WorkRequestDirectory workRequestList) {
        this.workRequests = workRequestList;
    }

    @Override
    public String toString() {
        return name;
    }

}
