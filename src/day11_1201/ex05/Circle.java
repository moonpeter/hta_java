package day11_1201.ex05;

public class Circle implements Cloneable{
    Point p;
    double r;

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }

    public Circle clone() throws CloneNotSupportedException {
        Point p = new Point(this.p.x, this.p.y);
        return new Circle(p, this.r);
    }

    public String toString() {
        return "[p=" + p + ", r=" + r + "]";
    }
}
