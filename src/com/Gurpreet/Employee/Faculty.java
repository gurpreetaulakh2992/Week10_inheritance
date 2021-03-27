package com.Gurpreet.Employee;

import com.Gurpreet.Gender;
import com.Gurpreet.Vehicle.Vehicle;

public class Faculty extends Employee{
    String department;


    public Faculty(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary, String department) {
        super(id, firstName, lastName, gender, vehicle, totalSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
