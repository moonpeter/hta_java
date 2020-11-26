package day07_1125.ex05_student;

public class Student2 {
    String name;
    int kor, eng, math;
    static int korTotal, engTotal, mathTotal;

    public Student2(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        korTotal += kor;
        engTotal += eng;
        mathTotal += math;
    }

    public int getTotal() {
        return kor + eng + math;
    }

    public float getAverage() {
        return (getTotal() / 3f);
    }

}
