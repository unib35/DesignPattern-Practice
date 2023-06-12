package command_pattern.hamburger;

public class Customer {
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        HamburgerChef chef = new HamburgerChef();
        Command command = new HamburgerOrder(chef);

        waitress.setCommand(command);
        waitress.takeOrder();
    }
}
