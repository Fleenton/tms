package Lesson11.task6;

import Lesson11.task1_3.HeavyBox;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<HeavyBox> contentBox = new ArrayDeque<>();
        contentBox.add(new HeavyBox("Small box one", 1));
        contentBox.add(new HeavyBox("Small box two", 2));
        contentBox.add(new HeavyBox("Small box three", 3));
        contentBox.add(new HeavyBox("Small box four", 4));
        contentBox.add(new HeavyBox("Small box five", 5));
        System.out.println(contentBox);
        System.out.println("===================");
        contentBox.offer(new HeavyBox("Small box six", 6));
        System.out.println(contentBox);
        System.out.println("===================");
        contentBox.poll();
        System.out.println(contentBox);
        contentBox.pollLast();
        System.out.println(contentBox);

    }
}
