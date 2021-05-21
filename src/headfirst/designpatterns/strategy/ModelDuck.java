package headfirst.designpatterns.strategy;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("I'm a (Super)model duck 😉");
    }

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
}
