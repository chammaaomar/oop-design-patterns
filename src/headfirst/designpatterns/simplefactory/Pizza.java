package headfirst.designpatterns.simplefactory;

public abstract class Pizza {
    public void prepare() {
        System.out.println("🔪 + 🧅 + 🍄 + 🍅 + 🍍 + 🥩 = 🍕");
    };
    public void bake() {
        System.out.println("⏰ 🔥 🔥");
    };
    public void cut() {
        System.out.println("🔪 🔪");
    };
    public void box() {
        System.out.println("🥊 oops wrong box: 📦");
    };
}
