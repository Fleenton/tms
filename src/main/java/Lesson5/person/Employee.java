package Lesson5.person;

public class Employee extends Person{

    private int salary;

    public Employee(){
    }

    public Employee(int age, String name, int salary){
        super(age, name);
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int zp){
        salary = zp;
    }
}
