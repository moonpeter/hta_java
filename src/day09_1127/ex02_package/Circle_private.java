package day09_1127.ex02_package;

public class Circle_private {
    int radius;

    Circle_private(int radius) {
        this.radius = radius;
    }

    double getArea() {
        return radius * radius * 3.14;
    }
}
