package factory.simple_factory;

public class PizzaStroe {
    private SimplePizzaFactory factory;
    public PizzaStroe(SimplePizzaFactory factory){
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
