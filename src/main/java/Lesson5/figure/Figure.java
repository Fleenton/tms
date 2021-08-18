package Lesson5.figure;

abstract class Figure {
    protected double x;
    protected double y;

    public Figure (){
    }


    public Figure (double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("this class Figure");
    }

    public void displayInfo(){
        System.out.println(x);
        System.out.println(y);
    }


    public abstract void setPerimeter();

    public abstract void getArea();
}
