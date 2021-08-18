package Lesson11.test;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> country = new ArrayList<>();
        country.add("Belarus");
        country.add("Italy");
        country.add("Germany");
        country.add("Spain");
        country.add("England");
        System.out.println(country);
        country.remove("Germany");
        System.out.println(country);
        country.remove(1);
        System.out.println(country);
        country.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(country);
        country.set(0, "Russia");
        System.out.println(country);
        boolean isContain = country.contains("Belarus");
        System.out.println(isContain);

        List<String> country1 = new ArrayList<>();
        country1.add("Finland");
        country1.add("Poland");

        country.addAll(country1);
        System.out.println(country);

        Set<String> countrys = new TreeSet<>();
        countrys.add("Belarus");
        countrys.add("Italy");
        countrys.add("Germany");
        countrys.add("Spain");
        countrys.add("England");
        System.out.println(countrys);

        List<Movie> movie = new ArrayList<>();
        movie.add(new Movie(1,"Green mile"));
        movie.add(new Movie(2,"Green mile"));
        movie.add(new Movie(3,"Titanic"));
        movie.add(new Movie(4,"Five`s element"));
        movie.add(new Movie(5,"ScareFace"));
        Comparator comparator = new MovieComparatorByName();
        Comparator comparator1 = new MovieComparatorById();
        movie.sort(comparator.thenComparing(comparator1));
        //System.out.println(movie);
        //movie.sort(comparator1);
        System.out.println(movie);
    }
}
