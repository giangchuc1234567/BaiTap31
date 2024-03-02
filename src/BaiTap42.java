public class BaiTap42 {
    public static void main(String[] args) {
        System.out.println("Con Cho:");
        BaiTap42_Dog dog = new BaiTap42_Dog();
        dog.Eat();
        dog.Makesound();
        System.out.println("Con Chim:");
        BaiTap42_Bird bird = new BaiTap42_Bird();
        bird.Eat();
        bird.Makesound();
    }
}
