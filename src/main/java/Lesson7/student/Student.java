package Lesson7.student;

public class Student {

    protected String firstName;
    protected String lastName;
    protected int group;
    protected double averageMark;

    public Student() {
    }

    public Student(String firstName, String lastName, int group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship(){
        int scholarship = 0;
        if (averageMark >= 5){
            scholarship = 100;
        }
        else {
            scholarship = 80;
        }
        return scholarship;
    }

    public void info(){
        StringBuilder builder = new StringBuilder();
        builder.append("Имя: ").
                append(firstName).append("\n").
                append("Фамилия: ").
                append(lastName).append("\n").
                append("Номер группы: ").
                append(group).append("\n").
                append("Средний балл: ").
                append(averageMark).append("\n").
                append("Сумма стипендии: ").
                append(getScholarship()).append("р").append("\n");
        System.out.print(builder);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }
}
