package Lesson11.task1_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> contentsBox = new ArrayList<>();
        contentsBox.add(new HeavyBox("Small box one", 5));
        contentsBox.add(new HeavyBox("Small box two", 3));
        contentsBox.add(new HeavyBox("Small box three", 7));
        contentsBox.add(new HeavyBox("Small box four", 4));
        contentsBox.add(new HeavyBox("Small box five", 9));
        System.out.println("Contents big box:");
        for (HeavyBox heavyBox: contentsBox) {
            System.out.println(heavyBox + " ");
        }
        System.out.println();
        contentsBox.set(1, new HeavyBox("Small box two", 2));
        contentsBox.remove(4);

        Object[] objectsArrays = contentsBox.toArray();
        HeavyBox[] boxArrays = contentsBox.toArray(new HeavyBox[contentsBox.size()]);
        HeavyBox[] boxArrays1 = contentsBox.toArray(new HeavyBox[0]);
        System.out.println(Arrays.toString(objectsArrays));
        System.out.println(Arrays.toString(boxArrays));
        System.out.println(Arrays.toString(boxArrays1));

        contentsBox.clear();
        System.out.println(contentsBox);
        System.out.println();

        TreeSet<HeavyBox> contentsBoxSet = new TreeSet<>();
        contentsBoxSet.add(new HeavyBox("Small box one", 4));
        contentsBoxSet.add(new HeavyBox("Small box two", 3));
        contentsBoxSet.add(new HeavyBox("Small box three", 7));
        contentsBoxSet.add(new HeavyBox("Small box four", 5));
        contentsBoxSet.add(new HeavyBox("Small box five", 9));
        System.out.println("Contents big box:");
        for (HeavyBox heavyBox: contentsBoxSet) {
            System.out.println(heavyBox);
        }
    }
}
