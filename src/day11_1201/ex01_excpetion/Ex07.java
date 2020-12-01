package day11_1201.ex01_excpetion;

public class Ex07 extends InvalidInputException {
    public static void main(String[] args) {
        try {
            int result = substract(5, 100);
            System.out.println(result);
        }
        catch (InvalidInputException e) {
            System.err.println(e.getMessage());
        }
    }

    static int substract(int a, int b) throws InvalidInputException {
        if (a < b) {
            throw new InvalidInputException();
        }
        return a - b;
    }
}
