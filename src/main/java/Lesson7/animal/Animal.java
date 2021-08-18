package Lesson7.animal;

public class Animal {
    protected String name;
    protected String food;
    protected String location;

    public Animal() {
    }

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){
    }

    public void eat(){
    }

    public void sleep(){
        System.out.println("Животное спит");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
