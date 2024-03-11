package pract7.Deputy;

public class LabDoor implements Door{
    @Override
    public void open() {
        System.out.println("Дверь открыта");
    }

    @Override
    public void close() {
        System.out.println("Дверь закрыта");
    }
}
