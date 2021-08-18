package Lesson7.animal;

public class Cat extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String name, String food, String location, String color) {
        super(name, food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void makeNoise() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" мяукает");
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
        return color + " кот";
    }
}
