/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecosystemworkflow.Employee;

/**
 *
 * @author gunav
 */
public class Employee {
    
    private String name;
    private int id;
    private static int count=1;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Employee.count = count;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public Employee()
    {
        id = count;
        count++;
    }

    public String getEmpolyeeName() 
    {
        return name;
    }

    public void setEmpolyeeName(String empolyeeName)
    {
        this.name = empolyeeName;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
