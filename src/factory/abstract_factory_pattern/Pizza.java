package factory.abstract_factory_pattern;

import factory.abstract_factory_pattern.ingredients.cheese.Cheese;
import factory.abstract_factory_pattern.ingredients.clams.Clams;
import factory.abstract_factory_pattern.ingredients.dough.Dough;
import factory.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import factory.abstract_factory_pattern.ingredients.sauce.Sauce;
import factory.abstract_factory_pattern.ingredients.veggies.Veggies;

import java.util.List;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Cheese cheese;
    protected Sauce sauce;
    protected List<Veggies> veggies;
    protected Pepperoni pepperoni;
    protected Clams clam;

    public abstract void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("---- " + name + " ----\n");
        if(dough != null){
            sb.append(dough);
            sb.append("\n");
        }
        if(sauce != null){
            sb.append(sauce);
            sb.append("\n");
        }
        if(cheese != null){
            sb.append(cheese);
            sb.append("\n");
        }
        if(veggies != null){
            for(Veggies v : veggies){
                sb.append(v);
                sb.append("\n");
            }
        }
        if(pepperoni != null){
            sb.append(pepperoni);
            sb.append("\n");
        }
        if(clam != null){
            sb.append(clam);
            sb.append("\n");
        }
        return sb.toString();

    }



}
