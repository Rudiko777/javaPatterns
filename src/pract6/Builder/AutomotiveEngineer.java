package pract6.Builder;

public class AutomotiveEngineer {

    private CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Инженер-автомобиль не может работать без автостроителя!");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().build();
    }

}