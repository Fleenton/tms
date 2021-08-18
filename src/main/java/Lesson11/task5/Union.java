package Lesson11.task5;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second){
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(first);
        unionSet.addAll(second);
        return unionSet;
    }
}
