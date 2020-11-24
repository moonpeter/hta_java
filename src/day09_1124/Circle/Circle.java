package day09_1124.Circle;

public class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = (radius * radius) * 3.14;
        return area;
    }
}
