public abstract class BaiTap45_PhuongTienDiChuyen {
    protected String Loaiphuongtien;
    protected BaiTap45_HangSanXuat hsx;

    public BaiTap45_PhuongTienDiChuyen(String loaiphuongtien, BaiTap45_HangSanXuat hsx) {
        Loaiphuongtien = loaiphuongtien;
        this.hsx = hsx;
    }

    public String getLoaiphuongtien() {
        return Loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        Loaiphuongtien = loaiphuongtien;
    }

    public String Laytenhangsanxuat(){
        return this.hsx.getTenhangsanxuat();
    }

    void Batdau(){
        System.out.println("Bat dau");
    }
    void Tangtoc(){
        System.out.println("Tang toc");
    }
    void Ketthuc(){
        System.out.println("Ket thuc");
    }
    public abstract double Layvantoc();


}
