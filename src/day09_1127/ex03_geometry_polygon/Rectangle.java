package day09_1127.ex03_geometry_polygon;

public class Rectangle {
    public int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}
