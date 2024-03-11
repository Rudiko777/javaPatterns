package pract7.Composite;

public class Developer implements Employee{
    private double salary;
    private String name;

    public Developer(double salary, String name){
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setSalary(double salary) {

    }

    @Override
    public double getSalary() {
        return 0;
    }
}
