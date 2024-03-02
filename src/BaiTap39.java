public class BaiTap39 {
    public static void main(String[] args) {
        System.out.println("Kiểm");
        BaiTap39_ConNguoi cn = new BaiTap39_ConNguoi("Nguyễn A",2000);
        cn.Anuong();

        BaiTap39_HocSinh hs = new BaiTap39_HocSinh("Hoàng B",1999,"Lop C","Truong D");
        hs.Anuong();
        hs.Lambaitap();
    }
}
