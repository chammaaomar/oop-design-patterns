package headfirst.designpatterns.factory;

public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        switch (type) {
            case CHEESE -> pizza = new CheesePizza();
            case VEGGIE -> pizza = new VeggiePizza();
            case CLAM -> pizza = new ClamPizza();
            case PEPPERONI -> pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
