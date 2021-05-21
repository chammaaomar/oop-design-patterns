package headfirst.designpatterns.abstractfactory;

import headfirst.designpatterns.abstractfactory.Pizza;
import headfirst.designpatterns.abstractfactory.PizzaType;

public abstract class PizzaStore {
    // final to enforce QA
    // ensuring franchisees use standardized process for optimal pizza
    public final Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(PizzaType type);
}
