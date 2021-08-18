package Lesson5.transport;

public class AirMilitary extends AirTransport{

    private boolean systemCatapult;
    private int numberOfMissiles;
    private int shot;
    private boolean catapulting;

    public AirMilitary(){
    }

    public AirMilitary(int power, int maxSpeed, int weight, String brand ,double wingspan, int minLength){
        super(power, maxSpeed, weight, brand, wingspan, minLength);
    }

    public void setSystemCatapult(boolean system){
        systemCatapult = system;

    }

    public boolean getSystemCatapult(){
        return systemCatapult;
    }

    public void setNumberOfMissiles(int missiles){
        numberOfMissiles = missiles;

    }

    public int getNumberOfMissiles() {
        return numberOfMissiles;

    }

   public void shot(){
        if (numberOfMissiles != 0){
            System.out.println("Ракета пошла...");
        }
        else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void catapulting(){
        if (systemCatapult == true){
            System.out.println("Катапультирование прошло успешно");
        }
        else {
            System.out.println("У вас нет такой системы");
        }

    }

    public void displayInfo() {
        super.displayInfo();
        System.out.print("Наличие системы катапультирвания (true/false): " + getSystemCatapult() + "\n" + "Количество ракет на борту (шт): " + getNumberOfMissiles() + "\n");
    }
}
