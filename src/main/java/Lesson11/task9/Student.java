package Lesson11.task9;

import java.util.Collection;
import java.util.Map;

public class Student {
    private String name;
    private int numberGroup;
    private int numberCourse;
    private Map<String,Integer> rating;

    public Student() {
    }

    public Student(String name, int numberGroup, int numberCourse, Map<String, Integer> rating) {
        this.name = name;
        this.numberGroup = numberGroup;
        this.numberCourse = numberCourse;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public int getNumberCourse() {
        return numberCourse;
    }

    public void setNumberCourse(int numberCourse) {
        this.numberCourse = numberCourse;
    }

    public Map<String, Integer> getRating() {
        return rating;
    }

    public void setRating(Map<String, Integer> rating) {
        this.rating = rating;
    }

    public int getAverageScore() {
        int sumRating = 0;
        Collection<Integer> grades = this.rating.values();
        for (Integer integer : grades) {
            sumRating = sumRating + integer;
        }
        return sumRating / grades.size();
    }
}
