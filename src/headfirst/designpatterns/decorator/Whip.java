package headfirst.designpatterns.decorator;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return beverage.description() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
