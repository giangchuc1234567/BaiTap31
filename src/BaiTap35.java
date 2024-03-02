public class BaiTap35 {
    public static void main(String[] args) {
        BaiTap35_Ngay ngay1 = new BaiTap35_Ngay(11,1,2011);
        BaiTap35_Ngay ngay2 = new BaiTap35_Ngay(22,2,2022);

        BaiTap35_TacGia tacgia1 = new BaiTap35_TacGia("Chuc",ngay1);
        BaiTap35_TacGia tacgia2 = new BaiTap35_TacGia("Che",ngay2);

        BaiTap35_Sach Sach1 = new BaiTap35_Sach("Sach a",100, ngay1.getNam(), tacgia1);
        BaiTap35_Sach Sach2 = new BaiTap35_Sach("Sach b",200, ngay2.getNam(), tacgia2);
        Sach1.Intensach();
        Sach2.Intensach();
        System.out.println("Kiem tra nam sx sach 1 - sach 2 : " +Sach1.Kiemtranamsanxuat(Sach2));
    }
}
