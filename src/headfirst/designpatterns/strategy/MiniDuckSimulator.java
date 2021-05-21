package headfirst.designpatterns.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.display();
        model.performQuack();
        model.performFly(); // can't fly
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
