public class BaiTap34 {
    public static void main(String[] args) {
        BaiTap34_Mydate md1=new BaiTap34_Mydate(11,1,2011);
        BaiTap34_Mydate md2=new BaiTap34_Mydate(22,2,2022);
        BaiTap34_Mydate md3=new BaiTap34_Mydate(22,2,2022);

        System.out.println(md1);
        System.out.println(md2);
        System.out.println(md3);

        System.out.println("So Sanh md1 - md3 : "+md1.equals(md3));
        System.out.println("So Sanh md2 - md3 : "+md2.equals(md3));

        System.out.println("Hashcode md1 : "+md1.hashCode());
        System.out.println("Hashcode md2 : "+md2.hashCode());
        System.out.println("Hashcode md3 : "+md3.hashCode());
    }
}
