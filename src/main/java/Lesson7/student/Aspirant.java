package Lesson7.student;

public class Aspirant extends Student{

    private String scientificWork;

    public Aspirant(){
    }

    public Aspirant(String firstName, String lastName, int group, double averageMark, String scientificWork) {
        super(firstName, lastName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    public String getScientificWork() {
        return scientificWork;
    }

    public void setScientificWork(String scientificWork) {
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
        int scholarship = 0;
        if (averageMark >= 5){
            scholarship = 200;
        }
        else {
            scholarship = 180;
        }

        return scholarship;
    }

    public void info(){
        super.info();
        StringBuilder builder = new StringBuilder();
        builder.append("Тема научной работы: ").append(scientificWork).append("\n");
        System.out.print(builder);
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scientificWork='" + scientificWork + '\'' +
                '}';
    }
}
