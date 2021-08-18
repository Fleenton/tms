package TaskString.task1;

public class Main {
    public static void main(String[] args) {
        StringTaskOne stringTaskOne = new StringTaskOne();
        stringTaskOne.setTest("I like Java!!!");
        System.out.println(stringTaskOne.getTest().charAt(13));
        System.out.println(stringTaskOne.getTest().endsWith("!!!"));
        System.out.println(stringTaskOne.getTest().startsWith("I like"));
        System.out.println(stringTaskOne.getTest().contains("Java"));
        System.out.println(stringTaskOne.getTest().indexOf("Java"));
        System.out.println(stringTaskOne.getTest().replace("a", "o"));
        System.out.println(stringTaskOne.getTest().toUpperCase());
        System.out.println(stringTaskOne.getTest().toLowerCase());
        System.out.println(stringTaskOne.getTest().substring(7,11));
    }
}
