package headfirst.designpatterns.abstractfactory;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing: " + name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
