public class BaiTap45 {
    public static void main(String[] args) {
        BaiTap45_HangSanXuat hsx1 = new BaiTap45_HangSanXuat("Hang ABC","VN-ABC");
        BaiTap45_HangSanXuat hsx2 = new BaiTap45_HangSanXuat("Hang EFH","VN-EFH");

        BaiTap45_PhuongTienDiChuyen ptdc1 = new BaiTap45_XeTai( "Xe Tai",hsx1,"Xang") ;
        BaiTap45_MayBay ptdc2 = new BaiTap45_MayBay( "May Bay",hsx2,"Xang") ;
        System.out.println("------------");
        System.out.println(ptdc1.Laytenhangsanxuat());
        ptdc1.Batdau();
        ptdc1.Tangtoc();
        System.out.println(ptdc1.Loaiphuongtien+" Van Toc : "+ptdc1.Layvantoc());
        ptdc1.Ketthuc();
        System.out.println("------------");

        System.out.println(ptdc2.Laytenhangsanxuat());
        ptdc2.Batdau();
        ptdc2.Tangtoc();
        System.out.println(ptdc2.Loaiphuongtien+" Van Toc : "+ptdc2.Layvantoc());
        ptdc2.Catcanh();
        ptdc2.Hacanh();
        ptdc2.Ketthuc();

    }
}
