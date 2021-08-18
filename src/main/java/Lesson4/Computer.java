package Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Computer {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private Random random = new Random();
    private String processor;
    private String memory;
    private String hardDisk;
    private int recurse = 5;
    private int state;
    private int randomNumber;
    private int number;


    public Computer() {
    }

    public Computer(String processor, String memory, String hardDisk) {
        this.processor = processor;
        this.memory = memory;
        this.hardDisk = hardDisk;
    }

    public void description() {
        System.out.println("Информация: " + "Процессор: " + processor + "; " + "Оперативная память: " + memory + "; " + "Жесткий диск: " + hardDisk);
    }

    public void onOff() {
        while (true) {
            try {
                number = Integer.parseInt(reader.readLine());
            } catch (IOException | RuntimeException e) {
                System.out.println("Ошибка");
            }
            randomNumber = random.nextInt(2);
            if (number == randomNumber) {
                if (state == 1) {
                    state = 0;
                    recurse--;
                } else {
                    state = 1;
                    recurse--;
                    System.out.println("Компьютер включен" + "\n" + "Ресурса вкл/выкл осталось: " + recurse);
                }
                while (true){
                    try {
                        number = Integer.parseInt(reader.readLine());
                    } catch (IOException e) {
                        System.out.println("Ошибка");
                    }
                    randomNumber = random.nextInt(2);
                    if (number == randomNumber){
                        if (state == 1){
                            state = 0;
                            recurse--;
                        }
                        else {
                            state = 1;
                            recurse--;
                            System.out.println("Компьютер выключен" + "\n" + "Ресурса вкл/выкл осталось: " + recurse);
                            break;
                        }
                    }
                    else {
                        System.out.println("Компьютер сгорел");
                        break;
                    }
                }

            } else {
                System.out.println("Компьютер сгорел");
                break;
            }
        }
    }
}

