package Lesson7.com.company.vehicles;

import Lesson7.com.company.details.Engine;
import Lesson7.com.company.professions.Driver;

public class Lorry extends Car{
    private int lifting;

    public Lorry() {
    }

    public Lorry(String brand, String classCar, int weight, Driver driver, Engine engine, int lifting) {
        super(brand, classCar, weight, driver, engine);
        this.lifting = lifting;
    }

    public int getLifting() {
        return lifting;
    }

    public void setLifting(int lifting) {
        this.lifting = lifting;
    }
}
