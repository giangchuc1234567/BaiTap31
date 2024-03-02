public class BaiTap35_TacGia {
    private String Tentacgia;
    private BaiTap35_Ngay Ngaysinh;

    public BaiTap35_TacGia(String tentacgia, BaiTap35_Ngay ngaysinh) {
        Tentacgia = tentacgia;
        Ngaysinh = ngaysinh;
    }

    public String getTentacgia() {
        return Tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        Tentacgia = tentacgia;
    }

    public BaiTap35_Ngay getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(BaiTap35_Ngay ngaysinh) {
        Ngaysinh = ngaysinh;
    }
}
