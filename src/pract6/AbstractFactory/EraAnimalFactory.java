package pract6.AbstractFactory;

public interface EraAnimalFactory {
    LandAnimal makeLandAnimal(String name);
    SkyAnimal makeSkyAnimal(String name);
}
