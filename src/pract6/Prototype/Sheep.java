package pract6.Prototype;

public class Sheep implements IAnimal{
    private String name;
    public Sheep(){}
    public Sheep(Sheep donor){
        this.name = donor.name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IAnimal clone() {
        return new Sheep(this);
    }
}
