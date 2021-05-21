package headfirst.designpatterns.decorator;

public class StarBuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.description() + " $" + espresso.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);

        System.out.println(houseBlend.description() + " $" + houseBlend.cost());
    }
}
