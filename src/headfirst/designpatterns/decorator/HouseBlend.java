package headfirst.designpatterns.decorator;

public class HouseBlend extends Beverage {
    @Override
    public String description() {
        return "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
