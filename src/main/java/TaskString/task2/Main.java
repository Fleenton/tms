package TaskString.task2;

public class Main {
    public static void main(String[] args) {
        StringTaskTwo stringTaskTwo = new StringTaskTwo();
        stringTaskTwo.setNumberOne(3);
        stringTaskTwo.setNumberTwo(56);
        StringBuilder builder = new StringBuilder();
        builder.append(stringTaskTwo.getNumberOne()).append(" + ").
                append(stringTaskTwo.getNumberTwo()).append(" = ").
                append(stringTaskTwo.getNumberOne() + stringTaskTwo.getNumberTwo()).
                append("\n").
                append(stringTaskTwo.getNumberOne()).append(" - ").
                append(stringTaskTwo.getNumberTwo()).append(" = ").
                append(stringTaskTwo.getNumberOne() - stringTaskTwo.getNumberTwo()).
                append("\n").
                append(stringTaskTwo.getNumberOne()).append(" * ").
                append(stringTaskTwo.getNumberTwo()).append(" = ").
                append(stringTaskTwo.getNumberOne() * stringTaskTwo.getNumberTwo());
        System.out.println(builder);
        //System.out.println(builder.deleteCharAt(7).insert(7, "равно").deleteCharAt(23).insert(23,"равно").deleteCharAt(40).insert(40,"равно"));
        System.out.println(builder.replace(7,8,"равно").replace(23, 24, "равно").replace(40, 41, "равно"));
    }
}
