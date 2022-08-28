package model;

import java.io.Serializable;

public class NhanVienPartTime extends NhanVien implements Serializable {
    private double soGioLamViec;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double soGioLamViec) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.soGioLamViec = soGioLamViec;
    }

    public NhanVienPartTime(double soGioLamViec) {
        this.soGioLamViec = soGioLamViec;
    }

    @Override
    public double getLuong() {
        return soGioLamViec*100000;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVienPartTime{" +
                "soGioLamViec=" + soGioLamViec +
                '}'+"\n";
    }
}
