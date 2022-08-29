package model;

import java.io.Serializable;

public abstract class Employee implements Comparable<Employee>, Serializable {
    private String EmployeeId;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;

    public Employee() {
    }

    public Employee(String EmployeeId, String name, int age, String phoneNumber, String email) {
        this.EmployeeId = EmployeeId;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.EmployeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getSalary();

    @Override
    public int compareTo(Employee o) {
double a =this.getSalary()-o.getSalary();
        if(a<0){
            return -1;
        }else if(a>0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
