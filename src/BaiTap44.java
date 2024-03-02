public class BaiTap44 {
    public static void main(String[] args) {
        BaiTap44_ToaDo td1 = new BaiTap44_ToaDo(1,2);
        BaiTap44_ToaDo td2 = new BaiTap44_ToaDo(4,5);
        BaiTap44_ToaDo td3 = new BaiTap44_ToaDo(3,2);

        BaiTap44_Hinh h1 = new BaiTap44_Diem(td1);
        BaiTap44_Hinh h2 = new BaiTap44_HinhTron(td2,4);
        BaiTap44_Hinh h3 = new BaiTap44_HinhChuNhat(td3,1,2);

        System.out.println("Dien tich Diem = " + h1.Tinhdientich());

        System.out.println("Dien tich Hinh tron = " + h2.Tinhdientich());
        System.out.println("Dien tich Hinh chu nhat = " + h3.Tinhdientich());

    }
}
