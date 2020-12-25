package day_1224.ex01_server;

import java.io.*;
import java.net.Socket;

public class ClientEx01 {
    public static void main(String[] args) {
        System.out.println("여기는 클라이언트입니다.");
        Socket socket = null;
        try {
//            socket = new Socket("127.0.0.1", 9000);
            socket = new Socket("192.168.0.24", 9000);

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            writer.println("Hello, Server2");
            writer.flush();

            String str = reader.readLine();
            System.out.println(str);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (Exception e) {
                System.out.println("소켓 닫는 중에 에러 발생");
           }
        }
    }
}
