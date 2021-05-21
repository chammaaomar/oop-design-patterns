package headfirst.designpatterns.abstractfactory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        // The ingredient factory is hard-coded as part of pizza creation
        // to ensure the franchisees don't substitute our ingredient factories with cheap ones.
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        switch (type) {
            case CHEESE -> {
                Pizza pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                return pizza;
            }
            case VEGGIE -> {
                Pizza pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                return pizza;
            }
            case CLAM -> {
                Pizza pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                return pizza;
            }
            case PEPPERONI -> {
                Pizza pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                return pizza;
            }
        }
        return null;
    }
}
