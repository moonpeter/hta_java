package day11_1201.ex01_excpetion;

public class InvalidInputException extends Exception{
    InvalidInputException() {
        // 슈퍼 클래스의 생성자를 호출하여 에러 메시지를 저장합니다.
        super("잘못된 입력입니다.");
    }
}
