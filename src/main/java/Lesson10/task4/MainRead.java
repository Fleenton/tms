package Lesson10.task4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainRead {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("car.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Car [] cars = (Car[]) ois.readObject();

            for (Car auto : cars) {
                System.out.println(auto);
            }

            ois.close();
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
