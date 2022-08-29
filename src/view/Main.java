package view;

import java.util.Scanner;

import static controller.Manager.*;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            Scanner scanner=new Scanner(System.in);
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    addEmployeeFullTime();
                    break;
                case 2:
                    addEmployeePartTime();
                    break;
                case 3:
                    displayListOfEmployee();
                    break;
                case 4:
                    System.out.println("Mức lương trung bình là "+ getAverage());
                    break;
                case 5:
                    System.out.println(getListOfEmployeeBelowAverage());
                    break;
                case 6:
                    System.out.println("Tổng lương của nhân viên part time là "+ getSumPartTime());
                    break;
                case 7:
                    System.out.println(sortEmployeeFullTimeBySalary());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn số");

            }

        } while(choice!=0);
    }

    private static void showMenu() {
        System.out.println("--Danh mục--");
        System.out.println("1. Thêm nhân viên toàn thời gian");
        System.out.println("2. Thêm nhân viên bán thời gian");
        System.out.println("3. Hiển thị danh sách nhân viên");
        System.out.println("4. Tính lương trung bình");
        System.out.println("5. Danh sách nhân viên toàn thời gian có mức lương thấp hơn trung bình");
        System.out.println("6. Tổng lương phải trả cho nhân viên bán thời gian");
        System.out.println("7. Sắp xếp nhân viên toàn thời gian theo mức lương tăng dần");
        System.out.println("0. Thoát");
    }

}
