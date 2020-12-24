package day_1223.ex05_serialVersionUID_no;

import java.io.Serializable;

public class Rectangle implements Serializable {
    private static final long serialVersionUID = 1L;
    int width, height;

    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "가로 : " + width + "\n높이 : " + height;
    }

    int getArea() {return width * height;}
}
