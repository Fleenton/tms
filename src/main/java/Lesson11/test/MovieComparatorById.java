package Lesson11.test;

import java.util.Comparator;

public class MovieComparatorById implements Comparator<Movie> {
    public int compare(Movie o1, Movie o2) {
        return o1.getId()-o2.getId();
    }
}
