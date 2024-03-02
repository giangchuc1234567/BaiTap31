public class BaiTap39_ConNguoi {
    private String Hovaten;
    private int Namsinh;

    public BaiTap39_ConNguoi(String hovaten, int namsinh) {
        Hovaten = hovaten;
        Namsinh = namsinh;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String hovaten) {
        Hovaten = hovaten;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }

    public  void Anuong(){
        System.out.println("Ăn uống.");
    }
}
