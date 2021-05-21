package headfirst.designpatterns.strategy;

public class FlyRocketPowered implements FlyBehavior{
    public void fly() {
        System.out.println("Woohoo I'm flying with a \uD83D\uDE80"); // rocket emoji
    }
}
