package headfirst.designpatterns.factorymethod;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Omar ordered a " + pizza.getName() + "\n");
    }
}
