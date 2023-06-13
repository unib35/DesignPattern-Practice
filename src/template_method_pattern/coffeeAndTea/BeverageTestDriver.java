package template_method_pattern.coffeeAndTea;

public class BeverageTestDriver {
    public static void main(String[] args) {
        CaffeineBeverage myTea = new Tea();
        myTea.prepareRecipe();

        System.out.println("\n");

        CaffeineBeverage myCoffee = new Coffee();
        myCoffee.prepareRecipe();

    }
}
