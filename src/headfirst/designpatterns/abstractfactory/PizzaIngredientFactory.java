package headfirst.designpatterns.abstractfactory;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Cheese createCheese();
    public Clam createClam();
    public Veggie[] createVeggies();
    public Pepperoni createPepperoni();
    public Sauce createSauce();
}
