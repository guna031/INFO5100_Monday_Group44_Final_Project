package ecosystemworkflow;

import ecosystemworkflow.Employee.Employee;
import ecosystemworkflow.Enterprise.BloodDonationEnterprise;
import ecosystemworkflow.Enterprise.Enterprise;
import ecosystemworkflow.Enterprise.HealthCareEnterprise;
import ecosystemworkflow.Enterprise.LogisticEnterprise;
import ecosystemworkflow.Enterprise.PharmaceuticalEnterprise;
import ecosystemworkflow.Enterprise.ResearchAndDevelopmentEnterprise;
import ecosystemworkflow.Network.Network;
import ecosystemworkflow.Organization.BloodCollectionOrganization;
import ecosystemworkflow.Organization.BloodProcessingAndStorageOrganization;
import ecosystemworkflow.Organization.ChemicalCompoundResearchOrganization;
import ecosystemworkflow.Organization.ClinicalOrganization;
import ecosystemworkflow.Organization.ClinicalTrialsManagementOrganization;
import ecosystemworkflow.Organization.DrugProductionOrganization;
import ecosystemworkflow.Organization.HospitalAdministrationOrganization;
import ecosystemworkflow.Organization.Organization;
import ecosystemworkflow.Organization.QualityControlAndAssuranceOrganization;
import ecosystemworkflow.Organization.TransportOrganization;
import ecosystemworkflow.Role.ChemicalCompoundResearcherRole;
import ecosystemworkflow.Role.ClinicalOrganizationRole;
import ecosystemworkflow.Role.DistributionManagerRole;
import ecosystemworkflow.Role.HospitalAdministratorRole;
import ecosystemworkflow.Role.LogisticsCoordinatorRole;
import ecosystemworkflow.Role.PhlebotomistRole;
import ecosystemworkflow.Role.ProductionManagerRole;
import ecosystemworkflow.Role.QualityAnalystRole;
import ecosystemworkflow.Role.SystemAdminRole;
import ecosystemworkflow.Role.TrailCoordinatorRole;
import ecosystemworkflow.UserAccount.UserAccount;
import ecosystemworkflow.WorkFlow.WorkRequestDirectory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gunav
 */
