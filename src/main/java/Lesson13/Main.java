package Lesson13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String test = "Cat Cat  Cat   Cat Cat";
        String [] arrTest = test.split("\\s+");
        /*for (String st: arrTest) {
            System.out.println(st);
        }*/

        String test1 = "255"; // валидные значения -> 001, 215, 015 и т.д., невалидные -> 256, 1, 01
        Pattern pattern = Pattern.compile("([0-2]{1}[0-5]{2}){3}");
        Matcher matcher = pattern.matcher(test1);
        System.out.println(matcher.find());
    }
}
