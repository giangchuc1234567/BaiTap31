public class BaiTap43 {
    public static void main(String[] args) {
        BaiTap43_MyMath mm = new BaiTap43_MyMath();
        System.out.println("Tim Min 3 va 2 : "+mm.TimMin(3,2));
        System.out.println("Tim Max 3.2 va 2 : "+mm.TimMax(3.2,2));
        System.out.println("Tong 3.2 va 2 : "+mm.Tinhtong(3.2,2));
        double[] a = new double[]{1,2,3,4,5};

        System.out.println("Tong trong chuoi = "+mm.TinhtongMang(a));
    }
}
