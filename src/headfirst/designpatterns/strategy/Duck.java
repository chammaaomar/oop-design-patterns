package headfirst.designpatterns.strategy;

public abstract class Duck {
    public Duck() {}

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public abstract void display();
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    // setter: dynamically change behavior at runtime
    public void setFlyBehavior(FlyBehavior newFly) {
        flyBehavior = newFly;
    }

    // setter
    public void setQuackBehavior(QuackBehavior newQuack) {
        quackBehavior = newQuack;
    }
}