public class ConfigureASystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();
        system.setWorkRequestList(new WorkRequestDirectory());
        
       
        
        Network network = system.createAndAddNetwork();
        network.setName("Global Healthcare Supply Network");

        Employee sysAdmin = system.getEmployeeDirectory().createEmployee("System Admin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", sysAdmin, new SystemAdminRole());
        ua.setWorkQueue(new WorkRequestDirectory());
        System.out.println("System Admin created with username: " + ua.getUserName());
        System.out.println("System Admin created - Username: " + ua.getUserName() + ", Password: " + ua.getPassword());


        HealthCareEnterprise hospital = (HealthCareEnterprise) network.getEnterprises()
                .createAndAddEnterprise("City Hospital", Enterprise.EnterpriseType.HealthcareService);
        hospital.setWorkRequestList(new WorkRequestDirectory());

        PharmaceuticalEnterprise pharma = (PharmaceuticalEnterprise) network.getEnterprises()
                .createAndAddEnterprise("PharmaCorp", Enterprise.EnterpriseType.PharmaceuticalManufacturer);
        pharma.setWorkRequestList(new WorkRequestDirectory());

        BloodDonationEnterprise bloodBank = (BloodDonationEnterprise) network.getEnterprises()
                .createAndAddEnterprise("BloodBank", Enterprise.EnterpriseType.BloodDonation);
        bloodBank.setWorkRequestList(new WorkRequestDirectory());

        LogisticEnterprise logistics = (LogisticEnterprise) network.getEnterprises()
                .createAndAddEnterprise("LogisticsCo", Enterprise.EnterpriseType.LogisticsService);
        logistics.setWorkRequestList(new WorkRequestDirectory());

        ResearchAndDevelopmentEnterprise rAndD = (ResearchAndDevelopmentEnterprise) network.getEnterprises()
                .createAndAddEnterprise("R&D Labs", Enterprise.EnterpriseType.ResearchAndDevelopment);
        rAndD.setWorkRequestList(new WorkRequestDirectory());
        

        Organization hospitalAdmin = new HospitalAdministrationOrganization();
        hospitalAdmin.setOrganizationName("Hospital Administration");
        hospitalAdmin.setWorkRequestList(new WorkRequestDirectory());
        hospital.getOrganizationDirectory().getOrganizations().add(hospitalAdmin);

        Organization clinicalOrg = new ClinicalOrganization();
        clinicalOrg.setOrganizationName("Clinical Trials");
        clinicalOrg.setWorkRequestList(new WorkRequestDirectory());
        hospital.getOrganizationDirectory().getOrganizations().add(clinicalOrg);

        Organization drugProduction = new DrugProductionOrganization();
        drugProduction.setOrganizationName("Drug Production");
        drugProduction.setWorkRequestList(new WorkRequestDirectory());
        pharma.getOrganizationDirectory().getOrganizations().add(drugProduction);

        Organization qualityControl = new QualityControlAndAssuranceOrganization();
        qualityControl.setOrganizationName("Quality Control");
        qualityControl.setWorkRequestList(new WorkRequestDirectory());
        pharma.getOrganizationDirectory().getOrganizations().add(qualityControl);

        Organization bloodCollection = new BloodCollectionOrganization();
        bloodCollection.setOrganizationName("Blood Collection");
        bloodCollection.setWorkRequestList(new WorkRequestDirectory());
        bloodBank.getOrganizationDirectory().getOrganizations().add(bloodCollection);

        Organization bloodProcessing = new BloodProcessingAndStorageOrganization();
        bloodProcessing.setOrganizationName("Blood Processing");
        bloodProcessing.setWorkRequestList(new WorkRequestDirectory());
        bloodBank.getOrganizationDirectory().getOrganizations().add(bloodProcessing);

        Organization transport = new TransportOrganization();
        transport.setOrganizationName("Transport");
        transport.setWorkRequestList(new WorkRequestDirectory());
        logistics.getOrganizationDirectory().getOrganizations().add(transport);

        Organization chemicalResearch = new ChemicalCompoundResearchOrganization();
        chemicalResearch.setOrganizationName("Chemical Research");
        chemicalResearch.setWorkRequestList(new WorkRequestDirectory());
        rAndD.getOrganizationDirectory().getOrganizations().add(chemicalResearch);
        
        Organization clinicalTrialsManagement = new ClinicalTrialsManagementOrganization();
        clinicalTrialsManagement.setOrganizationName("Clinical Trials Management");
        clinicalTrialsManagement.setWorkRequestList(new WorkRequestDirectory());
        rAndD.getOrganizationDirectory().getOrganizations().add(clinicalTrialsManagement);


        Employee empHA = hospital.getEmployeeDirectory().createEmployee("Hospital Admin");
        UserAccount uaHA = hospitalAdmin.getUserAccountDirectory().createUserAccount("hospital", "hospital", empHA, new HospitalAdministratorRole());
        uaHA.setWorkQueue(new WorkRequestDirectory());

        Employee empPM = pharma.getEmployeeDirectory().createEmployee("Production Manager");
        UserAccount uaPM = drugProduction.getUserAccountDirectory().createUserAccount("production", "production", empPM, new ProductionManagerRole());
        uaPM.setWorkQueue(new WorkRequestDirectory());

        Employee empQA = pharma.getEmployeeDirectory().createEmployee("Quality Analyst");
        UserAccount uaQA = qualityControl.getUserAccountDirectory().createUserAccount("qa", "qa", empQA, new QualityAnalystRole());
        uaQA.setWorkQueue(new WorkRequestDirectory());

        Employee empPhlebotomist = bloodBank.getEmployeeDirectory().createEmployee("Blood Bank Collector");
        UserAccount uaPhlebotomist = bloodCollection.getUserAccountDirectory().createUserAccount("blood", "blood", empPhlebotomist, new PhlebotomistRole());
        uaPhlebotomist.setWorkQueue(new WorkRequestDirectory());

        Employee bloodBankManager = bloodBank.getEmployeeDirectory().createEmployee("Blood Bank Manager");
        UserAccount uabBManager = bloodProcessing.getUserAccountDirectory().createUserAccount("blod", "blod", bloodBankManager, new DistributionManagerRole());
        uabBManager.setWorkQueue(new WorkRequestDirectory());

        Employee empLogistics = logistics.getEmployeeDirectory().createEmployee("Logistics Manager");
        UserAccount uaLogistics = transport.getUserAccountDirectory().createUserAccount("logistics", "logistics", empLogistics, new LogisticsCoordinatorRole());
        uaLogistics.setWorkQueue(new WorkRequestDirectory());

        Employee empResearcher = rAndD.getEmployeeDirectory().createEmployee("Lead Researcher");
        UserAccount uaResearcher = chemicalResearch.getUserAccountDirectory().createUserAccount("research", "research", empResearcher, new ChemicalCompoundResearcherRole());
        uaResearcher.setWorkQueue(new WorkRequestDirectory());
        
        Employee empClinical = hospital.getEmployeeDirectory().createEmployee("Clinical Trial Manager");
        UserAccount uaClinical = clinicalOrg.getUserAccountDirectory().createUserAccount(
            "clinical", "clinical", 
            empClinical, 
            new ClinicalOrganizationRole()
        );
        uaClinical.setWorkQueue(new WorkRequestDirectory());
       
        
        Employee empTrialCoord = rAndD.getEmployeeDirectory().createEmployee("Trial Coordinator");
        UserAccount uaTrialCoord = clinicalTrialsManagement.getUserAccountDirectory().createUserAccount(
            "trial", "trial", 
            empTrialCoord, 
            new TrailCoordinatorRole()
        );
        uaTrialCoord.setWorkQueue(new WorkRequestDirectory());
        
        
        
     

        return system;
    }
}
