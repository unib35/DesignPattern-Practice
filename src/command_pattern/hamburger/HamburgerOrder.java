package command_pattern.hamburger;

public class HamburgerOrder implements Command{
    private HamburgerChef chef;

    public HamburgerOrder(HamburgerChef chef) {
        this.chef = chef;
    }

    public void orderUp() {
        System.out.printf("햄버거 주문서가 주방에 전달됨");
        chef.makeBurger();
    }
}
