/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.HospitalAdmin;

import java.util.ArrayList;

/**
 *
 * @author varun
 */
public class HospitalAdminDirectory {
    
    private ArrayList<HospitalAdmin> hospitalAdminList;
    
    public HospitalAdmin createHospitalAdmin() {
        HospitalAdmin admin = new HospitalAdmin();
        hospitalAdminList.add(admin);
        return admin;
    }
    
}
