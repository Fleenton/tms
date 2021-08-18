package Lesson5.transport;

public class AirTransport extends Transport {

    protected double wingspan;
    protected int minLength;

    public AirTransport(){
    }

    public AirTransport(int power, int maxSpeed, int weight, String brand ,double wingspan, int minLength){
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.print("Размах крыльев (м): " + wingspan + "\n" + "Минимальная длина ВПП для взлета (м): " + minLength + "\n");
    }
}
