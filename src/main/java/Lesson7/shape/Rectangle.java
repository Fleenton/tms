package Lesson7.shape;

import java.util.Objects;

public class Rectangle extends Shape{
    private int x;
    private int y;

    public Rectangle(){
    }

    public Rectangle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Рисуем прямоугольник с боковой стороной размером ").append(x).
                append(" и продольной размером ").append(y).
                append(" карандашом ").append(color).append(" цвета");
        System.out.println(builder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x == rectangle.x && y == rectangle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
