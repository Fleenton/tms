package Lesson5.transport;

public class LandFreight extends LandTransport {

    private double lifting;
    private double maxLifting;

    public LandFreight(){
    }

    public LandFreight(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption){
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
    }

    public void setLifting(double lifting1){
        lifting = lifting1;
    }

    public double getLifting() {
        return lifting;
    }

    public void maxLifting(double maxLifting1){
        maxLifting = maxLifting1;
        if (maxLifting<lifting){
            System.out.println("Ваш груз загружен в грузовик");
        }
        else {
            System.out.println("Грузоподъемность данного грузовика " + lifting + " т, ваш груз не влезет, нужен грузовик побольше");
        }
    }


    public void displayInfo(){
        super.displayInfo();
        System.out.println("Грузоподъемность (т): " + getLifting());
    }
}
