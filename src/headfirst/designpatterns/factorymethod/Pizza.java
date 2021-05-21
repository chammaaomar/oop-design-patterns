package headfirst.designpatterns.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    List<String> toppings = new ArrayList<>();
    public void prepare() {
        System.out.println("Preparing: " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping: toppings) {
            System.out.println("   " + topping);
        }

    }
    public void bake() {
        System.out.println("⏰🔥🔥");
    }
    public void cut() {
        System.out.println("🔪🔪");
    }
    public void box() {
        System.out.println("🥊 oops wrong box: 📦");
    }

    public String getName() {
        return name;
    }
}
