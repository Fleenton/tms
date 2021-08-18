package Lesson5.transport;

public class Transport {

    protected int power;
    protected int maxSpeed;
    protected int weight;
    protected String brand;

    public Transport(){
    }

    public Transport(int power, int maxSpeed, int weight, String brand){
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public double getPowerKv() {
        return power*0.74;
    }

    public void displayInfo(){
        System.out.print("Мощность (л.с.): " + power + "\n" + "Максимальная скорость (км/ч): " + maxSpeed + "\n" + "Масса (т): " + weight + "\n" + "Марка: " + brand + "\n" + "Мощность (кВ): " + getPowerKv()  + "\n");
    }
}
