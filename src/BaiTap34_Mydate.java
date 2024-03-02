import java.util.Objects;

public class BaiTap34_Mydate {
    private int day,month,year;

    public BaiTap34_Mydate(int d, int m, int y){
        if(d>=1 && day<=31){
            this.day =d;
        }else {
            this.day =1;
        }

        if(m>=1 && m<=12){
            this.month = m;
        }else {
            this.month = 1;
        }

        if(y>0){
            this.year = y;
        }else {
            this.year = 1;
        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int d) {
        if(d>=1 && d<=31){
            this.day =d;
        }else {
            this.day =1;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int m) {
        if (m>=1 && m<=12){
            this.month = m;
        }else {
            this.month = 1;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int y) {
        if (y>=1){
            this.year = y;
        }else {
            this.year = 1;
        }

    }

    @Override
    public String toString() {
        return this.day + "/" + this.month + "/" + this.year ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        BaiTap34_Mydate that = (BaiTap34_Mydate) o;
        return day == that.day && month == that.month && year == that.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }
}
