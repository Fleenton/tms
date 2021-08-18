package Lesson11.task1_3;

public class HeavyBox implements Comparable<HeavyBox> {
    private String nameObject;
    private double weight;

    public HeavyBox() {
    }

    public HeavyBox(String nameObject, double weight) {
        this.nameObject = nameObject;
        this.weight = weight;
    }

    public String getNameObject() {
        return nameObject;
    }

    public void setNameObject(String nameObject) {
        this.nameObject = nameObject;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String toString() {
        return nameObject + " weighing " + weight + " kg";
    }

    public int compareTo(HeavyBox o) {
        if (this.weight == o.weight){
            return 0;
        }
        else if (this.weight < o.weight){
            return -1;
        }
        else {
            return 1;
        }
    }
}
