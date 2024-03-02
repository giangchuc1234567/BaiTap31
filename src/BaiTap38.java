public class BaiTap38 {
    public static void main(String[] args) {
        BaiTap38_Ngay ngay1 = new BaiTap38_Ngay(11,1,2011);
        BaiTap38_Ngay ngay2 = new BaiTap38_Ngay(12,1,2011);
        BaiTap38_Ngay ngay3 = new BaiTap38_Ngay(13,1,2011);

        BaiTap38_QuocGia qg1 = new BaiTap38_QuocGia("VN","VietNam");
        BaiTap38_QuocGia qg2 = new BaiTap38_QuocGia("VN11","VietNam11");
        BaiTap38_QuocGia qg3 = new BaiTap38_QuocGia("VN22","VietNam22");

        BaiTap38_HangSanXuat hsx1 = new BaiTap38_HangSanXuat("AAA",qg1);
        BaiTap38_HangSanXuat hsx2 = new BaiTap38_HangSanXuat("AAA",qg2);
        BaiTap38_HangSanXuat hsx3 = new BaiTap38_HangSanXuat("AAA",qg3);

        BaiTap38_MayTinh mt1=new BaiTap38_MayTinh(100,30,qg1,hsx1);
        BaiTap38_MayTinh mt2=new BaiTap38_MayTinh(200,20,qg2,hsx2);
        BaiTap38_MayTinh mt3=new BaiTap38_MayTinh(50,22,qg3,hsx3);

        System.out.println("So Sanh Gia mt1 < mt2 : "+mt1.Kiemtragiamaytinh(mt2));
        System.out.println("So Sanh Gia mt1 > mt3 : "+mt1.Kiemtragiamaytinh(mt3));
        System.out.println("Ten quoc gia mt1 : "+mt1.Laytenquocgia());
        System.out.println("Ten quoc gia mt2 : "+mt2.Laytenquocgia());
    }
}
