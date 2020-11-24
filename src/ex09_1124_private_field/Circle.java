package ex09_1124_private_field;

public class Circle {
    private double radius;
    final double PI = 3.14;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = (radius * radius) * PI;
        return area;
    }
}
