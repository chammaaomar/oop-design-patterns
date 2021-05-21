package headfirst.designpatterns.abstractfactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Veggie[] veggies;
    Clam clams;

    abstract void prepare();
    public void bake() {
        System.out.println("⏰🔥🔥");
    }
    public void cut() {
        System.out.println("🔪🔪");
    }
    public void box() {
        System.out.println("🥊 oops wrong box: 📦");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
