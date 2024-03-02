import java.util.Objects;

public class BaiTap37_Ngay {
    private int Ngay,Thang,Nam;
    public BaiTap37_Ngay(int ngay, int thang, int nam ){
            this.Ngay = ngay;
            this.Thang = thang;
            this.Nam = nam;
    }

    public int getNgay() {
        return Ngay;
    }

    public void setNgay(int ngay) {
        Ngay = ngay;
    }

    public int getThang() {
        return Thang;
    }

    public void setThang(int thang) {
        Thang = thang;
    }

    public int getNam() {
        return Nam;
    }

    public void setNam(int nam) {
        Nam = nam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaiTap37_Ngay that = (BaiTap37_Ngay) o;
        return Ngay == that.Ngay && Thang == that.Thang && Nam == that.Nam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(Ngay, Thang, Nam);
    }
}
