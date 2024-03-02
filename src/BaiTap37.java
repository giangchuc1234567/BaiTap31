public class BaiTap37 {
    public static void main(String[] args) {
        BaiTap37_Lop lop1 = new BaiTap37_Lop("Lop a","Khoa Cntt");
        BaiTap37_Ngay ngay1 = new BaiTap37_Ngay(11,2,2022);
        BaiTap37_SinhVien sv1 = new BaiTap37_SinhVien("A121","Nguyen A",ngay1,lop1,5.6);

        BaiTap37_Lop lop2 = new BaiTap37_Lop("Lop b","Khoa TA");
        BaiTap37_Ngay ngay2 = new BaiTap37_Ngay(22,2,2022);
        BaiTap37_SinhVien sv2 = new BaiTap37_SinhVien("B343","Nguyen B",ngay2, lop2,3.9);

        System.out.println("Ten khoa : "+sv1.Laytenkhoa());
        System.out.println("Kiem tra thi dat : "+sv1.Kiemtrathidat());
        System.out.println("Ten khoa : "+sv2.Laytenkhoa());
        System.out.println("Kiem tra thi dat : "+sv2.Kiemtrathidat());
        System.out.println("Kiem tra ngay sinh giong nhau sv1-sv2 : "+sv1.Kiemtracungngaysinh(sv2));
    }
}
