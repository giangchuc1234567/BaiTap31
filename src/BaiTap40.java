public class BaiTap40 {
    public static void main(String[] args) {
        BaiTap40_Cat cat = new BaiTap40_Cat();
        System.out.println("Cat : "+cat.getName());
        cat.eat();
        cat.ngu();

        BaiTap40_Dog dog = new BaiTap40_Dog();
        System.out.println("Dog : "+dog.getName());
        dog.eat();
        dog.ngu();
    }
}
