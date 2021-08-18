package Lesson7.shape;

import java.util.Objects;

public class Circle extends Shape {
    private int x;
    private int y;

    public Circle() {
    }

    public Circle(String color, int x, int y) {
        super(color);
        this.x = x;
        this.y = y;
    }

    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Рисуем круг от кординаты ").append(x).
                append(" по радиусу ").append(y).
                append(" карандашом ").append(color).append(" цвета");
        System.out.println(builder);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return x == circle.x && y == circle.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), x, y);
    }
}
