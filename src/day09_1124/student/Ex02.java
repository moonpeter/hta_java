package day09_1124.student;

public class Ex02 {
    public static void main(String args[]) {
        Student2 obj1 = new Student2("강호동", 85, 60, 70);
        Student2 obj2 = new Student2("이승기", 90, 95, 80);
        Student2 obj3 = new Student2("유재석", 75, 80, 100);
        Student2 obj4 = new Student2("하하하", 80, 70, 95);
        Student2 obj5 = new Student2("이광수", 100, 65, 80);
        Student2[] students = {obj1, obj2, obj3, obj4, obj5};

        sort(students);

        int total[] = new int[3];

        for (int i=0; i<students.length; i++){
            total[0] += students[i].kor;
            total[1] += students[i].eng;
            total[2] += students[i].math;
        }

        System.out.print("이름" + "\t\t" + "국어" + "\t" + "영어" + "\t" + "수학" + "\t" + "총점" + "\t" + "평균" + "\n");
        System.out.println("============================");

        for (int i=0; i<students.length; i++){
            print(students[i]);
        }

        System.out.println("============================");
        System.out.print("총점\t\t" + total[0] + "\t" + total[1] + "\t" + total[2]);
    }

    static void print(Student2 obj){
        System.out.print(obj.name + "\t" + obj.kor + "\t" + obj.eng + "\t" + obj.math + "\t" + obj.getTotal() + "\t");
        System.out.printf("%.1f\n", obj.getAverage());
    }

    static void sort(Student2[] students) {
        int indexMin, tmp;
        Student2 temp;
        for(int i=0; i<students.length -1; i++) {
            indexMin = i;
            for(int j=i+1; j<students.length; j++) {
                if(students[j].getTotal() > students[indexMin].getTotal()){
                    indexMin = j;
                }
            }
            temp = students[indexMin];
            students[indexMin] = students[i];
            students[i] = temp;
        }
    }
}
