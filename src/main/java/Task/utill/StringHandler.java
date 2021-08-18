package Task.utill;

public class StringHandler {
    public static boolean isContainsMoreThenTwoCh(String line, char c){
        char[] name = line.toCharArray();
        int count = 0;
        for (Character ch:name) {
            if (ch.equals(c)){
                count++;
            }
            if (count>=2){
                return true;
            }
        }
        return false;
    }
}
