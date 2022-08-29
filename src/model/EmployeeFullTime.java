package model;

import java.io.Serializable;

public class EmployeeFullTime extends Employee implements Serializable {
    private double bonus;
    private double fine;
    private double normalSalary;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(String employeeId, String name, int age, String phoneNumber, String email, double bonus, double fine, double normalSalary) {
        super(employeeId, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.normalSalary = normalSalary;
    }


    @Override
    public double getSalary() {
        return normalSalary - fine + bonus;
    }

    @Override
    public String toString() {
        return super.toString()+"EmployeeFullTime{" +
                "bonus=" + bonus +
                ", fine=" + fine +
                ", normalSalary=" + normalSalary +
                '}';
    }
}
