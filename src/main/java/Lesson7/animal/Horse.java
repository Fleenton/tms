package Lesson7.animal;

public class Horse extends Animal {
    private int hoofSize;

    public Horse() {
    }

    public Horse(String name, String food, String location, int hoofSize) {
        super(name, food, location);
        this.hoofSize = hoofSize;
    }

    public int getHoofSize() {
        return hoofSize;
    }

    public void setHoofSize(int hoofSize) {
        this.hoofSize = hoofSize;
    }

    @Override
    public void makeNoise() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ржот");
        System.out.println(builder);
    }

    @Override
    public void eat() {
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ест из корыта ").append(food);
        System.out.println(builder);
    }


    @Override
    public String toString() {
        return "Лошадь с размером копыт "+hoofSize;
    }
}
