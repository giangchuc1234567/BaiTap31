public class BaiTap40_Animal {
    private String name;
    public BaiTap40_Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("Ăn");
    }
    public void ngu(){
        System.out.println("Ngủ");
    }

}
