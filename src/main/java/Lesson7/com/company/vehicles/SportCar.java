package Lesson7.com.company.vehicles;

import Lesson7.com.company.details.Engine;
import Lesson7.com.company.professions.Driver;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar() {
    }

    public SportCar(String brand, String classCar, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(brand, classCar, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
