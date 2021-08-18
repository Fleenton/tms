package Lesson11.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Nick", 1, 1, Map.of("Mathematics", 3, "Literature", 4, "Physics", 4)));
        studentList.add(new Student("Mary", 1, 1, Map.of("Mathematics", 4, "Literature", 5, "Physics", 2)));
        studentList.add(new Student("Tom", 2, 2, Map.of("Astronomy", 2, "Psychology", 4, "Informatics", 2)));
        studentList.add(new Student("Anna", 2, 2, Map.of("Astronomy", 3, "Psychology", 4, "Informatics", 4)));
        studentList.add(new Student("Bob", 3, 3, Map.of("Political science", 1, "Electrical engineering", 4, "Law basics", 2)));
        studentList.add(new Student("Amy", 3, 3, Map.of("Political science", 5, "Electrical engineering", 4, "Law basics", 5)));

        Print.printStudents(studentList);
        System.out.println("====================");

        List<String> nameBadStudents = new ArrayList<>();
        List<String> nameGoodStudents = new ArrayList<>();

        for (Student students: studentList) {
            if (students.getAverageScore() < 3){
                nameBadStudents.add(students.getName());
            }
            else {
                nameGoodStudents.add(students.getName());
            }
        }

        for (String nameStudent: nameBadStudents) {
            System.out.println(nameStudent + " отчислен(а)");
        }
        System.out.println("===================");
        for (String nameStudent: nameGoodStudents) {
            System.out.println(nameStudent + " переведен(а) на дургой курс");
        }
    }
}
