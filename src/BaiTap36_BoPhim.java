public class BaiTap36_BoPhim {
    private String Tenphim;
    private int Namsanxuat;
    private double Giave;
    private BaiTap36_HangSanXuat Hangsanxuat;
    private BaiTap36_Ngay Ngay;

    public BaiTap36_BoPhim(String tenphim, int namsanxuat, double giave, BaiTap36_HangSanXuat hangsanxuat, BaiTap36_Ngay ngay) {
        Tenphim = tenphim;
        Namsanxuat = namsanxuat;
        Giave = giave;
        Hangsanxuat = hangsanxuat;
        Ngay = ngay;
    }

    public String getTenphim() {
        return Tenphim;
    }

    public void setTenphim(String tenphim) {
        Tenphim = tenphim;
    }

    public int getNamsanxuat() {
        return Namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        Namsanxuat = namsanxuat;
    }

    public double getGiave() {
        return Giave;
    }

    public void setGiave(double giave) {
        Giave = giave;
    }

    public BaiTap36_HangSanXuat getHangsanxuat() {
        return Hangsanxuat;
    }

    public void setHangsanxuat(BaiTap36_HangSanXuat hangsanxuat) {
        Hangsanxuat = hangsanxuat;
    }

    public BaiTap36_Ngay getNgay() {
        return Ngay;
    }

    public void setNgay(BaiTap36_Ngay ngay) {
        Ngay = ngay;
    }

    public boolean Kiemtragiaverehon(BaiTap36_BoPhim Bophimkhac){
        if(this.Giave < Bophimkhac.Giave){
            System.out.println("Phim "+this.Tenphim+" gia ve : "+this.Giave);
            System.out.println("Phim "+Bophimkhac.Tenphim+" gia ve : "+Bophimkhac.Giave);
            return true;
        }else {
            System.out.println("Phim "+this.Tenphim+" gia ve : "+this.Giave);
            System.out.println("Phim "+Bophimkhac.Tenphim+" gia ve : "+Bophimkhac.Giave);
            return false;
        }
    }

    public String Laytenhangsanxuat(){
        String ten = this.Hangsanxuat.getTenhangsanxuat();
        return ten;
    }

    public double Giavekhuyenmai(){
    double a = this.Giave-(this.Giave*10/100);
    return a;
    }
}
