public class BaiTap42_Animal {
    private String name;

    public BaiTap42_Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Eat(){
        System.out.println("Ăn xương");
    }
    public  void  Makesound (){
        System.out.println("Gâu gâu");
    }
}
