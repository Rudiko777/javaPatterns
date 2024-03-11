package pract7.Composite;

import java.util.ArrayList;
import java.util.List;

public class Organization {
    private List<Employee> employees = new ArrayList();
    public void addEmployee(Employee employee){
        this.employees.add(employee);
        System.out.println(employees);
    }

    public double getEmployeesSalary(){
        double count = 0;
        for (int i = 0; i < employees.size(); i++){
            count += employees.get(i).getSalary();
        }
        return count;
    }
}
