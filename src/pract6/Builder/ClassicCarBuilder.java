package pract6.Builder;

public class ClassicCarBuilder implements CarBuilder {

    private String chassis;
    private String body;
    private String paint;
    private String interior;

    public ClassicCarBuilder() {
        super();
    }

    @Override
    public CarBuilder fixChassis() {
        System.out.println("Сборка шасси классической модели");
        this.chassis = "Класические шасси";
        return this;
    }

    @Override
    public CarBuilder fixBody() {
        System.out.println("Сборка кузова классической модели");
        this.body = "Класический кузов";
        return this;
    }

    @Override
    public CarBuilder paint() {
        System.out.println("Покраска кузова классической модели");
        this.paint = "Класическая краска";
        return this;
    }

    @Override
    public CarBuilder fixInterior() {
        System.out.println("Оформление салона классической модели");
        this.interior = "Классический интерьер";
        return this;
    }

    @Override
    public Car build() {
        Car car = new Car(chassis, body, paint, interior);
        if (car.doQualityCheck()) {
            return car;
        } else {
            System.out.println("Созданный автомобиль не валиден");
        }
        return null;
    }

}