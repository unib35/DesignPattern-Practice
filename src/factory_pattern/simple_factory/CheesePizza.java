package factory_pattern.simple_factory;

public class CheesePizza extends Pizza{
    public CheesePizza(){
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
