public class BaiTap31_HoaDonCaFe {
    private String TenCafe;
    private double giatien , soluong;

    public BaiTap31_HoaDonCaFe(String ten , double gia , double soluong){
        this.TenCafe = ten;
        this.giatien = gia;
        this.soluong = soluong;
    }

    public double Tinhtongtien(){
        return this.giatien * this.soluong;
    }
}
