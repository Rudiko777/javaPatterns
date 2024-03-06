package pract6;

import pract6.AbstractFactory.AnimalAbstractFactory;
import pract6.Builder.AutomotiveEngineer;
import pract6.Builder.Car;
import pract6.Builder.CarBuilder;
import pract6.Builder.ClassicCarBuilder;
import pract6.FactoryMethod.CoffeeShop;
import pract6.FactoryMethod.CoffeeType;
import pract6.FactoryMethod.SimpleCoffeeFactory;
import pract6.Prototype.IAnimal;
import pract6.Prototype.Sheep;

public class Main {
    public static void main(String[] args) {
        //FactoryMethod
//        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
//        CoffeeShop shop = new CoffeeShop(factory);
//        shop.orderCoffee(CoffeeType.Americano);
        //AbstractFactory
//        new AnimalAbstractFactory().createAnimal();
        //Builder
//        CarBuilder builder = new ClassicCarBuilder();
//        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
//        Car car = engineer.manufactureCar();
//        if (car != null) {
//            System.out.println("======================================================================");
//            System.out.println(car);
//            System.out.println("======================================================================");
//        }
        //Prototype
//        IAnimal sheepDonor = new Sheep();
//        sheepDonor.setName("Долли");
//
//        IAnimal sheepClone = sheepDonor.clone();
//
//        System.out.println(sheepClone.getName());
//        System.out.println(sheepDonor.getName());
    }
}
