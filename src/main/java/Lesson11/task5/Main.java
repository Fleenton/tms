package Lesson11.task5;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> first = new TreeSet<>();
        Set<Integer> second = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            first.add(i+1);
        }
        for (int i = 5; i < 15; i++) {
            second.add(i+1);
        }
        System.out.print(first + " ");
        System.out.println();
        System.out.print(second + " ");
        System.out.println();
        System.out.println("======================");
        System.out.print(Union.union(first,second));
        System.out.println();
        System.out.println("======================");
        System.out.println(Intersect.intersect(first, second));
    }
}
