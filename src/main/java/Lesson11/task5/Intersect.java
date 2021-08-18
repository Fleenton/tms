package Lesson11.task5;

import java.util.Set;
import java.util.TreeSet;

public class Intersect {
    public static Set<Integer> intersect(Set<Integer> first, Set<Integer> second){
        Set<Integer> intersectSet = new TreeSet<>();
        for (Integer firstArr : first) {
            for (Integer secondArr : second) {
                if (firstArr.equals(secondArr)){
                    intersectSet.add(firstArr);
                }
            }
        }
        return intersectSet;
    }
}
