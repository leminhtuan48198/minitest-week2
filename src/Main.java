import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NhanVien nv1=new NhanVienFullTime("1","Tuấn",48,"0987766","@gmail.com",1000000,100000,20000000);
        NhanVien nv2=new NhanVienFullTime("2","Hải",48,"0987766","@gmail.com",2000000,300000,15000000);
        NhanVien nv3=new NhanVienFullTime("3","Trường",48,"0987766","@gmail.com",3000000,400000,10000000);
       NhanVien nv4=new NhanVienPartTime("4","Vinh",18,"08786779","@g",100);
       NhanVien nv5=new NhanVienPartTime("4","Hiếu",18,"08786779","@g",200);
       NhanVien nv6=new NhanVienPartTime("4","Hân",18,"08786779","@g",300);
        NhanVien[] listOfNhanVien={nv1,nv2,nv3,nv4,nv5,nv6};
        //tinh luong trung binh

          double tong=0;
        for (NhanVien e:listOfNhanVien
             ) {
            tong+=e.getLuong();
        }
        double trungBinh=tong/listOfNhanVien.length;
        System.out.println("Mức lương trung bình là");
        System.out.println(trungBinh);

        // in ra nhung nhan vien thap hon trung binh
        System.out.println("Danh sách nhân viên có lương thấp hơn mức trung bình");
        for (NhanVien e:listOfNhanVien
             ) {
            if(e.getLuong()<trungBinh){
                System.out.println(e.getHoTen()+" có lương là "+e.getLuong());
            }

        }
        // tinh so luong phai tra cho tat ca nhan vien parttime

        double tongPartTime=0;
        for (NhanVien nhanVien:listOfNhanVien
             ) {
            if(nhanVien instanceof NhanVienPartTime){
                NhanVienPartTime nhanVienPartTime=(NhanVienPartTime) nhanVien;
                tongPartTime+= nhanVienPartTime.getLuong();
            }
        }
        System.out.println("Tổng lương của nhân viên part time là");
        System.out.println(tongPartTime);

        // sap xep nhan vien toan thoi gian theo luong tang dan
        //Cach 1
        System.out.println("Sắp xếp danh sách nhân viên full time theo lương tăng dần");
        NhanVien[] listOfFulltime={nv1,nv2,nv3};
        Arrays.sort(listOfFulltime);
        for (NhanVien e:listOfFulltime
             ) {
            System.out.println(e.getHoTen()+" "+e.getLuong());

        }
        // Cach 2
        // dem so nhan vien full time trong mang
        int count=0;
        for (NhanVien e:listOfNhanVien
             ) {
            if(e instanceof NhanVienFullTime ){
                count++;
            }
        }
        // tao mang chua nhan vien fulltime
        NhanVienFullTime[] danhSachNhanVienFullTime=new NhanVienFullTime[count];
        int index=0;
        for (NhanVien e:listOfNhanVien
             ) {
            if(e instanceof NhanVienFullTime){
                 danhSachNhanVienFullTime[index]=(NhanVienFullTime)e;
                 index++;

            }
        }
        // In ra danh sach nhan vien fulltime
        System.out.println("In ra danh sách nhân viên full time");
        for (NhanVienFullTime e:danhSachNhanVienFullTime
        ) {
            System.out.println(e.getHoTen()+" "+e.getLuong());
        }
        // Sap xep mang
        Arrays.sort(danhSachNhanVienFullTime);
        // In ra danh sach nhan vien fulltime da sap xep theo luong
        System.out.println("In ra danh sách nhân viên full time đã sắp xếp theo lương tăng dần ");
        for (NhanVienFullTime e:danhSachNhanVienFullTime
             ) {
            System.out.println(e.getHoTen()+" có lương là "+e.getLuong());
        }
    }
}
