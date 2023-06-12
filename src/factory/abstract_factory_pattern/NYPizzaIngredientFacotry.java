package factory.abstract_factory_pattern;

public class NYPizzaIngredientFacotry implements PizzaIngredientFactory{
    public Dough createDough(){
        return new ThinCrustDough();
    }
    public Sauce createSauce(){
        return new MarinaraSauce();
    }
    public Cheese createCheese(){
        return new ReggianoCheese();
    }

    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<Veggies>();
        veggies.add(new Garlic());
        veggies.add(new Onion());
        veggies.add(new Mushroom());
        veggies.add(new RedPepper());

        return veggies;
    }

    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    public Clams createClam(){
        return new FreshClams();
    }
}
