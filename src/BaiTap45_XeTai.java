public class BaiTap45_XeTai extends BaiTap45_PhuongTienDiChuyen{
    private String Loainhienlieu;


    public BaiTap45_XeTai(String loaiphuongtien, BaiTap45_HangSanXuat hsx, String loainhienlieu) {
        super(loaiphuongtien, hsx);
        Loainhienlieu = loainhienlieu;
    }

    @Override
    public double Layvantoc() {
        return 100;
    }
}
