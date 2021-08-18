package Lesson7.com.company.professions;

public class Person extends Driver{
    private int age;

    public Person() {
    }

    public Person(String name, double drivingExperience, int age) {
        super(name, drivingExperience);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
