package day09_1124.private_field;

public class Circle2 {
    private double radius;
    final double PI = 3.14;

    Circle2(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area;
        area = (radius * radius) * PI;
        return area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
