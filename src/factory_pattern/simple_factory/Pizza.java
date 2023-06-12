package factory_pattern.simple_factory;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    protected List<String> toppings = new ArrayList<>();
    protected String name;
    protected String dough;
    protected String sauce;

    public void prepare(){
        System.out.println("Preparing " + name);
    }

    public void bake(){
        System.out.println("Baking " + name);
    }

    public void cut(){
        System.out.println("Cutting " + name);
    }

    public void box(){
        System.out.println("Boxing " + name);
    }

    public String getName(){
        return name;
    }

    public String toString(){
        StringBuilder display = new StringBuilder();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for(String topping : toppings){
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
