package controller;

import model.NhanVien;
import model.NhanVienFullTime;
import model.NhanVienPartTime;

import java.util.*;

import static storage.ReadWriteFile.readFile;
import static storage.ReadWriteFile.writeFile;

public class Manager {

    public static List<NhanVien> listOfNhanVien=readFile();
    public static void themNhanVienFullTime(){
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
        double tienThuong=scanner1.nextDouble();
        System.out.println("Nhập tiền phạt");
        double tienPhat=scanner1.nextDouble();
        System.out.println("Nhập lương cứng");
        double luongCung=scanner1.nextDouble();
        NhanVienFullTime nhanVienFullTime=new NhanVienFullTime(id,name,age,phoneNumber,email,tienThuong,tienPhat,luongCung);
        listOfNhanVien.add(nhanVienFullTime);
        writeFile(listOfNhanVien);
    }
    public static void themNhanVienPartTime(){
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
        double hourWork=scanner1.nextDouble();
        NhanVienPartTime nhanVienPartTime=new NhanVienPartTime(id,name,age,phoneNumber,email,hourWork);
        listOfNhanVien.add(nhanVienPartTime);
        writeFile(listOfNhanVien);
    }
    public static void hienThiDanhSachNhanVien(){
        for (NhanVien nhanVien:listOfNhanVien
             ) {
            System.out.println(nhanVien);
        }
    }
    public static double getLuongTrungBinh(){
        double tong=0;
        for (NhanVien e:listOfNhanVien
        ) {
            tong+=e.getLuong();
        }
        double trungBinh=tong/listOfNhanVien.size();
        return  trungBinh;
    }
public static List<NhanVienFullTime> getDanhSachFullTimeLuongThap() {
    List<NhanVienFullTime> danhSachFullTimeLuongThap = new ArrayList<>();
    double trungBinh = getLuongTrungBinh();
    for (NhanVien e : listOfNhanVien
    ) {
        if (e instanceof NhanVienFullTime) {
            NhanVienFullTime fullTime = (NhanVienFullTime) e;
            if (fullTime.getLuong() < trungBinh) {
                danhSachFullTimeLuongThap.add(fullTime);
            }

        }
    }return  danhSachFullTimeLuongThap;
}

       public static double getTongLuongPartTime(){
           double tongPartTime=0;
           for (NhanVien nhanVien:listOfNhanVien
           ) {
               if(nhanVien instanceof NhanVienPartTime){
                   NhanVienPartTime nhanVienPartTime=(NhanVienPartTime) nhanVien;
                   tongPartTime+= nhanVienPartTime.getLuong();
               }
           }
           return  tongPartTime;
       }
       public static List<NhanVienFullTime> sapXepNhanVienFullTimeTheoLuong(){
           List<NhanVienFullTime> nhanVienFullTimes=new ArrayList<>();
        for (NhanVien nhanVien:listOfNhanVien
                ) {
               if(nhanVien instanceof NhanVienFullTime){
                   NhanVienFullTime fullTime=(NhanVienFullTime) nhanVien;
                   nhanVienFullTimes.add(fullTime);
               }
           }
           Collections.sort(nhanVienFullTimes);
        return nhanVienFullTimes;
       }




    }
