package pract6.FactoryMethod;

public class SimpleCoffeeFactory {
    public Coffee createCoffee (CoffeeType type) {
        Coffee coffee = null;

        switch (type) {
            case Americano:
                coffee = new Americano();
                break;
            case Espresso:
                coffee = new Espresso();
                break;
            case Cappuccino:
                coffee = new Cappuccino();
                break;
            case Latte:
                coffee = new CaffeLatte();
                break;
        }
        return coffee;
    }
}