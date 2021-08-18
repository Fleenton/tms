package Lesson11.task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TaskFour {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите набор числе через запятую: ");
            String numbers = reader.readLine();
            String[] numberArrays = numbers.split(",");
            Set<String> original = new HashSet<>();
            Set<String> duplicates = new HashSet<>();
            for (String str : numberArrays) {
                if (original.contains(str)){
                    duplicates.add(str);
                }
                else
                    original.add(str);
            }
            for (String orig : original) {
                System.out.print(orig + " ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
