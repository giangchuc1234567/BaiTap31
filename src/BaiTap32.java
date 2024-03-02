public class BaiTap32 {
    public static void main(String[] args) {
        BaiTap32_Mydate md = new BaiTap32_Mydate(31,12,2023);
        System.out.println("Day : "+md.getDay());
        md.setDay(32);
        System.out.println("Day : "+md.getDay());
        md.setDay(30);
        System.out.println("Day : "+md.getDay());

        System.out.println("Month : "+md.getMonth());
        md.setMonth(13);
        System.out.println("Month : "+md.getMonth());
        md.setMonth(11);
        System.out.println("Month : "+md.getMonth());
    }
}
