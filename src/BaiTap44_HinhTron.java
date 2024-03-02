public class BaiTap44_HinhTron extends BaiTap44_Hinh{
    private double r;

    public BaiTap44_HinhTron(BaiTap44_ToaDo toado, double r) {
        super(toado);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double Tinhdientich() {
        return Math.PI*this.r*this.r;
    }
}
