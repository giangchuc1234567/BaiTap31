public class BaiTap45_MayBay extends BaiTap45_PhuongTienDiChuyen{
    private String Loainhienlieu;

    public BaiTap45_MayBay(String loaiphuongtien, BaiTap45_HangSanXuat hsx, String loainhienlieu) {
        super(loaiphuongtien, hsx);
        Loainhienlieu = loainhienlieu;
    }
    public void Catcanh(){
        System.out.println("Cat Canh");
    }
    public void  Hacanh(){
        System.out.println("Ha Canh");
    }

    @Override
    public double Layvantoc() {
        return 1100;
    }
}
