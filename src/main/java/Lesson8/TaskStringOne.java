package Lesson8;

public class TaskStringOne {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Я изучаю язык программирования Java");
        int start = 31;
        int end = 35;
        char[] interval = new char[end - start];
        builder.getChars(start, end, interval, 0);
        System.out.println(interval);
    }
}
