package ex09_1124_Circle;

public class Circle2 {

    Circle2(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = (radius * radius) * PI;
        return area;
    }

    double radius;
    final double PI = 3.14;
}
