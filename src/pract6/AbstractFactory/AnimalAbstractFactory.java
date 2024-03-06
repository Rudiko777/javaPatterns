package pract6.AbstractFactory;

public class AnimalAbstractFactory {
    Animal animal;

    public Animal createAnimal() {
        AnimalEra era = getEra();

        switch (era) {
            case MESOZOIC:
                animal = new MesozoicAnimalFactory().makeLandAnimal("John");
                break;
            case CENOZOIC:
                animal = new CenozoicAnimalFactory().makeSkyAnimal("Avdotia");
                break;
        }

        return animal;
    }

    AnimalEra getEra() {
        return AnimalEra.MESOZOIC;
    }
}
