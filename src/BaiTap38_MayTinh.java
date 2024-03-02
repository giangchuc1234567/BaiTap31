import java.util.Objects;

public class BaiTap38_MayTinh {
    private double Giaban,Thoigianbaohanh;
    BaiTap38_QuocGia quocgia;
    BaiTap38_HangSanXuat hangsanxuat;

    public BaiTap38_MayTinh(double giaban, double thoigianbaohanh, BaiTap38_QuocGia quocgia, BaiTap38_HangSanXuat hangsanxuat) {
        Giaban = giaban;
        Thoigianbaohanh = thoigianbaohanh;
        this.quocgia = quocgia;
        this.hangsanxuat = hangsanxuat;
    }

    public double getGiaban() {
        return Giaban;
    }

    public void setGiaban(double giaban) {
        Giaban = giaban;
    }

    public double getThoigianbaohanh() {
        return Thoigianbaohanh;
    }

    public void setThoigianbaohanh(double thoigianbaohanh) {
        Thoigianbaohanh = thoigianbaohanh;
    }

    public BaiTap38_QuocGia getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(BaiTap38_QuocGia quocgia) {
        this.quocgia = quocgia;
    }

    public BaiTap38_HangSanXuat getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(BaiTap38_HangSanXuat hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaiTap38_MayTinh that = (BaiTap38_MayTinh) o;
        return Double.compare(Giaban, that.Giaban) == 0 && Double.compare(Thoigianbaohanh, that.Thoigianbaohanh) == 0 && Objects.equals(quocgia, that.quocgia) && Objects.equals(hangsanxuat, that.hangsanxuat);
    }


    public boolean Kiemtragiamaytinh(BaiTap38_MayTinh maytinhkhac){
        return this.Giaban < maytinhkhac.Giaban;
    }

    public String Laytenquocgia(){
        return this.getQuocgia().getTenqg();
    }
}
