package Lesson5.transport;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------ЛЕГКОВОЙ НАЗЕМНЫЙ ТРАНСПОРТ----------");
        LandLight landLight = new LandLight(330, 260, 4, "Audi", 4, 8);
        landLight.setBodyType("Купе");
        landLight.setCapacity(4);
        landLight.displayInfo();
        landLight.setTime(2.1);
        landLight.info();
        System.out.println();
        System.out.println("----------ГРУЗОВОЙ НАЗЕМНЫЙ ТРАНСПОРТ----------");
        LandFreight landFreight = new LandFreight(440, 150, 2, "MAN", 8, 25);
        landFreight.setLifting(10);
        landFreight.displayInfo();
        landFreight.maxLifting(11);
        System.out.println();
        System.out.println("----------ГРАЖДАНСКИЙ ВОЗДУШНЫЙ ТРАНСПОРТ----------");
        AirCivil airCivil = new AirCivil(30000, 1000, 185, "Boeing", 64.5, 3300);
        airCivil.setCapacity(200);
        airCivil.setBusinessClass(true);
        airCivil.displayInfo();
        airCivil.setMaxCapacity(190);
        System.out.println();
        System.out.println("----------ВОЕННЫЙ ВОЗДУШНЫЙ ТРАНСПОРТ----------");
        AirMilitary airMilitary = new AirMilitary(25000, 2400, 25, "СУ-27", 14.7, 700);
        airMilitary.setSystemCatapult(true);
        airMilitary.setNumberOfMissiles(0);
        airMilitary.displayInfo();
        airMilitary.shot();
        airMilitary.catapulting();
    }
}
