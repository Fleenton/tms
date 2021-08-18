package TaskString.task13;

public class StringTaskThirteen {
    public static void main(String[] args) {
        String test = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";
        String [] strings = test.split(" ");
        for (int i = 0; i < strings.length ; i++) {
            StringBuffer buffer = new StringBuffer(strings[i]);
            buffer.reverse();
            String test1 = buffer.toString();
            if (strings[i].equals(test1)){
                System.out.println(strings[i]);
            }
        }
    }
}
