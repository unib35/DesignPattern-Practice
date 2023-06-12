package factory.abstract_factory_pattern;

import factory.abstract_factory_pattern.ingredients.cheese.Cheese;
import factory.abstract_factory_pattern.ingredients.cheese.MozzarellaCheese;
import factory.abstract_factory_pattern.ingredients.clams.Clams;
import factory.abstract_factory_pattern.ingredients.dough.Dough;
import factory.abstract_factory_pattern.ingredients.dough.ThickDough;
import factory.abstract_factory_pattern.ingredients.pepperoni.Pepperoni;
import factory.abstract_factory_pattern.ingredients.pepperoni.SlicedPepperoni;
import factory.abstract_factory_pattern.ingredients.sauce.PlumTomatoSauce;
import factory.abstract_factory_pattern.ingredients.sauce.Sauce;
import factory.abstract_factory_pattern.ingredients.veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public class ChicagoPizzaIngredientFacotry implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThickDough();
    }
    public Sauce createSauce(){
        return new PlumTomatoSauce();
    }
    public Cheese createCheese(){
        return new MozzarellaCheese();
    }

    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<Veggies>();
        veggies.add(new BlackOlives());
        veggies.add(new Spinach());
        veggies.add(new EggPlant());
        return veggies;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FrozenClams();
    }
}
