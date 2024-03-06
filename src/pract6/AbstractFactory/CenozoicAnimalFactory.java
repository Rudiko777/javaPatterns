package pract6.AbstractFactory;

public class CenozoicAnimalFactory implements EraAnimalFactory{
    @Override
    public LandAnimal makeLandAnimal(String name) {
        LandAnimal animal = new LandAnimal(AnimalType.LAND, AnimalEra.CENOZOIC, name);
        System.out.println("Создано наземное животное");
        return animal;
    }

    @Override
    public SkyAnimal makeSkyAnimal(String name) {
        SkyAnimal animal = new SkyAnimal(AnimalType.SKY, AnimalEra.CENOZOIC, name);
        System.out.println("Создано летающее животное");
        return animal;
    }
}
