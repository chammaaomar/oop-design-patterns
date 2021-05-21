package headfirst.designpatterns.strategy;

public class MallardDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Yup that's me \uD83E\uDD86");
    }

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
