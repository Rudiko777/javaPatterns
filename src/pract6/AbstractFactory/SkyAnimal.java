package pract6.AbstractFactory;

public class SkyAnimal extends Animal {
    SkyAnimal(AnimalType type, AnimalEra era, String name) {
        super(type, era, name);
    }

    @Override
    void create() {
        System.out.println("Создано летающее животное");
    }
    // Implementation for creating sky animals
}