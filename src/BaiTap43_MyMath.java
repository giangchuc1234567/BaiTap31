public class BaiTap43_MyMath {
    public int TimMin(int a, int b){
        if(a>b){
            return b;
        }else {
            return  a;
        }
    }
    public double TimMax(double a, double b){
        if(a>b){
            return a;
        }else {
            return  b;
        }
    }

    public double Tinhtong(double a, double b){
        return a+b;
    }
    public double TinhtongMang(double[] arr){
        double tong =0;
        for (int i=0 ; i<arr.length;i++){
            tong += arr[i];
        }
        return tong;

    }
}
