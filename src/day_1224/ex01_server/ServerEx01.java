package day_1224.ex01_server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx01 {
    public static void main(String[] args) {
        System.out.println("여기는 서버 입니다!!!!!!!");

        ServerSocket serverSocket = null;
        Socket socket = null;
        try {
            serverSocket = new ServerSocket(9000);
            socket = serverSocket.accept();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter writer = new PrintWriter(socket.getOutputStream());

            String str = reader.readLine();
            System.out.println(str);
            writer.println("Hello, Client2");

            writer.flush();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
            } catch (Exception ignored) {
                System.out.println("소켓 닫는 중 에러입니다.");
            }
            try {
                serverSocket.close();
            } catch (Exception ignored) {
                System.out.println("서버 소켓 닫는 중 에러입니다.");
            }
        }
    }
}
