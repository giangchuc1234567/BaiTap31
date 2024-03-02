public class BaiTap30_MyDate {

    private  int day;
    private  int month;
    private  int year;

    public BaiTap30_MyDate(int d, int m, int y){
        this.day=d;
        this.month=m;
        this.year=y;
    }

    public  void PrintlDay(){
        System.out.println("Day : "+this.day);
    }
    public  void Printlmonth(){
        System.out.println("Month : "+this.month);
    }
    public  void Printlyear(){
        System.out.println("Year : "+this.year);
    }
    public  void PrintlDate(){
        System.out.println("Day : "+this.day+"Month : "+this.month+"Year : "+this.year);
    }
}
