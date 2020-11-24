package day09_1124.student;

public class Student {
    String name;
    int kor, eng, math;

    Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return (getTotal() / 3f);
    }
}
