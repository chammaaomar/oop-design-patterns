package headfirst.designpatterns.abstractfactory;

// The concrete Pizza classes no longer know about the regional
// differences. The regional knowledge is encapsulated in the concrete
// ingredient factories, which are composed with Pizza classes.
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }
    @Override
    void prepare() {
        System.out.println("Preparing" + name);
        cheese = ingredientFactory.createCheese();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
    }
}
