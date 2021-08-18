package Lesson5.transport;

public class AirCivil extends AirTransport{

    private int capacity;
    private boolean businessClass;
    private int maxCapacity;

    public AirCivil(){
    }

    public AirCivil(int power, int maxSpeed, int weight, String brand ,double wingspan, int minLength){
        super(power, maxSpeed, weight, brand, wingspan, minLength);
    }

    public void setCapacity(int capa) {
        capacity = capa;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setBusinessClass(boolean business) {
        businessClass = business;
    }

    public boolean getBusinessClass(){
        return businessClass;
    }

    public void setMaxCapacity(int maxCapacity1){
        maxCapacity = maxCapacity1;
        if (maxCapacity<capacity){
            System.out.println("Все пассажиры займут свои места");
        }
        else {
            System.out.println("Вместимость самолета " + capacity + " человек, все пассажиры не влезут в самолет, нужен самолет побольше");
        }
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Вместимость: " + getCapacity() + "\n" + "Наличие бизнесс класса (true/false): " + getBusinessClass());
    }
}
