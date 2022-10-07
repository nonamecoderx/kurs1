import java.lang.reflect.Array;
import java.util.Arrays;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private int id;
    static int counter = 1;

    public void displayId() {
        System.out.printf("Id: %d \n", id);
    }

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }

    public String getName() {
        return this.name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }




    @Override
    public String toString() {
        return this.name + " " + this.department + " " + this.salary;
    }
}










