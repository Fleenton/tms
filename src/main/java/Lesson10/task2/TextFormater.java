package Lesson10.task2;

public class TextFormater {
    public static int lineCounter(String line){
        int count;
        String [] arrayWords = line.replaceAll("^A-za-zА-Яа-я0-9", " ").strip().split("\\s+");
        count = arrayWords.length;
        return count;
    }

    public static boolean isPalindrome(String line){
        String [] arrayWords = line.replaceAll("^A-za-zА-Яа-я0-9\\s", "").split("\\s+");
        for (int i = 0; i < arrayWords.length; i++) {
            if (arrayWords[i].length()<2){
                continue;
            }
            StringBuilder builder = new StringBuilder(arrayWords[i]);
            String reverseLine = builder.reverse().toString();
            if (arrayWords[i].equals(reverseLine)){
                return true;
            }
        }
        return false;
    }
}
