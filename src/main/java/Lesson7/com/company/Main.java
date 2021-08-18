package Lesson7.com.company;

import Lesson7.com.company.details.Engine;
import Lesson7.com.company.professions.Driver;
import Lesson7.com.company.vehicles.Car;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Змитрухин Олег Петрович", 10.5);
        Engine engine = new Engine(340, "Audi CZSE");
        Car car = new Car("Audi A8", "Business", 4, driver, engine);

        car.printInfo();
    }
}
