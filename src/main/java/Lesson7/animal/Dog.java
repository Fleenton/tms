package Lesson7.animal;

public class Dog extends Animal {
    private String breed;

    public Dog() {
    }

    public Dog(String name, String food, String location, String breed) {
        super(name, food, location);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" лает");
        System.out.println(builder);
    }

    @Override
    public void eat() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ест из миски ").append(food);
        System.out.println(builder);
    }

    @Override
    public String toString() {
        return "Собака породы "+breed;
    }
}
