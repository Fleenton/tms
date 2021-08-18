package Lesson7.student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Петр", "Анисимов", 227, 5.0);
        Student student1 = new Student("Артём", "Артёменко", 201, 4.7);
        Student student2 = new Student("Алиса", "Медведева", 207, 5.0);
        Student aspirant = new Aspirant("Иван", "Пупкин", 45, 4.5, "Психодиагностика");
        Student aspirant1 = new Aspirant("Ольга", "Реброва", 41, 5.0, "Фундаментальная медицина");
        Student aspirant2 = new Aspirant("Роман", "Волков", 50, 4.3, "Социальная и экономическая география");

        Student [] students = {student, student1, student2, aspirant, aspirant1, aspirant2};

        printStudents(students);
    }

    public static void printStudents(Student [] students){
        System.out.println("Информация о студентах и аспирантах:");
        for (Student student : students){
            student.info();
            System.out.println();
        }
    }
}
