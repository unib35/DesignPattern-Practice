package factory.abstract_factory_pattern;

public class PizzaIngredientFactory {

    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    List<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clams createClam();
}
