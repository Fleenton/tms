package Lesson5.transport;

public class LandTransport extends Transport{

    protected int numberOfWheels;
    protected int fuelConsumption;

    public LandTransport(){
    }

    public LandTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption){
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.print("Количество колес (шт): " + numberOfWheels + "\n" + "Расход топлива (л/100км): " + fuelConsumption + "\n");
    }
}
