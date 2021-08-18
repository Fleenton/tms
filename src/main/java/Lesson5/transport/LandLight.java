package Lesson5.transport;

public class LandLight extends LandTransport{

    private String bodyType;
    private int capacity;
    private double time;

    public LandLight(){
    }

    public LandLight(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption){
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
    }

    public void setBodyType(String type){
        bodyType = type;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setCapacity(int capacity1){
        capacity = capacity1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setTime(double time1){
        time = time1;
        if (time1 < 0){
            System.out.println("Ошибка");
        }
    }

    public double getTime(){
        return time;
    }

    public double getDistance(){
        return time*maxSpeed;
    }

    private double getConsumption (){
        return getDistance()/100*fuelConsumption;
    }

    public void info (){
        System.out.println("За время " + getTime() + " ч, " + "автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + " проедет " + getDistance() + " км и израсходует " + getConsumption() + " литров топлива");
    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("Тип кузова: " + getBodyType() + "\n" + "Количество пассажиров: " + getCapacity());
    }
}
