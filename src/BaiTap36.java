public class BaiTap36 {
    public static void main(String[] args) {
        BaiTap36_Ngay ngay1 = new BaiTap36_Ngay(11,1,2011);
        BaiTap36_Ngay ngay2 = new BaiTap36_Ngay(22,2,2022);

        BaiTap36_HangSanXuat hang1 = new BaiTap36_HangSanXuat("Chuc","VN");
        BaiTap36_HangSanXuat hang2 = new BaiTap36_HangSanXuat("Che","USA");

        BaiTap36_BoPhim phim1 = new BaiTap36_BoPhim("a",ngay1.getNam(),10,hang1,ngay1);
        BaiTap36_BoPhim phim2 = new BaiTap36_BoPhim("b",ngay2.getNam(),20,hang2,ngay2);

        System.out.println("So sanh gia ve phim 1 re hon phim 2 : "+phim1.Kiemtragiaverehon(phim2));
        System.out.println("Ten hang san xuat phim 1 : "+phim1.Laytenhangsanxuat());
        System.out.println("Ten hang san xuat phim 2 : "+phim2.Laytenhangsanxuat());
        System.out.println("Gia ve phim 1 sau khi giam 10% : "+phim1.Giavekhuyenmai());
        System.out.println("Gia ve phim 2 sau khi giam 10% : "+phim2.Giavekhuyenmai());
    }
}
