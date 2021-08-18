package Lesson11.task9;

import java.util.List;

public class Print {
    public static void printStudents(List<Student> studentList){
        for (Student student: studentList) {
            System.out.println(student.getName() + " обучается на " + student.getNumberCourse() + " курсе");
        }
    }
}
