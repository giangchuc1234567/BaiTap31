public class BaiTap37_SinhVien {
    private String Masinhvien, Hotensinhvien;
    private BaiTap37_Ngay Ngay;
    private BaiTap37_Lop Lop;
    private double Diemtrungbinh;

    public BaiTap37_SinhVien(String masinhvien, String hotensinhvien, BaiTap37_Ngay ngay, BaiTap37_Lop lop, double diemtrungbinh) {
        Masinhvien = masinhvien;
        Hotensinhvien = hotensinhvien;
        Ngay = ngay;
        Lop = lop;
        Diemtrungbinh = diemtrungbinh;
    }

    public String getMasinhvien() {
        return Masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        Masinhvien = masinhvien;
    }

    public String getHotensinhvien() {
        return Hotensinhvien;
    }

    public void setHotensinhvien(String hotensinhvien) {
        Hotensinhvien = hotensinhvien;
    }

    public BaiTap37_Ngay getNgay() {
        return Ngay;
    }

    public void setNgay(BaiTap37_Ngay ngay) {
        Ngay = ngay;
    }

    public BaiTap37_Lop getLop() {
        return Lop;
    }

    public void setLop(BaiTap37_Lop lop) {
        Lop = lop;
    }

    public double getDiemtrungbinh() {
        return Diemtrungbinh;
    }

    public void setDiemtrungbinh(double diemtrungbinh) {
        Diemtrungbinh = diemtrungbinh;
    }

    public String Laytenkhoa(){
        return getLop().getTenKhoa();
    }

    public boolean Kiemtrathidat(){
        if(this.Diemtrungbinh>4){
            return true;
        }else {
            return false;
        }
    }

    public boolean Kiemtracungngaysinh(BaiTap37_SinhVien svkhac){
        return this.Ngay.equals(svkhac.Ngay)  ;
    }
}
