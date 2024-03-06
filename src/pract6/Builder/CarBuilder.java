package pract6.Builder;

public interface CarBuilder {
    public CarBuilder fixChassis();
    public CarBuilder fixBody();
    public CarBuilder paint();
    public CarBuilder fixInterior();
    public Car build();
}