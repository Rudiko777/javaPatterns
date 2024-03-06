package pract6.AbstractFactory;

public class LandAnimal extends Animal {
    LandAnimal(AnimalType type, AnimalEra era, String name) {
        super(type, era, name);
    }

    @Override
    void create() {
        System.out.println("Создано наземное животное");
    }
}