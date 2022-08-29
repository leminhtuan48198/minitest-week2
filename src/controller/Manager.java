package controller;

import model.Employee;
import model.EmployeeFullTime;
import model.EmployeePartTime;

import java.util.*;

import static storage.ReadWriteFile.readFile;
import static storage.ReadWriteFile.writeFile;

public class Manager {

    public static List<Employee> listOfEmployee =readFile();
    public static void addEmployeeFullTime(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã nhân viên ");
        String id=scanner.nextLine();
        System.out.println("Nhập họ và tên");
        String name=scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age=scanner.nextInt();
        System.out.println("Nhập số điện thoại");
        Scanner scanner1=new Scanner(System.in);
        String phoneNumber=scanner1.nextLine();
        System.out.println("Nhập email ");
        String email=scanner1.nextLine();
        System.out.println("Nhập tiền thưởng");
        double bonus=scanner1.nextDouble();
        System.out.println("Nhập tiền phạt");
        double fine=scanner1.nextDouble();
        System.out.println("Nhập lương cứng");
        double normalSalary=scanner1.nextDouble();
        EmployeeFullTime employeeFullTime=new EmployeeFullTime(id,name,age,phoneNumber,email,bonus,fine,normalSalary);
        listOfEmployee.add(employeeFullTime);
        writeFile(listOfEmployee);
    }
    public static void addEmployeePartTime(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập mã nhân viên ");
        String id=scanner.nextLine();
        System.out.println("Nhập họ và tên");
        String name=scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age=scanner.nextInt();
        System.out.println("Nhập số điện thoại");
        Scanner scanner1=new Scanner(System.in);
        String phoneNumber=scanner1.nextLine();
        System.out.println("Nhập email ");
        String email=scanner1.nextLine();
        System.out.println("Nhập số giờ làm việc");
        double timeWork=scanner1.nextDouble();
        EmployeePartTime employeePartTime=new EmployeePartTime(id,name,age,phoneNumber,email,timeWork);
        listOfEmployee.add(employeePartTime);
        writeFile(listOfEmployee);
    }
    public static void displayListOfEmployee(){
        for (Employee employee : listOfEmployee
             ) {
            System.out.println(employee);
        }
    }
    public static double getAverage(){
        double sum=0;
        for (Employee e: listOfEmployee
        ) {
            sum+=e.getSalary();
        }
        double average=sum/ listOfEmployee.size();
        return  average;
    }
public static List<EmployeeFullTime> getListOfEmployeeBelowAverage() {
    List<EmployeeFullTime> listOfEmployeeBelowAverage = new ArrayList<>();
    double average = getAverage();
    for (Employee employee : listOfEmployee
    ) {
        if (employee instanceof EmployeeFullTime) {
            EmployeeFullTime fullTime = (EmployeeFullTime) employee;
            if (fullTime.getSalary() < average) {
                listOfEmployeeBelowAverage.add(fullTime);
            }

        }
    }return  listOfEmployeeBelowAverage;
}

       public static double getSumPartTime(){
           double sumPartTime=0;
           for (Employee employee : listOfEmployee
           ) {
               if(employee instanceof EmployeePartTime){
                   EmployeePartTime employeePartTime=(EmployeePartTime) employee;
                   sumPartTime+= employeePartTime.getSalary();
               }
           }
           return  sumPartTime;
       }
       public static List<EmployeeFullTime> sortEmployeeFullTimeBySalary(){
           List<EmployeeFullTime> employeeFullTimes=new ArrayList<>();
        for (Employee employee : listOfEmployee
                ) {
               if(employee instanceof EmployeeFullTime){
                   EmployeeFullTime fullTime=(EmployeeFullTime) employee;
                   employeeFullTimes.add(fullTime);
               }
           }
           Collections.sort(employeeFullTimes);
        return employeeFullTimes;
       }




    }
