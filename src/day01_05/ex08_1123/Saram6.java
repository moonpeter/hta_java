package day01_05.ex08_1123;

public class Saram6 {
    String name;
    double w;
    double ki;
    int age;

    Saram6(String name, int w, int ki, int age) {
        this.name = name;
        this.w = w;
        this.ki = ki;
        this.age = age;
    }

    public void eat() {
        System.out.println(name + "이(가) 밥을 먹는다.");
    }

    public void walk() {
        System.out.println(name + "이(가) 걷는다.");
    }

    public void sesu() {
        System.out.println(name + "이(가) 세수한다.");
    }
}
