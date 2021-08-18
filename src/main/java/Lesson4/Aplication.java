package Lesson4;


public class Aplication {
    public static void main(String[] args) {
        Computer computer = new Computer("AMD Ryzen 5", "DDR4 - 16GB", "SSD - 500GB");
        computer.description();
        computer.onOff();
    }
}
