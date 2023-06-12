package factory_pattern.factory_method_pattern;

public class NYStyleVeggiePizza extends Pizza{
    public NYStyleVeggiePizza(){
        name = "NY Style Sauce and Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Veggie");
        toppings.add("Garlic");
        toppings.add("Onion");
        toppings.add("Mushroom");
        toppings.add("Red Pepper");
    }
}

