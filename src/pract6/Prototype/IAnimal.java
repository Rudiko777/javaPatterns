package pract6.Prototype;

public interface IAnimal{
    void setName(String name);
    String getName();
    IAnimal clone();
}
