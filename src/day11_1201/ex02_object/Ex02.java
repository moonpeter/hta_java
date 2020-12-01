package day11_1201.ex02_object;

public class Ex02 {
    public static void main(String[] args) {
        Circle obj1 = new Circle(5);
        Circle obj2 = new Circle(15);

        System.out.println(obj1.toString());
        System.out.println(obj1);

        System.out.println(obj2.toString());
        System.out.println(obj2);


        if(obj1.equals(obj2)){
            System.out.println("ojb1.equals(obj2) : 같음");
        } else {
            System.out.println("ojb1.equals(obj2) : 다름");
        }

        if(obj1 == obj2){
            System.out.println("ojb1.equals(obj2) : 같음");
        } else {
            System.out.println("ojb1.equals(obj2) : 다름");
        }
    }
}
