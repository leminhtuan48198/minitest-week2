package model;

import java.io.Serializable;

public class EmployeePartTime extends Employee implements Serializable {
    private double timeWork;

    public EmployeePartTime() {
    }

    public EmployeePartTime(String employeeId, String name, int age, String phoneNumber, String email, double timeWork) {
        super(employeeId, name, age, phoneNumber, email);
        this.timeWork = timeWork;
    }

    public EmployeePartTime(double timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public double getSalary() {
        return timeWork *100000;
    }

    @Override
    public String toString() {
        return super.toString()+"EmployeePartTime{" +
                "timeWork=" + timeWork +
                '}';
    }
}
