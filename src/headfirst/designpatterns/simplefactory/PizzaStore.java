package headfirst.designpatterns.simplefactory;

public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.factory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = this.factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
