package Lesson5.person;

public class Person {
    protected int age;
    protected String name;


    public Person(){
    }

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void basicInfo(){
        System.out.println("Возрост: " + age + ";" + "Имя: " + name);
    }
}
