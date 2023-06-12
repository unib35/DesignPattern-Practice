package factory_pattern.factory_method_pattern;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    protected List<String> toppings = new ArrayList<>();
    protected String name;
    protected String dough;
    protected String sauce;

    public void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        toppings.forEach(topping->{
            System.out.println("    " + topping);
        });
    }

    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        toppings.forEach(topping->{
            display.append(topping + "\n");
        });
        return display.toString();
    }
}
