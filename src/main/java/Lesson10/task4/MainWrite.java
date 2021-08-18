package Lesson10.task4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainWrite {
    public static void main(String[] args) {
        Car car = new Car("Audi", 260, 30000);
        Car car1 = new Car("BMW", 250, 29000);
        Car car2 = new Car("Mercedes", 230, 32000);
        Car [] cars = {car, car1, car2};

        try {
            FileOutputStream fos = new FileOutputStream("car.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(cars);
            oos.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
