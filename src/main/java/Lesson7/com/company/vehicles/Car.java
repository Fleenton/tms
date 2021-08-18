package Lesson7.com.company.vehicles;

import Lesson7.com.company.professions.Driver;
import Lesson7.com.company.details.Engine;

public class Car {
    private String brand;
    private String classCar;
    private int weight;
    public Driver driver;
    public Engine engine;

    public Car() {
    }

    public Car(String brand, String classCar, int weight, Driver driver, Engine engine) {
        this.brand = brand;
        this.classCar = classCar;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getClassCar() {
        return classCar;
    }

    public void setClassCar(String classCar) {
        this.classCar = classCar;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void start(){
        System.out.println("Поехали");
    }

    public void stop(){
        System.out.println("Останавливаемся");
    }

    public void turnRight(){
        System.out.println("Поворот направо");
    }

    public void turnLeft(){
        System.out.println("Поворот налево");
    }

    public void printInfo(){
        StringBuilder builder = new StringBuilder();
        builder.append("Марка автомобиля: ").append(brand).append("\n").
                append("Класс автомобиля: ").append(classCar).append("\n").
                append("Вес автомобиля (т): ").append(weight).append("\n").
                append("Информация о водителе:").append("\n").
                append("ФИО водителя: ").append(driver.getName()).append("\n").
                append("Водительский стаж (лет): ").append(driver.getDrivingExperience()).append("\n").
                append("Информация о моторе:").append("\n").
                append("Мощность (л.с.): ").append(engine.getPower()).append("\n").
                append("Производитель: ").append(engine.getManufacturer());
        System.out.println(builder);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
