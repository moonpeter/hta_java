package day06_1124.student;

public class Ex01 {
    public static void main(String args[]) {
        Student obj1 = new Student("강호동", 85, 60, 70);
        Student obj2 = new Student("이승기", 90, 95, 80);
        Student obj3 = new Student("유재석", 75, 80, 100);
        Student obj4 = new Student("하하하", 80, 70, 95);
        Student obj5 = new Student("이광수", 100, 65, 80);

        int total[] = new int[3];
        total[0] = obj1.kor + obj2.kor + obj3.kor + obj4.kor + obj5.kor;
        total[1] = obj1.eng + obj2.eng + obj3.eng + obj4.eng + obj5.eng;
        total[2] = obj1.math + obj2.math + obj3.math + obj4.math + obj5.math;

        System.out.print("이름" + "\t\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\n");
        System.out.println("============================");
        print(obj1);
        print(obj2);
        print(obj3);
        print(obj4);
        print(obj5);
        System.out.println("============================");
        System.out.print("총점\t\t" + total[0] + "\t" + total[1] + "\t" + total[2]);
    }

    static void print(Student obj){
        System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t");
        System.out.printf("%.1f\n", obj.getAverage());
    }

}
