package Lesson10.task1;

public class Service {
    public static boolean isPalindrome(String line){
        line = line.strip().toLowerCase();
        StringBuilder builder = new StringBuilder(line);
        String reverseLine = builder.reverse().toString();
        return line.equals(reverseLine);
    }
}
