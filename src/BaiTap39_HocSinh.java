public class BaiTap39_HocSinh extends  BaiTap39_ConNguoi {
    private String Tenlop,Tentruong;

    public BaiTap39_HocSinh(String hovaten, int namsinh, String tenlop, String tentruong) {
        super(hovaten, namsinh);
        Tenlop = tenlop;
        Tentruong = tentruong;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String tenlop) {
        Tenlop = tenlop;
    }

    public String getTentruong() {
        return Tentruong;
    }

    public void setTentruong(String tentruong) {
        Tentruong = tentruong;
    }


    public void Lambaitap(){
        System.out.println("Làm bài tập...");
    }
}
