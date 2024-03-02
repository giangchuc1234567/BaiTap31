public abstract class  BaiTap44_Hinh {
    protected BaiTap44_ToaDo toado;

    public BaiTap44_Hinh(BaiTap44_ToaDo toado) {
        this.toado = toado;
    }

    public BaiTap44_ToaDo getToado() {
        return toado;
    }

    public void setToado(BaiTap44_ToaDo toado) {
        this.toado = toado;
    }

    public abstract double Tinhdientich();
}
