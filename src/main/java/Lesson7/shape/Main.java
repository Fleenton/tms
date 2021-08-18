package Lesson7.shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("синего", 5, 10);
        Rectangle rectangle = new Rectangle("черного", 15, 30);
        Shape [] shapes = {circle, rectangle};

        for (Shape shape: shapes) {
            shape.draw();
        }
    }
}
