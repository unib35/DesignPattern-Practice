package singleton_pattern.chocolate;

public class ChocolateBoilerController {
    public static void main(String[] args) {
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();
        System.out.println("객체 정보 : " + chocolateBoiler);
        chocolateBoiler.fill();
        chocolateBoiler.boil();
        chocolateBoiler.drain();

        ChocolateBoiler chocolateBoiler2 = ChocolateBoiler.getInstance();
        System.out.println("객체 정보 : " + chocolateBoiler2);
        chocolateBoiler2.fill();
        chocolateBoiler2.boil();
        chocolateBoiler2.drain();

    }
}
