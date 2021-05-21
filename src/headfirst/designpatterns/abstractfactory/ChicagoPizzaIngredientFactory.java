package headfirst.designpatterns.abstractfactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        Veggie veggies[] = { new Spinach(), new BlackOlives(), new EggPlant() };
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        // Chicago is inner city, so can't get fresh clams
        return new FrozenClams();
    }
}
