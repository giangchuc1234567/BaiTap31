public class BaiTap35_Sach {
    private String Tensach;
    private double Giaban;
    private int Namsanxuat;

    private BaiTap35_TacGia Tacgia;

    public BaiTap35_Sach(String tensach, double giaban, int namsanxuat, BaiTap35_TacGia tacgia) {
        Tensach = tensach;
        Giaban = giaban;
        Namsanxuat = namsanxuat;
        Tacgia = tacgia;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String tensach) {
        Tensach = tensach;
    }

    public double getGiaban() {
        return Giaban;
    }

    public void setGiaban(double giaban) {
        Giaban = giaban;
    }

    public int getNamsanxuat() {
        return Namsanxuat;
    }

    public void setNamsanxuat(int namsanxuat) {
        Namsanxuat = namsanxuat;
    }

    public BaiTap35_TacGia getTacgia() {
        return Tacgia;
    }

    public void setTacgia(BaiTap35_TacGia tacgia) {
        Tacgia = tacgia;
    }

    public  void  Intensach(){
        System.out.println("Ten sach : "+getTensach());
        System.out.println("Nam SX : "+getNamsanxuat());
    }

    public boolean Kiemtranamsanxuat(BaiTap35_Sach Sachkhac){
        if(this.Namsanxuat == Sachkhac.Namsanxuat){
            return  true;
        }
        else {
            return false;
        }
    }
}
