public class NhanVienFullTime extends NhanVien{
    private double soTienThuong;
    private double soTienPhat;
    private double luongCung;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(String maNhanVien, String hoTen, int tuoi, String soDienThoai, String email, double soTienThuong, double soTienPhat, double luongCung) {
        super(maNhanVien, hoTen, tuoi, soDienThoai, email);
        this.soTienThuong = soTienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }


    @Override
    public double getLuong() {
        return luongCung-soTienPhat+soTienThuong;
    }
}
