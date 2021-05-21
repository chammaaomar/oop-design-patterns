package headfirst.designpatterns.factorymethod;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch (type) {
            case CHEESE -> {
                return new NYStyleCheesePizza();
            }
            case VEGGIE -> {
                return new NYStyleVeggiePizza();
            }
            case PEPPERONI -> {
                return new NYStylePepperoniPizza();
            }
            case CLAM -> {
                return new NYStyleClamPizza();
            }
        }
        return null;
    }
}
