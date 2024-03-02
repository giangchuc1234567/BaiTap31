public class BaiTap38_HangSanXuat {
    private String Tenhangsx;
    private BaiTap38_QuocGia quocgia;

    public BaiTap38_HangSanXuat(String tenhangsx, BaiTap38_QuocGia quocgia) {
        Tenhangsx = tenhangsx;
        this.quocgia = quocgia;
    }

    public String getTenhangsx() {
        return Tenhangsx;
    }

    public void setTenhangsx(String tenhangsx) {
        Tenhangsx = tenhangsx;
    }

    public BaiTap38_QuocGia getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(BaiTap38_QuocGia quocgia) {
        this.quocgia = quocgia;
    }
}
