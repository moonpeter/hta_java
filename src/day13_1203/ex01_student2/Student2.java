package day13_1203.ex01_student2;

import java.util.ArrayList;

public class Student2 {
    private int no;
    private String name;
    private int kor, eng, math;
    private int total;
    public static int korTotal;
    public static int engTotal;
    public static int mathTotal;

    public Student2(String name, int kor, int eng, int math, int no) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.total = kor + eng + math;
        this.no = no;
        korTotal += kor;
        engTotal += eng;
        mathTotal += math;
    }

    public int getNo() {
        return no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        total += kor - this.kor;
        korTotal += kor - this.kor;
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        total += eng - this.eng;
        engTotal += eng - this.eng;
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        total += math - this.math;
        mathTotal += eng - this.math;
        this.math = math;
    }

    public static void sort(ArrayList<Student2> hs) {
        Student2 imsi;
        for (int i = 0; i < hs.size() - 1; i++) {
            for (int j = 0; j < hs.size() - 1 - i; j++) {
                if (hs.get(j).total < hs.get(j + 1).total) {
                    imsi = hs.get(j);
                    hs.set(j, hs.get(j+1));
                    hs.set(j+1, imsi);
                }
            }
        }
    }

    public String toString() {
        return no + "\t" + name + "\t" + kor + "\t" + eng + "\t" + math + "\t"
                + total + "\t" + String.format("%.1f", total / 3f);
    }

}
