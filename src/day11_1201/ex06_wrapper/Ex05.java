package day11_1201.ex06_wrapper;

public class Ex05 {
    public static void main(String[] args) {
        Integer obj1  = new Integer(10);
        Integer obj2  = new Integer(10);


        if(obj1==obj2) {
            System.out.println("obj1==obj2  같음");
        } else {
            System.out.println("obj1==obj2  다름");
        }

        if(obj1.equals(obj2)) {
            System.out.println("obj1.equals(obj2) 같음");
        } else {
            System.out.println("obj1.equals(obj2) 다름");
        }
    }
}
