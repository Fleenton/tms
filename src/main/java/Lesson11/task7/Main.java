package Lesson11.task7;

import Lesson11.task1_3.HeavyBox;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<HeavyBox> contentsBigBox = new ArrayList<>();
        contentsBigBox.add(new HeavyBox("Small box one", 0.2));
        contentsBigBox.add(new HeavyBox("Small box two", 2));
        contentsBigBox.add(new HeavyBox("Small box three", 0.3));
        contentsBigBox.add(new HeavyBox("Small box four", 4));
        contentsBigBox.add(new HeavyBox("Small box five", 5));
        System.out.println(contentsBigBox);
        System.out.println("=============");
        System.out.println(SortByWeight.sortByWeight(contentsBigBox));
    }
}
