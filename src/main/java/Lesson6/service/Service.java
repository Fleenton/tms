package Lesson6.service;

public class Service {
    public static void infoArray (double [] array){
        for(double i: array){
            String format = String.format("%.2f", i);
            System.out.print(format + " | ");
        }
        System.out.println();
    }
}
