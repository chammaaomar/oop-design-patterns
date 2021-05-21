package headfirst.designpatterns.strategy;

public class FlyNoWay implements FlyBehavior{
    public void fly() {
        System.out.println("🐧: Yeah bro no way I'm flying I'm too fat!");
    }
}
