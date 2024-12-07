/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Employee;

import java.util.ArrayList;

/**
 *
 * @author gunav
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;
    
    public EmployeeDirectory()
    {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() 
    {
        return employeeList;
    }
    
    public Employee createEmployee(String name)
    {
        Employee em= new Employee();
        em.setEmpolyeeName(name);
        employeeList.add(em);
        return em;
    }
 
    
}
