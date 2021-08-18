package Lesson5.person;

public class Broker extends Person{

    private int bonus;

    public Broker(){
    }

    public Broker(int age, String name, int bonus){
        super(age, name);
        this.bonus = bonus;
    }

    public int getBonus(){
        return bonus;
    }

    public void setBonus(int bon){
        bonus = bon;
    }
}
