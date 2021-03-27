package com.Gurpreet.Employee;

import com.Gurpreet.Gender;
import com.Gurpreet.Person;
import com.Gurpreet.Vehicle.Vehicle;

public class Employee extends Person {
    double totalSalary;

    public Employee(double totalSalary) {
        this.totalSalary = totalSalary;
    }

    public Employee(int id, String firstName, String lastName, Gender gender, Vehicle vehicle, double totalSalary) {
        super(id, firstName, lastName, gender, vehicle);
        this.totalSalary = totalSalary;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
