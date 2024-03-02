public class BaiTap44_HinhChuNhat extends BaiTap44_Hinh{
    private double Chieurong,Chieucao;

    public BaiTap44_HinhChuNhat(BaiTap44_ToaDo toado, double chieurong, double chieucao) {
        super(toado);
        Chieurong = chieurong;
        Chieucao = chieucao;
    }

    public double getChieurong() {
        return Chieurong;
    }

    public void setChieurong(double chieurong) {
        Chieurong = chieurong;
    }

    public double getChieucao() {
        return Chieucao;
    }

    public void setChieucao(double chieucao) {
        Chieucao = chieucao;
    }

    @Override
    public double Tinhdientich() {
        return this.Chieucao*this.Chieurong;
    }
}
