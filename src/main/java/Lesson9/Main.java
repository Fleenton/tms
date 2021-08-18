package Lesson9;

public class Main {
    public static void main(String[] args) throws MyException {
        Car car = new Car("Audi", 260, 30000);
        Car car1 = new Car("BMW", 250, 29000);
        Car car2 = new Car("Mercedes", 230, 32000);
        Car [] cars = {car, car1, car2};

        for (int i = 0; i < cars.length; i++) {
            try {
                cars[i].start();
            } catch (MyException e) {
                System.out.println("Не завелся.");
            }
        }
    }
}
