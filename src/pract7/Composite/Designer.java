package pract7.Composite;

public class Designer implements Employee{
    private double salary;
    private String name;

    public Designer(double salary, String name){
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }
}
